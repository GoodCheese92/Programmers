package lv1_two_passwords;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        char ch = 97;
        System.out.println(ch);
        System.out.println((char) 80);

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.remove("3");
        System.out.println(arr.indexOf("1"));
        System.out.println(arr);

        Solution_v02 sl2 = new Solution_v02();
        String s = "aattyyue";
        String skip = "wbqd";
        int index = 5;
        System.out.println("정답 : " + sl2.solution(s, skip, index));
    } // end of main
} // end of class
