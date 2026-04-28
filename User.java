import java.util.*;
import java.io.*;

public abstract class User implements Serializable, HelpDesk {

	String userName = "";
	String password = "";

	public void SetUser(String userName){
		this.userName = userName;
	} // end SetUser

	public String getUserName(){
		return this.userName;
	} // end getUser

	public void setPassword(String password){
		this.password = password;
	} // end setPassword

	public String getPassword(){
		return this.password;
	} // end getPassword

	public boolean login(String userNameIn, String passwordIn){
		boolean result = false;
		if (userNameIn.equals(this.userName)){
			if (passwordIn.equals(this.password)){
				result = true;
			} // end password if
		} // end userName if
		return result;
	} // end login

	public boolean login(){
		Scanner input = new Scanner(System.in);
		boolean result = false;
		System.out.print("Username: ");
		String userNameIn = input.nextLine();
		if (userNameIn.equals(this.userName)){
			System.out.print("Password: ");
			String passwordIn = input.nextLine();

			if (passwordIn.equals(this.password)){
				System.out.println("Login successful");
				result = true;
			} else {
				System.out.println("Incorrect password");
			} // end if
		} else {
			System.out.println("Username not found");
		} // end if
		return result;
	} // end login

} // end class def

