package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Bạn Huy không tập trung tư tưởng trong giờ toán vì vậy thầy giáo cho thêm bài tập về nhà
rèn luyện khả năng tập trung tư tưởng và tính cẩn thận chu đáo. Nội dung bài tập là cho n xâu
chỉ bao gồm các ký tự la tinh thường và chữ số. Đoạn các ký tự số liên tục tạo thành một số
nguyên. Ở mỗi đoạn ký tự số liên tục Huy phải trích ra số lớn nhất có thể, sắp xếp các số nhận
được từ các xâu đã cho và đưa ra theo thứ tự không giảm, mỗi số được đưa ra dưới dạng không có
các số 0 không có nghĩa.
Ví dụ: với n = 1 và xâu là 01a2b3456cde478 dãy số cần đưa ra là 1, 2, 478, 3456.
Yêu cầu: Cho số nguyên n (1 ≤ n ≤ 100) và n xâu, mỗi xâu có độ dài không quá 100. Hãy đưa ra
dãy số nhận được đã sắp xếp theo thứ tự không giảm, mỗi số trên một dòng.
 */
public class SapXepSoLayTrongChuoi {
	public static void main(String[] args) {
		String str = "Uyk892nn1234uxo2";

		str = str.replaceAll("[^0-9]+", " ");
		List<String> arr = Arrays.asList(str.trim().split(" "));
		int max = Integer.parseInt(arr.get(0));

		List<String> strList = new ArrayList<String>();

        for(String element: arr) {
        	strList.add(element);
        }
        
        Collections.sort(strList);
        strList.forEach(System.out::println);
	}
}
