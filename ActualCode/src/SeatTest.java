public class SeatTest {

    public static boolean returnTrueifGettersWork() {
        Seat testSeat = new Seat();

        if (testSeat.getSeatNumber() == 0) {
            return true;
        }
        if (testSeat.getSection() == 'a') {
            return true;
        }
        if (testSeat.getPrice() == 0.0) {
            return true;
        }
    }

}
