Admin.class: Admin.java User.java
	javac -g Admin.java

HelpDesk.class: HelpDesk.java
	javac -g HelpDesk.java

Ticket.class: Ticket.java
	javac -g Ticket.java

User.class: User.java HelpDesk.class
	javac -g User.java

clean:
	rm *.class

run: Ticket.class
	java Ticket

debug: Ticket.class
	jdb Ticket

