

import java.awt.List;
import java.util.ArrayList;

//import com.example.servletjspdemo.web.Data;

public class User {

	
	String username;
	String password;
	String email;
	char privilage; 		//zmienna przechowująca symbol typu konta!
	
	
	public static ArrayList<String> user = new ArrayList<String>();
				  //List<String> myList = new ArrayList<String>();


	
	public User(String username, String password, String email){
		this.username = username ;
		this.password =password ;
		this.email = email;
		this.privilage = privilage;
				
	}
	
	
	public char getPrivilage() {
		return privilage;
	}


	public void setPrivilage(char privilage) {
		this.privilage = privilage;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
