public class AccountTest {

    public static boolean returnTrueIfUserCreated() {
        Account test = null;
        test = new Account(12345, "user name", "password");

        if (test != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean returnTrueIfUserNameUpdated() {
        Account test = new Account(12345, "user name", "password");
        test.setCofcID(56789);

        if (test.getCofcID() == 56789) {
            return true;
        }
        else {
            return false;
        }

    }


    public static void main(String[] args) {
        System.out.println(returnTrueIfUserCreated());
        System.out.println(returnTrueIfUserNameUpdated());
    }
}
