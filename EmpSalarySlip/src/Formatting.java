import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
	private Locale locale;
	
	public Formatting(String lang, String country) {
		locale = new Locale(lang, country);
	}
	
	private String initCap(String value) {
		// value = "john"
		char firstChar = value.charAt(0);	// 'j'
		String firstLetter = String.valueOf(firstChar).toUpperCase();	// 'J'
		String remainingName = value.substring(1).toLowerCase(); // "ohn"
		return firstLetter + remainingName;		// "John"
	}
	
	public String getTitleCase(String name) {
		// title case - first letter of each word is capital
		String nameArr[] = name.split(" "); // {"john", "cena"}
		String fullName = "";
		for(String s : nameArr) {
			fullName += initCap(s) + " ";
		}
		return fullName;
	}
	
	public String dateFormat(Date date) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		return df.format(date);
	}
	
	public String format(double value) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(value);
	}
}
