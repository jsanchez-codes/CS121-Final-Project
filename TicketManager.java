import java.util.*;
import java.io.*;

public class TicketManager implements HelpDesk {

	Admin admin = new Admin();
	TicketList tickets = new TicketList();

	public static void main(String[] args){
		new TicketManager();
	} // end main
	
	public TicketManager(){
		this.loadTickets();
		this.start();
		this.saveTickets();
	} // end constructor
	
	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Help Desk Menu");
		System.out.println();
		System.out.println("0) Exit");
		System.out.println("1) Login as admin");
		System.out.println("2) Login as user");
		System.out.println();
		System.out.print("Action (0-2): ");
		String response = input.nextLine();

		return response;
	} // end menu
	
	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				System.out.println("Admin login");
				if (this.admin.login()){
					startAdmin();
				} // end if
			} else if (response.equals("2")){
				System.out.println("User login");
				this.loginAsUser();
			} else {
				System.out.println("Invalid Action. Please enter 0, 1, or 2");
			} // end if
		} // end while
	} // end start
	
	public void startAdmin(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = admin.menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				System.out.println("Add User");
				this.addUser();
			} else if (response.equals("2")){
				System.out.println("Delete user");
				this.deleteUser();
			} // end if
		} // end while
	} // end startAdmin
	
	public void addUser(){
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String userName = input.nextLine();
		System.out.print("Password: ");
		String password = input.nextLine();
		users.add(new User(userName, password));
	} // end addUser
	
	public void loginAsUser(){
		Scanner input = new Scanner (System.in);
		System.out.print("Username: ");
		String userNameIn = input.nextLine();
		System.out.print("Password: ");
		String passwordIn = input.nextLine();
		
	} // end loginAsUser


} // end TicketManager class
