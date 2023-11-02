public class AccountTest {

    public static boolean returnTrueIfUserCreated() {
        Account test = null;
        test = new Account(12345, "password", "clyde@cofc.edu");

        if (test != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean returnTrueIfUserNameUpdated() {
        Account test = new Account(12345, "password", "clyde@cofc.edu");
        test.setCofcID(56789);

        if (test.getCofcID() == 56789) {
            return true;
        } else {
            return false;
        }
    }

        public static boolean returnTrueIfPasswordUpdated() {
            Account test = new Account(12345, "password", "clyde@cofc.edu");
            test.setPassword("NewPassword");

            if (test.getPassword() == "NewPassword") {
                return true;
            } else {
                return false;
            }
        }

    public static boolean returnTrueIfEmailUpdated() {
        Account test = new Account(12345, "password", "clyde@cofc.edu");
        test.setEmail("JohnDoe@cofc.edu");

        if (test.getEmail() == "JohnDoe@cofc.edu") {
            return true;
        } else {
            return false;
        }
    }





    public static void main(String[] args) {
        System.out.println(returnTrueIfUserCreated());
        System.out.println(returnTrueIfUserNameUpdated());
        System.out.println(returnTrueIfPasswordUpdated());
        System.out.println(returnTrueIfEmailUpdated());
    }
}
