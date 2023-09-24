import java.util.*;

class Account {
    private int cofcID;
    private String password;
    private String email;
    private LinkedList<String> tickets;

    public Account() {
        cofcID = 0;
        password = "";
        email = "";
        tickets = new LinkedList<String>();
    }

    public Account(int cofcID, String password, String email) {
        this.cofcID = cofcID;
        this.password = password;
        this.email = email;
        tickets = new LinkedList<String>();
    }

    public int getCofcID() {
        return this.cofcID;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCofcID(int cofcID) {
        this.cofcID = cofcID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTickets(String ticket) {
        this.tickets.add(ticket);
    }

    public void getTickets() {
        this.setTickets("Noah Kahan");
        String[] ticketArray = new String[tickets.size()];
        for(int i = 0; i < ticketArray.length; i++) {
            ticketArray[i] = tickets.get(i);
            System.out.print(ticketArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Account first = new Account();
        first.getTickets();
    }
}
