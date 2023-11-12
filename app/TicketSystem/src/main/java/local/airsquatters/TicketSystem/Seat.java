package local.airsquatters.TicketSystem;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;

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
    private Double price;

    /**
     * boolean indicating if the seat is handicap accessible
     */
    private boolean handicapAccessible;

    @Id
    private ObjectId id;

    private String seatId;

    public Seat(int seatNumber, char section, Double price, boolean handicapAccessible) {
        seatNumber = this.seatNumber;
        section = this.section;
        price = this.price;
        handicapAccessible = this.handicapAccessible;
        seatId = section + price.toString();
    }
}
