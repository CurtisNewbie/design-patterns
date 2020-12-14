import java.util.*;

/* A builder for building immutable User */
public final class UserBuilder {

    /* attributes that are optional */
    private String firstName;
    private String lastName;

    /* attributes that are compulsory */
    private final String username;
    private final String phone;
    private final List<String> roles = new ArrayList<>();

    /* Use constructor to get the compulsory parameters */
    public UserBuilder(String uname, String phone, List<String> roles) {
        this.username = uname;
        this.phone = phone;
        if (roles != null)
            this.roles.addAll(roles);
    }

    public String getFirstName() {
        return firstName;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
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

    public User build() {
        return new User(this);
    }
}
