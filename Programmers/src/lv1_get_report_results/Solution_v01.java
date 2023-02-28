package lv1_get_report_results;

import java.util.HashMap;
import java.util.HashSet;

public class Solution_v01 {
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        
        // 같은 사람을 많이 신고하여도 1번만 체크하게끔 set으로 각 사람마다 신고한 사람 set으로 저장
        HashSet<String> report_set[] = new HashSet[id_list.length];
        for(int i=0; i<report_set.length; i++) {
        	report_set[i] = new HashSet<String>();
        } // for
        
        HashMap<String, Integer> id_list_map = new HashMap<String, Integer>();
        for(int i = 0; i < id_list.length; i++) {
        	id_list_map.put(id_list[i], i);
        } // for
        
        
        for(int i=0; i<report.length; i++) {
        	report_set[id_list_map.get(report[i].substring(0, report[i].indexOf(" ")))]
        			.add(report[i].substring(report[i].indexOf(" ") + 1, report[i].length()));
        	
        } // for
        
        for(int i=0; i<report_set.length; i++) {
        	for(int j = 0; j<report_set[i].size(); j++) {
        		System.out.print(" ");
        	}
        }
        
        
        
        
        return answer;
    }
	
	
} // end of class
