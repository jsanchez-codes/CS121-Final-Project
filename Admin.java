import java.util.*;
import java.io.*;

public class Admin extends User implements HelpDesk, Serializable {

	public static void main(String[] args){
		Admin a = new Admin();
		a.login();
	} // end main
	

	public Admin(){
		this.userName = "admin";
		this.password = "password";
	} // end constructor
	
	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("Admin Menu");
		System.out.println();
		System.out.println("0) Sign Out");
		System.out.println("1) Add new user");
		System.out.println("2) Delete user");
		System.out.println();
		System.out.print("Action (0-2): ");

		String response = input.nextLine();
		return response;
	} // end menu
	
	public void start(){
	}
} // end Admin class
