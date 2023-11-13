package local.airsquatters.TicketSystem;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Seat {

    @Id
    private ObjectId id;
    /**
     * int containing the seat number of the seat
     */
    private Integer seatNumber;
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

    private String seatId;

    public Seat(Integer seatNumber, char section, Double price, boolean handicapAccessible) {
        seatNumber = this.seatNumber;
        section = this.section;
        price = this.price;
        handicapAccessible = this.handicapAccessible;
        seatId = this.section + this.seatNumber.toString();
    }
}
