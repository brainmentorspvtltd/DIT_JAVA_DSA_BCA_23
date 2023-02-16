import java.util.ResourceBundle;

public class MessageResourceBundleReader {
	ResourceBundle rb;
	
	public MessageResourceBundleReader() {
		rb = ResourceBundle.getBundle("message");
	}
	
	public String getValue(String key) {
		return rb.getString(key);
	}
}
