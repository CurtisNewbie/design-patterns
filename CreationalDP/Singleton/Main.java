public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        System.out.println("Created by: " + singleton.getCreatedBy());
        System.out.println("Slogan: " + singleton.getSlogan());
    }
}
