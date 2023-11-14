package data;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static List<User> users = new ArrayList<>();
    {
        User vitaliy = new User("Vitaliy", "83345345067");

        users.add(vitaliy);
    }
}
