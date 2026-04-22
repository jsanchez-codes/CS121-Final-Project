# CS121-Final-Project
IT Help Desk Ticket Program

```mermaid
classDiagram

class Ticket{
    + Ticket()
    + main() void
    + menu() String
    + start() String
    + id: String
    + title: String
    + description: String
    + priority: String
    + status: String
    + createTicket()
    + priorityQueue()
}

class HelpDesk{
    + menu() String
    + start() void
}

class User{
    - userName: String
    - password: String
    + login() boolean
    + login (userName, password) boolean
    + setUserName(userName) void
    + getUserName() String
    + setPassword(password) void
    + getPassword() String
    + getTicket() abstract String
}

class Agent{
    - userName: String
    - password: String
    + login() boolean
    + login (userName, password) boolean
    + setUserName(userName) void
    + getUserName() String
    + setPassword(password) void
    + getPassword() String
    + printTickets()
    + findTicket()
    + editTicket()
    + closeTicket()
}

class Admin{
    - userName: String
    - password: String
    + login() boolean
    + login (userName, password) boolean
    + setUserName(userName) void
    + getUserName() String
    + setPassword(password) void
    + getPassword() String
    + printTickets()
    + editTicket()
    + saveTickets()
    + editUserName()
    + getReport()
}
HelpDesk <|.. Admin
HelpDesk <|.. Ticket
Admin <|-- Agent
Admin <|-- User
```
