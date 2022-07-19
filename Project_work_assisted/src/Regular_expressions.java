import java.util.regex.*;
public class Regular_expressions {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}","mous48"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","apP40"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}","$5yu&op90"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "5853038949"));
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038941"));

		String pattern = "[a-z]+";
		String check = "Milk is White";
		Pattern p = Pattern.compile(pattern);
		Matcher M = p.matcher(check);
		
		while (M.find())
	      	System.out.println( check.substring( M.start(), M.end()) );
		}


	}


