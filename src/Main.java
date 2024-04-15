import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String userName1 = in.nextLine();
        System.out.println("Введите возраст первого пользователя");
        int userAge1 = in.nextInt();
        in.nextLine();
        User user1 = new User(userName1, userAge1);

        System.out.println("Введите имя второго пользователя");
        String userName2 = in.nextLine();
        System.out.println("Введите возраст второго пользователя");
        int userAge2 = in.nextInt();
        in.nextLine();
        User user2 = new User(userName2, userAge2);

        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1.toString());
        } else {
            System.out.println(user2.toString());
        }

    }
}