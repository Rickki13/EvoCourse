import java.util.Scanner;

public class Operations {
    public void Calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double bol = (double) a / (double) b;

        System.out.println("a=" + a);
        System.out.println("Результат целочисленного деления a на b: " + a / b);
        System.out.printf("Результат деления a на b: %.12f %n", bol);
        System.out.println("Результат деления a на b с округлением в большую сторону: " + (int) Math.ceil(bol));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + (int) Math.floor(bol));
        System.out.println("Результат деления a на b с математическим округлением: " + Math.round(bol));
        System.out.println("Остаток от деления b на c: " + b % c);
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
    }

}
