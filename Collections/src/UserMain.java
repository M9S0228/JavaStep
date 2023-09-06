import java.util.HashSet;

public class UserMain {
    public static void main(String[] args) {
        HashSet<User> userSet = new HashSet<>();

        User user1 = new User("Vlad", 20, "102-102-102");
        User user2 = new User("Vlad", 20, "102-102-102");
        User user3 = new User("Vlad", 30, "102-102-102");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
            System.out.println(user);
        }
        System.out.println("Хеш код за полем Name!");
        for (User user : userSet) {
            System.out.println(user.hasCode());
        }
        System.out.println("Хеш код за всіма полями!");
        for (User user : userSet) {
            System.out.println(user.hashCodeAllFields());
        }





    }
}
