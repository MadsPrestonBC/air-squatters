public class Seat {
    /**
     * int containing the seat number of the ticket
     */
    private int seatNumber;
    /**
     * char containing the section of the ticket's seat
     */
    private char section;

    private double price;

    public int getSeatNumber() {
        return seatNumber;
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

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
