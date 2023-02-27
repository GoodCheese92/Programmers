package lv1_two_passwords;

import java.lang.reflect.Array;
import java.util.Arrays;

/* 
두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.

문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
skip에 있는 알파벳은 제외하고 건너뜁니다.
예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만
[b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다. 따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는
알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다.
나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.

두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.

- 제한 사항 -
5 ≤ s의 길이 ≤ 50
1 ≤ skip의 길이 ≤ 10
s와 skip은 알파벳 소문자로만 이루어져 있습니다.
skip에 포함되는 알파벳은 s에 포함되지 않습니다.
1 ≤ index ≤ 20
*/

public class Solution {
	public static void main(String[] args) {
		Solution sl = new Solution();
		String s = "aczur";
		String skip = "wbqd";
		int index = 5;
		String answer = sl.solution(s, skip, index);
		System.out.println(answer);
	} // end of main

	public String solution(String s, String skip, int index) {
		// 0. skip에 있는 문자들을 오름차순으로 정리한다.
		// 1. index만큼 갔을 때 z를 넘든 말든 일단 skip해서 보낸다.
		// 2. z가 넘으면 1로 보내서 나머지 확인.
		String answer = "";
		char[] skip_arr = new char[skip.length()];
		// skip를 문자 배열 skip_arr로 변경
		for (int i = 0; i < skip.length(); i++) {
			skip_arr[i] = skip.charAt(i);
		} // for

		// 오름차순으로 정렬
		Arrays.sort(skip_arr);
		for (int i = 0; i < s.length(); i++) {
			int code = s.charAt(i) + index;

			for (int j = 0; j < skip_arr.length;) {
				if (skip_arr[j] < s.charAt(i)) {
					skip_arr[j] += 'z';
					Arrays.sort(skip_arr); // 바꾼 다음에 
					continue;
				}
				// 일단 index만큼 갔을 때 skip이 있으면 그만큼 더 가준다.
				if (s.charAt(i) <= skip_arr[j] && code >= skip_arr[j]) {
					code++;
				}
				j++;
			} // for

			if (code > 'z') {
				answer += (char) (code - ('z' - 'a' + 1));
			} else {
				answer += (char) (code);
			}

		} // for

		return answer;
	} // end of solution()
} // end of class
