Admin.class: Admin.java User.java
	javac -g Admin.java

HelpDesk.class: HelpDesk.java
	javac -g HelpDesk.java

Ticket.class: Ticket.java User.class
	javac -g Ticket.java

TickerManager.class: TicketManager.java Ticket.class User.class Admin.class
	javac -g TicketManager.java

User.class: User.java HelpDesk.class
	javac -g User.java

clean:
	rm *.class

run: Ticket.class
	java TicketManager

debug: Ticket.class
	jdb TicketManager

