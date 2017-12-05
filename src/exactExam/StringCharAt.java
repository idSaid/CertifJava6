package exactExam;

import java.util.Arrays;
import java.util.Comparator;

public class StringCharAt {

	public static void main(String[] args) {
		
		String[] words={"Good","Bad","Ugly"};
		
		Comparator<String> best = new Comparator<String>() {	
			@Override
			public int compare(String o1, String o2) {				
				return o1.charAt(1) - o2.charAt(1);
			}
		};
		
		Arrays.sort(words, best);
		System.out.println(words[0]);
		
		String s=null;
		System.out.println(s+ " ");
		
	}
	

}
