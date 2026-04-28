# CS121-Final-Project
IT Help Desk Ticket Program

The goal of this program is for a user to be able to create a help desk ticket for any technical support. The user will be prompted to type a number based on the category, and then input a description based on the issue they are encountering. An admin will be able to use their credentials to log in and view and reslove any open tickets.

```mermaid
classDiagram

class Ticket{
    + Ticket(String category, String description)
    + main() void
    + menu() String
    + start() void
    + category: String
    + description: String
    + toString()
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
}

class TicketManager{
    - userName: String
    - password: String
    + main() void
    + TicketManager()
    + menu() String
    + start() void
    + startAdmin() void
    ArrayList Ticket
}

class Admin{
    + main() void
    + Admin()
    + menu() String
    + start() void
}
HelpDesk <|.. Admin
HelpDesk <|.. Ticket
HelpDesk <|.. TicketManager
Admin <|-- User
```

