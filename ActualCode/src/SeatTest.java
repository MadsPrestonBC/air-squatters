public class SeatTest {

    public static boolean returnTrueIfgetSeatWorks() {
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
        return testSeat.getSeatNumber() == 0;
    }

    public static boolean returnTrueIfgetSectionWorks() {
        Seat testSeat = new Seat();
        return testSeat.getSection() == 'a';
    }

    public static boolean returnTrueIfgetPriceWorks() {
        Seat testSeat = new Seat();
        return testSeat.getPrice() == 0.0;
    }

    public static boolean returnTrueIfsetSeatWorks() {
        Seat testSeat = new Seat();
        testSeat.setSeatNumber(10);
        return testSeat.getSeatNumber() == 10;
    }


    public static boolean returnTrueIfsetSectionWorks() {
        Seat testSeat = new Seat();
        testSeat.setSection('G');
        return testSeat.getSection() == 'G';
    }

    public static boolean returnTrueIfsetPriceWorks() {
        Seat testSeat = new Seat();
        testSeat.setPrice(100.0);
        return testSeat.getPrice() == 100.0;
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
