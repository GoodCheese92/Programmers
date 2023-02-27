package lv0_addition_of_fractions;

public class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

		int total_numer = numer1 * denom2 + numer2 * denom1;
		int total_denom = denom1 * denom2;

		int num1 = total_numer;
		int num2 = total_denom;
		int r = 0;
		while (true) {
			if (num1 < num2) {
				int tmp = 0;
				tmp = num2;
				num2 = num1;
				num1 = tmp;
			}

			r = num1 % num2;
			num1 = num2;
			num2 = r;

			if (r == 0) {
				break;
			}
		} // while

		total_numer /= num1;
		total_denom /= num1;
		
//		System.out.println(total_numer);
//		System.out.println(total_denom);
		answer[0] = total_numer;
		answer[1] = total_denom;
//		System.out.println(answer.length);
		return answer;
	}
} // end of class
