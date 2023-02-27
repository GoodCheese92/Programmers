package lv0_addition_of_fractions;

public class Main {
	public static void main(String[] args) {
		Solution sl = new Solution();
		int numer1 = 9;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 3;
		for(int i=0; i<2;i++) {
			System.out.print(sl.solution(numer1, denom1, numer2, denom2)[i] + " ");
		}
		
		
		
	} // end of main
} // end of class
