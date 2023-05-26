package collection.chitieu;
/*
 *  Tạo cấu trúc dữ liệu lưu trữ các khoản chi tiêu trong ngày, thông tin lưu trữ dưới dạng
	key/value. Với key là thông tin khoản chi tiêu, value là số tiền đã sử dụng cho khoản chi tiêu đó.
	Viết chương trình thực hiện các chức năng sau:
	- Liệt kê thông tin các khoản chi lớn hơn 500 ngìn VNĐ
	- Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu(key).
	- Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền(value).
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		HashMap<String, Double> spends = new HashMap<>();
		spends.put("Mi tom", 30000d);
		spends.put("Ao quan", 520000d);
		spends.put("Tien dien", 530000d);
		spends.put("Tien nuoc", 610000d);
		
		loopByValue(spends);
		loopByEntry(spends);
		
		List<String> spendsByKey = new ArrayList<>(spends.keySet());
		Collections.sort(spendsByKey, Collections.reverseOrder());

		List<Double> spendsByValue = new ArrayList<>(spends.values());
		Collections.sort(spendsByValue);

		System.out.println("Sort DESC by Key: " + spendsByKey);
		System.out.println("Sort ASC by Value: " + spendsByValue);
		
		System.out.println("=====================================");
		
		System.out.println("Hiển thị cả key và value sau khi sort");
		/*
		// Chuyển từ map sang list
        ArrayList<Double> list = new ArrayList<>();
		for (Map.Entry<String, Double> entry : spends.entrySet()) {
			list.add(entry.getValue());
		}
		
		Collections.sort(list, new Comparator<Double>() {
			public int compare(Double value1, Double value2) {
				return (value1).compareTo(value2);
			}
		});
		
		// tạo HashMap, so sánh value của Map với list vừa tạo, bằng nhau thì cho vào HashMap
        LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
		for (Double value : list) {
			for (Entry<String, Double> entry : spends.entrySet()) {
				if (entry.getValue().equals(value)) {
					sortedMap.put(entry.getKey(), value);
				}
			}
		}
		*/
		
		// đổi từ Map -> Set -> List
		Set<Entry<String, Double>> entrySet = spends.entrySet();
		List<Entry<String, Double>> sortedList = new ArrayList<Map.Entry<String,Double>>(entrySet);
		
		// sort list by K,V
		
//		Collections.sort(sortedList,(v1, v2) -> v2.getValue().compareTo(v1.getValue()));
		
//		Collections.sort(sortedList, Comparator.comparing(t -> t.getValue()));
//		sortedList.sort(Comparator.comparing(t -> t.getValue()));
		
//		Collections.sort(sortedList, Comparator.comparing(Entry::getValue))
//		Collections.reverse(sortedList);

//		Collections.sort(sortedList, Comparator.comparing(Entry::getValue,
//				Comparator.reverseOrder()));
		sortedList.sort(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()));
		//transfer sortedList to Map
		Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
		for(Entry<String, Double> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);
	}

	public static void loopByValue(Map<String, Double> map) {
		Collection<Double> valuesMap = map.values();
		for(Double value: valuesMap) {
			System.out.print(value);
		}
	}
	
	public static void loopByEntry(Map<String, Double> map) {
		Set<Entry<String, Double>> entrySet = map.entrySet();
		for(Entry<String, Double> entry: entrySet) {
			System.out.print(entry.getKey() + " " + entry.getValue() + " - ");
		}
		System.out.println();
	}
}
