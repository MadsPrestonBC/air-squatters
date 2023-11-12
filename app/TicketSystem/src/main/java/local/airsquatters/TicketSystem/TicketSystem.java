package local.airsquatters.TicketSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

@SpringBootApplication
@RestController
public class TicketSystem {

    private LinkedList<Ticket> cart;
    private Account activeAccount;

    // TODO SHOULD loggedIn BE HERE OR IN ACCOUNT?
    private boolean loggedIn = false;

    public static void main(String[] args) { SpringApplication.run(TicketSystem.class, args); }

    @GetMapping("/login")
	public String apiRoot() {
		return "Login page";
	}

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
