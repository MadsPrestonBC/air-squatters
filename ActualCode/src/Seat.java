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

    public Seat() {
        this.seatNumber = 0;
        this.section = 'a';
        this.price = 0.0;
    }

    public Seat(int seatNumber, char section, double price) {
        this.seatNumber = seatNumber;
        this.section = section;
        this.price = price;
    }

    /**
     * returns the seat number of the seat
     * @return the seat number of the seat
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * sets a new seat number for the seat
     * @param seatNumber the new seat number
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * returns the section of the seat
     * @return the section of the seat
     */
    public char getSection() {
        return this.section;
    }

    /**
     * sets a new section for the seat
     * @param section the new section for the seat
     */
    public void setSection(char section) {
        this.section = section;
    }

    /**
     * returns the price of the seat
     * @return the price of the seat
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * sets a new price for the seat
     * @param price the new price for the seat
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Overridden toString
     * @return string representing the seat is
     */
    @Override
    public String toString() {
        return "Seat " + this.seatNumber + this.section + " for $" + this.price;
    }
}
