public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        registration.registerUser("Akash");
        registration.registerUser("Anil");
        registration.registerUser("Sanjay");

        System.out.println("Registered Users:");
        registration.displayUsers();

        registration.removeUser("Sanjay");

        System.out.println("Registered Users after removal:");
        registration.displayUsers();
    }
}
