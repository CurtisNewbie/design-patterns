import java.util.*;

/* Say we want to create an immutable object, called User */
public final class User {

    /* attributes that are optional */
    private final String firstName;
    private final String lastName;

    /* attributes that are compulsory */
    private final String username;
    private final String phone;
    private final List<String> roles = new ArrayList<>();

    /*
     * We may have a constructor like this, but it's not always possible to have
     * these arguments at the same time, and this may harm readability
     */
    public User(String fname, String lname, String uname, String phone, List<String> roles) {
        this.firstName = fname;
        this.lastName = lname;
        this.username = uname;
        this.phone = phone;
        if (roles != null)
            this.roles.addAll(roles);
    }

    public User(UserBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.username = builder.getUsername();
        this.phone = builder.getPhone();
        this.roles.addAll(builder.getRoles());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", roles=" + roles
                + ", username=" + username + "]";
    }
}
