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
    /**
     * int containing the ticket number of the ticket
     */
    private int ticketNumber;
    /**
     * double containing the price of the ticket
     */
    private double price;
    /**
     * int containing the seat number of the ticket
     */
    private int seatNumber;
    /**
     * char containing the section of the ticket's seat
     */
    private char section;
    /**
     * String containing the event the ticket is for
     */
    private String event;
    /**
     * Date containing the date of the event the ticket is for
     */
    private Date eventDate;
    /**
     * boolean indicating if the seat is handicap accessible
     */
    private boolean handicapAccessible;
    /**
     * boolean indicating if the ticket is available
     */
    private boolean available;

    /**
     * Account indicating the owner of the ticket
     */
    private Account owner;

    /**
     * Default constructor for Ticket
     *
     */
    public Ticket() {
        this.ticketNumber = 0;
        this.price = 0.0;
        this.seatNumber = 0;
        this.section = 'a';
        this.event = "";
        this.eventDate = new Date();
        this.handicapAccessible = false;
        this.available = false;
        this.owner = new Account();
    }

    /**
     * Constructor for a Ticket object
     * @param ticketNumber the ticket number of the ticket
     * @param price the price of the ticket
     * @param seatNumber the seat number of the ticket
     * @param section the section the seat is in
     * @param event the event the ticket is for
     * @param eventDate the date of the event
     * @param handicapAccessible handicap accessibility of the seat
     * @param available the availability of the ticket
     * @param owner the owner of the ticket
     */
    public Ticket(int ticketNumber, double price, int seatNumber, char section, String event, Date eventDate,
                  boolean handicapAccessible, boolean available, Account owner) {
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.seatNumber = seatNumber;
        this.section = section;
        this.event = event;
        this.eventDate = eventDate;
        this.handicapAccessible = handicapAccessible;
        this.available = available;
        this.owner = owner;
    }

    /**
     * Returns the ticket number of the ticket
     * @return the ticket number of the ticket
     */
    public int setTicketNumber() {
        return this.ticketNumber;
    }

    /**
     * Sets the ticket number of the ticket
     * @param ticketNumber ticker number for the ticket
     */
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    /**
     * Returns the price of the ticket
     * @return the price of the ticket
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Sets a new price for the ticket
     * @param price the new price of the ticket
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Returns the seat number of the ticket
     * @return the seat number of the ticket
     */
    public int getSeatNumber() {
        return this.seatNumber;
    }

    /**
     * Sets a new seat number for the ticket
     * @param seatNumber the new seat number for the ticket
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * Returns the section where the seat is located
     * @return the section where the seat is located
     */
    public char getSection() {
        return this.section;
    }

    /**
     * Sets a new section for the seat of the ticket
     * @param section the new section
     */
    public void setSection(char section) {
        this.section = section;
    }

    /**
     * Returns the event the ticket is for
     * @return the event the ticket is for
     */
    public String getEvent() {
        return this.event;
    }

    /**
     * Sets a new event for the ticket
     * @param event the new event for the ticket
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * Returns the date of the event the ticket is for
     * @return the date of the event the ticket is for
     */
    public Date getEventDate() {
        return this.eventDate;
    }

    /**
     * Sets a new date for the event the ticket is for
     * @param eventDate the new date of the event
     */
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * Returns the handicap accessibility of the ticket
     * @return the handicap accessibility of the ticket
     */
    public boolean isHandicapAccessible() {
        return this.handicapAccessible;
    }

    /**
     * Sets the handicap accessibility of the ticket
     * @param handicapAccessible the handicap accessibility of the ticket
     */
    public void setHandicapAccessible(boolean handicapAccessible) {
        this.handicapAccessible = handicapAccessible;
    }

    /**
     * Returns the availability of the ticket
     * @return the availability of the ticket
     */
    public boolean isAvailable() {
        return this.available;
    }

    /**
     * Sets the availability of the ticket
     * @param available the availability of the ticket
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Returns the owner of the ticket
     * @return the owner of the ticket
     */
    public Account getOwner() {
        return owner;
    }

    /**
     * Sets an owner for the ticket
     * @param owner the owner of the ticket
     */
    public void setOwner(Account owner) {
        this.owner = owner;
    }

    /**
     * Overridden toString method
     * @return a String indicating what event the ticket is for and when it is
     */
    @Override
    public String toString() {
        return "A ticket for " + this.getEvent() + " on " + this.getEventDate();
    }

    /**
     * Overridden compareTo method, compares two ticket objects by price
     * @param o the object to be compared.
     * @return int value representing the comparison
     *      Returns 1 if the object is larger than the argument
     *      Returns 0 if the object is equal to the argument
     *      Returns -1 if the object is smaller than the argument
     */
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
