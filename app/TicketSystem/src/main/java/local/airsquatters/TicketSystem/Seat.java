package local.airsquatters.TicketSystem;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    /**
     * int containing the seat number of the seat
     */
    private int seatNumber;
    /**
     * char containing the section of the seat
     */
    private char section;

    /**
     * double containing the price of the seat
     */
    private double price;
}
