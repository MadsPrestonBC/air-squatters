import java.util.LinkedList;

public class TicketSystem {

    private LinkedList<Ticket> cart;
    private Account activeAccount;

    // TODO SHOULD loggedIn BE HERE OR IN ACCOUNT?
    private boolean loggedIn = false;

    // TODO SWITCH TO TRY CATCH
    public void checkUserPass(int cofcID, String password) {
        boolean userQuery;
        // query database and store result in variable userQuery
            // if (userQuery == true) {
                // logIn();
            // }

            // if (userQuery == false) {
                // System.out.println("ACCOUNT NOT FOUND");
            // }

    }

    // TODO FILL STUFF OUT
    public boolean Payment() {
        return true;
    }
    // TODO FILL STUFF OUT
    public void createReceipt() {

    }
    // TODO FILL STUFF OUT
    public void generateTickets() {

    }

    private void setLoggedIn(boolean bool) {
        this.loggedIn = bool;
    }
    private void logIn() {
        setLoggedIn(true);
    }

    private void logOut() {
        setLoggedIn(false);
    }
}
