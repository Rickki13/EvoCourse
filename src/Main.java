import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя " + (i+1));
            String name = in.nextLine();
            System.out.println("Введите возраст пользователя " + (i+1));
            int age = in.nextInt();
            in.nextLine();
            User user = new User(name, age);
            listOfUsers.add(user);
        }

        Collections.sort(listOfUsers, Comparator.comparingInt(User::getAge));

        for (User user : listOfUsers) {
            System.out.println(user.toString());
        }
    }
}