package collection.choibai;
/*
 *  Một lá bài trong bộ bài tây gồm 2 thuộc tính: loại bài (cơ, rô, chuồn, bích) và thứ tự quân
	bài(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A).
	Viết chương trình thực hiện các yêu cầu sau đâu:
	- Tạo lớp mô tả quân bài
	- Tạo lớp kiểm thử chứa bộ bài 52 lá bài và không được trùng nhau List<Card>
	- Thực hiện xào bài, chia bài cho 4 người chơi và in ra danh sách bài của mỗi người chơi.
 */
import java.util.List;
import java.util.Random;

public class PlayCard {
	public static void main(String[] args) {
		List<Card> cards = Card.initialListCard();
//		shuffleCards(cards);
		List<Player> players = Player.initialData();
		dealCards(cards, players);
		System.out.println(players);
	}

	public static void shuffleCards(List<Card> source) {
		source.sort((o1, o2) -> (new Random()).nextInt(2) - 1);
	}

	public static void dealCards(List<Card> cards, List<Player> players) {
		for (int i = 0; i < cards.size(); i++) {	
			for(Player player: players) {
				player.getCards().add(cards.get(i));
			}
		}
	}

}