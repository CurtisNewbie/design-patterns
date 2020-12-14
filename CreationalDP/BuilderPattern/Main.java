import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder("yongj.zhuang", "1234123123", List.of("Tester", "Coder", "Designer"));
        userBuilder.setFirstName("yongj").setLastName("zhuang");
        System.out.println(userBuilder.build());
    }

}
