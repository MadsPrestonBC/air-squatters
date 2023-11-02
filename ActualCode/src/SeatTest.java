public class SeatTest {

    public static boolean returnTrueIfgetSeatWorks() {
        Seat testSeat = new Seat();

        if (testSeat.getSeatNumber() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean returnTrueIfgetSectionWorks() {
        Seat testSeat = new Seat();
        if (testSeat.getSection() == 'a') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean returnTrueIfgetPriceWorks() {
        Seat testSeat = new Seat();
        if (testSeat.getPrice() == 0.0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean returnTrueIfsetSeatWorks() {
        Seat testSeat = new Seat();
        testSeat.setSeatNumber(10);
        if (testSeat.getSeatNumber() == 10) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean returnTrueIfsetSectionWorks() {
        Seat testSeat = new Seat();
        testSeat.setSection('G');
        if (testSeat.getSection() == 'G') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean returnTrueIfsetPriceWorks() {
        Seat testSeat = new Seat();
        testSeat.setPrice(100.0);
        if (testSeat.getPrice() == 100.0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(returnTrueIfgetSeatWorks());
        System.out.println(returnTrueIfgetSectionWorks());
        System.out.println(returnTrueIfgetPriceWorks());


        System.out.println(returnTrueIfsetSeatWorks());
        System.out.println(returnTrueIfsetSectionWorks());
        System.out.println(returnTrueIfsetPriceWorks());


    }


}
