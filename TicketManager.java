import java.util.*;
import java.io.*;

public class TicketManager implements HelpDesk {

	Admin admin = new Admin();
	TicketList tickets = new TicketList();
	ArrayList<String> categories = new ArrayList<>(List.of("Hardware","Software","Account","Network","Security"));	

	public static void main(String[] args){
		new TicketManager();
	} // end main
	
	public TicketManager(){
		// this.loadTickets();
		this.start();
		// this.saveTickets();
	} // end constructor
	
	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Help Desk Menu");
		System.out.println();
		System.out.println("0) Exit");
		System.out.println("1) Create a ticket");
		System.out.println("2) Login as admin");
		System.out.println();
		System.out.print("Action (0-2): ");
		String response = input.nextLine();

		return response;
	} // end menu
	
	public void start(){
		Scanner scnr = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				int categoryIndex;
				String description;

				System.out.println("What category is your technology issue: ");
				for(int i = 0; i < categories.size();i++){
					System.out.printf("%d) %s\n",i,categories.get(i));
				} // end for

				System.out.println("What category is your issue(enter number above): ");
				categoryIndex = Integer.parseInt(scnr.nextLine());

				System.out.print("Please enter a description of your issue: ");
				description = scnr.nextLine();

				tickets.add(new Ticket(categories.get(categoryIndex),description));
			} else if (response.equals("2")){
				System.out.println("Admin login");
				if (this.admin.login()){
					startAdmin();
				} // end if
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
				for(Ticket ticket: tickets){
					System.out.println(ticket.toString());
				} // end for
			} // end if
		} // end while
	} // end startAdmin

} // end TicketManager class
class TicketList extends ArrayList<Ticket> {};
