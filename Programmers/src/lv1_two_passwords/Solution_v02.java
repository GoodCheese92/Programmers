package lv1_two_passwords;

import java.util.ArrayList;

public class Solution_v02 {
	public String solution(String s, String skip, int index) {
		String answer = "";

		ArrayList<String> index_arr = new ArrayList<String>();
		// index_arr에 a ~ z 추가
		for (int i = 'a'; i <= 'z'; i++) {
			index_arr.add("" + (char) i);
		} // for
		System.out.println(index_arr);

		// index_arr에 skip에 있는 문자 제거
		for (int i = 0; i < skip.length(); i++) {
			index_arr.remove(skip.charAt(i) + "");
		}
		System.out.println(index_arr);

		for (int i = 0; i < s.length(); i++) {
			int num = index_arr.indexOf("" + s.charAt(i)) + index;
			if (num < index_arr.size()) {
				answer += index_arr.get(num);
			} else {
				num -= index_arr.size();
				answer += index_arr.get(num);
			}
			System.out.println(answer);
		} // for

		return answer;
	}

} // end of class
