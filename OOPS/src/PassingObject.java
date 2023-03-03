import java.util.Date;
import java.util.Scanner;

class Message {
	private String msg;
	private Date date;
	private String userId;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

class User {
	private String userId;
	private String pwd;
	private String userName;
	private byte age;
	private String city;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

class View {
	void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your ID : ");
		String userId = scanner.nextLine();
		System.out.println("Enter Your Password : ");
		String password = scanner.nextLine();
		
		System.out.println("Enter Your Name : ");
		String username = scanner.nextLine();
		
		User user = new User();
		user.setUserId(userId);
		user.setPwd(password);
		user.setUserName(username);
		
		DB db = new DB();
		//String msg = db.checkLogin(userId, password);
		//Message msg = db.checkLogin(userId, password);
		
		Message msg = db.checkLogin(user);
		System.out.println(msg.getMsg());
		System.out.println(msg.getDate());
		System.out.println(msg.getUserId());
		scanner.close();
	}
}

class DB {
	//public Message checkLogin(String userId, String password) {
	public Message checkLogin(User user) {
		//String message = "";
		//Date date = new Date();
		Message msg = new Message();
		//if(userId.equals("ram@gmail.com") && password.equals("1234")) {
		if(user.getUserId().equals("ram@gmail.com") && user.getPwd().equals("1234")) {
			//message = "Login Success...";
			msg.setMsg("Login Success");
		}
		else {
			//message = "Login Failed...";
			msg.setMsg("Login Failed...");
		}
		msg.setDate(new Date());
		msg.setUserId(user.getUserId());
		return msg;
	}
}

public class PassingObject {

	public static void main(String[] args) {
		
		View view  = new View();
		view.login();

	}

}
