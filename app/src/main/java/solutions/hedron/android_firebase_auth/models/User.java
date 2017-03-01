package solutions.hedron.android_firebase_auth.models;

/**
 * Created by armin on 01/03/2017.
 */

public class User {

    public String username;
    public String firstName;
    public String lastName;

    public User() {
    }

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
