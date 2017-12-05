package object;

import java.text.DateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		DateFormat df;
		Date date= new Date();
		df = DateFormat.getInstance();
		String s= df.format(date);
		System.out.println(s);
		
		s +=42;
		System.out.println(s);
		
		// labeled break
		z:
			for (int i = 0; i < 7; i++) {
				if(i==3)break ;
			}
		
		System.out.println(Math.E+" "+Math.PI);
		
	}

}
