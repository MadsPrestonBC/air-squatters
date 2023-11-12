package local.airsquatters.TicketSystem;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    /**
     * int containing the ticket number of the ticket
     */
    private int ticketNumber;

    /**
     * Event containing the event
     */
    private Event event;

    
    /**
     * boolean indicating if the ticket is available
     */
    //TODO WHERE SHOULD THIS GO??
    private boolean available;

    /**
     * Account indicating the owner of the ticket
     */
    private Account owner;

    private Seat seat;

    
}
