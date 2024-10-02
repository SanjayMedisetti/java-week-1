import java.util.*;
public class UserRegistration {
    private TreeSet<String> users;

    public UserRegistration() {
        this.users = new TreeSet<>();
    }

    public boolean registerUser(String userName) {
        return users.add(userName);
    }

    public boolean removeUser(String userName) {
        return users.remove(userName);
    }

    public void displayUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }
}
