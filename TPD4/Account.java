import java.util.*;

/**
 * Account is the class for all accounts within the application. It requires a CofC ID 
 * integer, a password, and a valid email. It will have a LinkedList to 
 * contain all tickets purchased with the account. 
 * <p></p>
 * @author Joshua Keifer
 * @version 1.0 24 September 2023
 * <p></p>
 *
 **/

class Account {
    private int cofcID;
    private String password;
    private String email;
    private LinkedList<Ticket> tickets;

    public Account() {
        cofcID = 0;
        password = "";
        email = "";
        tickets = new LinkedList<Ticket>();
    }

    /*
     * @brief The overloaded account constructor
     * @param cofcID: College of Charleston ID number, 
     *        password: the user's password as a String,
     *        email: the user's email
     * @return n/a
     */

    public Account(int cofcID, String password, String email) {
        this.cofcID = cofcID;
        this.password = password;
        this.email = email;
        tickets = new LinkedList<Ticket>();
    }

    /*
    * @brief Returns the user's ID
    * @param n/a
    * @return cofcID
    */

    public int getCofcID() {
        return this.cofcID;
    }

    /*
     * @brief Resets the cofc ID
     * @param cofcID: a new College of Charleston ID to override the old ID
     * @return n/a
     */

    public void setCofcID(int cofcID) {
        this.cofcID = cofcID;
    }

    /*
     * @brief Returns the user's password
     * @param n/a
    * @return password
    */

    public String getPassword() {
        return this.password;
    }

    /*
     * @brief Resets the user's password
     * @param password: a new password for the user's account
     * @return n/a
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /*
     * @brief Returns the user's email
     * @param n/a
     * @return email
     */

    public String getEmail() {
        return this.email;
    }

    /*
     * @brief Resets the user's email
     * @param email: the new email for the user's account
     * @return n/a
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * @brief Prints tickets to the console and returns all tickets
     * @param n/a
     * @return tickets: a list of all tickets tied to the user
     */

    public LinkedList<Ticket> getTickets() {
        this.setTickets(new Ticket(1.0, 36,'b', "HomeGame", new Date(), false, true, this));
        String[] ticketArray = new String[tickets.size()];
        for(int i = 0; i < ticketArray.length; i++) {
            ticketArray[i] = tickets.get(i).toString();
            System.out.print(ticketArray[i] + " ");
        }

        return tickets;
    }

    /*
     * @brief Adds a ticket the user's account
     * @param ticket: will be a ticket object to be added, but is a string for now
     * @return none
     */

    public void setTickets(Ticket ticket) {
        this.tickets.add(ticket);
    }


    public static void main(String[] args) {
        Account first = new Account();
        first.getTickets();
    }
}
