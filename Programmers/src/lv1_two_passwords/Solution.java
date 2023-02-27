package lv1_two_passwords;

import java.lang.reflect.Array;
import java.util.Arrays;

/* 
�� ���ڿ� s�� skip, �׸��� �ڿ��� index�� �־��� ��, ���� ��Ģ�� ���� ���ڿ��� ����� �մϴ�. ��ȣ�� ��Ģ�� ������ �����ϴ�.

���ڿ� s�� �� ���ĺ��� index��ŭ ���� ���ĺ����� �ٲ��ݴϴ�.
index��ŭ�� ���� ���ĺ��� z�� �Ѿ ��� �ٽ� a�� ���ư��ϴ�.
skip�� �ִ� ���ĺ��� �����ϰ� �ǳʶݴϴ�.
���� ��� s = "aukks", skip = "wbqd", index = 5�� ��, a���� 5��ŭ �ڿ� �ִ� ���ĺ��� f����
[b, c, d, e, f]���� 'b'�� 'd'�� skip�� ���ԵǹǷ� ���� �ʽ��ϴ�. ���� 'b', 'd'�� �����ϰ� 'a'���� 5��ŭ �ڿ� �ִ�
���ĺ��� [c, e, f, g, h] ������ ���� 'h'�� �˴ϴ�.
������ "ukks" ���� �� ��Ģ��� �ٲٸ� "appy"�� �Ǹ� ����� "happy"�� �˴ϴ�.

�� ���ڿ� s�� skip, �׸��� �ڿ��� index�� �Ű������� �־��� �� �� ��Ģ��� s�� ��ȯ�� ����� return�ϵ��� solution �Լ��� �ϼ����ּ���.

- ���� ���� -
5 �� s�� ���� �� 50
1 �� skip�� ���� �� 10
s�� skip�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
skip�� ���ԵǴ� ���ĺ��� s�� ���Ե��� �ʽ��ϴ�.
1 �� index �� 20
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
		// 0. skip�� �ִ� ���ڵ��� ������������ �����Ѵ�.
		// 1. index��ŭ ���� �� z�� �ѵ� ���� �ϴ� skip�ؼ� ������.
		// 2. z�� ������ 1�� ������ ������ Ȯ��.
		String answer = "";
		char[] skip_arr = new char[skip.length()];
		// skip�� ���� �迭 skip_arr�� ����
		for (int i = 0; i < skip.length(); i++) {
			skip_arr[i] = skip.charAt(i);
		} // for

		// ������������ ����
		Arrays.sort(skip_arr);
		for (int i = 0; i < s.length(); i++) {
			int code = s.charAt(i) + index;

			for (int j = 0; j < skip_arr.length;) {
				if (skip_arr[j] < s.charAt(i)) {
					skip_arr[j] += 'z';
					Arrays.sort(skip_arr); // �ٲ� ������ 
					continue;
				}
				// �ϴ� index��ŭ ���� �� skip�� ������ �׸�ŭ �� ���ش�.
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
