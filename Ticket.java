
import java.util.*
import java.io.*;

public class Ticket implements HelpDesk, Serializable {
	
	public static void main(String[] args){
		Ticket t = new Ticket();
		t.start();
	} // end main
	
	public Ticket(){
		this.ticket = ticket;
	} // end constructor

	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("0) Quit");
		System.out.println("1) Create New Ticket");
		System.out.println("2) Review Open Tickets");
		System.out.println();
		System.out.print("Please enter a number 0-2: ");
		String response = input.nextLine();
		return response;
	} // end menu
	
	public void start(){
		boolean keepGoing = false;
		String response;
		while(keepGoing){
			response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if (response.equals("1")){
				System.out.println("Creating new ticket...");
			} else if (response.equals("2")){
				System.out.println("Reviewing open ticket(s)...");
			} else {
				System.out.println("Please enter 0, 1, or 2");
			} // end if
		} // end while
	} // end start
	

} // end class def
