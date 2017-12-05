package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remplace {

	
	
	public static void main(String[] args) {
		String text=("un - deux - tois");
		Pattern pattern= Pattern.compile("-");
		Matcher m = pattern.matcher(text);
		 String textResult = m.replaceAll(";");
		
		System.out.println(textResult);

	}

}
