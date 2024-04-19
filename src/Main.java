import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, List<User>> mapOfUsers = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя " + (i + 1));
            String name = in.nextLine();
            System.out.println("Введите возраст пользователя " + (i + 1));
            int age = in.nextInt();
            in.nextLine();
            User user = new User(name, age);

            if (mapOfUsers.containsKey(age)) {
                mapOfUsers.get(age).add(user);
            } else {
                List<User> listOfUsers = new ArrayList<>();
                listOfUsers.add(user);
                mapOfUsers.put(age, listOfUsers);
            }
        }

        System.out.println("\nВведите требуемый возраст");
        int requestedAge = in.nextInt();
        in.nextLine();

        if (mapOfUsers.containsKey(requestedAge)) {
            List<User> users = mapOfUsers.get(requestedAge);
            users.sort(Comparator.comparing(User::getName));
            for (User user : users) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("Пользователь с возрастом '" + requestedAge + "' не найден");
        }
    }
}