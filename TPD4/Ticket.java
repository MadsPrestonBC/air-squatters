import java.util.Date;

/**
 * Ticket is a class that contains the framework for a Ticket object. The ticket object contains information about
 * the price, the event, the seat, and the date, among other attributes. Ticket uses java.util.Date to provide the
 * information for the ticket's date.
 * <p></p>
 * Ticket is comparable... For now...
 * <p></p>
 * @author Anthony Ruvo
 * @version 1.0 24 September 2023
 * <p></p>
 *
 **/
public class Ticket implements Comparable <Ticket> {
    private double price;
    private int seatNumber;
    private char section;
    private String event;
    private Date eventDate;
    private boolean handicapAccessible;
    private boolean available;


    public Ticket() {
        this.price = 0.0;
        this.seatNumber = 0;
        this.section = 'A';
        this.event = "";
        this.eventDate = new Date();
        this.handicapAccessible = false;
        this.available = false;
    }

    public Ticket(double price, int seatNumber, char section, String event, Date eventDate,
                  boolean handicapAccessible, boolean available) {
        this.price = price;
        this.seatNumber = seatNumber;
        this.section = section;
        this.event = event;
        this.eventDate = eventDate;
        this.handicapAccessible = handicapAccessible;
        this.available = available;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public char getSection() {
        return this.section;
    }
    public void setSection(char section) {
        this.section = section;
    }

    public String getEvent() {
        return this.event;
    }
    public void setEvent(String event) {
        this.event = event;
    }

    public Date getEventDate() {
        return this.eventDate;
    }
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public boolean isHandicapAccessible() {
        return this.handicapAccessible;
    }
    public void setHandicapAccessible(boolean handicapAccessible) {
        this.handicapAccessible = handicapAccessible;
    }

    public boolean isAvailable() {
        return this.available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "A ticket for " + this.getEvent() + " on " + this.getEventDate();
    }

    @Override
    public int compareTo(Ticket o) {
        // TODO FIGURE OUT HOW TO IMPLEMENT
        if ((this.getPrice() - o.getPrice() > 0)) {
            return 1;
        }
        if ((this.getPrice() - o.getPrice() == 0)) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
