public class AccountTest {

    public static boolean returnTrueIfUserCreated() {
        Account test = null;
        test = new Account(12345, "password", "clyde@cofc.edu");

        return test != null;
    }

    public static boolean returnTrueIfUserNameUpdated() {
        Account test = new Account(12345, "password", "clyde@cofc.edu");
        test.setCofcID(56789);

        return test.getCofcID() == 56789;
    }

        public static boolean returnTrueIfPasswordUpdated() {
            Account test = new Account(12345, "password", "clyde@cofc.edu");
            test.setPassword("NewPassword");

            return test.getPassword() == "NewPassword";
        }

    public static boolean returnTrueIfEmailUpdated() {
        Account test = new Account(12345, "password", "clyde@cofc.edu");
        test.setEmail("JohnDoe@cofc.edu");

        return test.getEmail() == "JohnDoe@cofc.edu";
    }





    public static void main(String[] args) {
        System.out.println(returnTrueIfUserCreated());
        System.out.println(returnTrueIfUserNameUpdated());
        System.out.println(returnTrueIfPasswordUpdated());
        System.out.println(returnTrueIfEmailUpdated());
    }
}
