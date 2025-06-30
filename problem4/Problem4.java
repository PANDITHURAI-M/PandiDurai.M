package problem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
     	Scanner s = new Scanner(System.in);
     	List<Integer> list = new ArrayList<>();
     	System.out.println("Enter the size of array");
     	int size=s.nextInt();
     	for(int i=0;i<size;i++) {
     		System.out.println("Enter the number");
     		int userInput = s.nextInt();
     		list.add(userInput);
     	}

		Map<Integer,Integer> resultMap =totalCountOfNumbers(list);
		inputFormat(resultMap);
		
	}
	
	public static Map<Integer,Integer> totalCountOfNumbers(List<Integer> list){
		
		Map<Integer,Integer> map = new HashMap<>();
		
	   for(int i=1 ;i<=9;i++) {
		   int count =0;
		   for(int j=0;j<list.size();j++) {
			   if(list.get(j)%i==0) {
				   count++;
			   }
		   }
		   map.put(i, count);
	   }
		
		return map;
	}
	
	public static void inputFormat(Map<Integer,Integer> resultMap) {
		int size = resultMap.size();
		int count=0;
        StringBuilder s = new StringBuilder();
		
		s.append("{");
		
		for(Map.Entry<Integer, Integer> e : resultMap.entrySet()) {
			s.append(e.getKey()).append(":").append(e.getValue());
			count++;
			if(count<size) {
				s.append(",");
			}
		}
		
		s.append("}");

		
		System.out.println(s.toString());
	}
}
