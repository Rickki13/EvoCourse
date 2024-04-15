import java.util.Scanner;

public class Operations {
    public void Calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double bol = (double) a / (double) b;

        boolean crat = false;
        if (a % 5 == 0) {
            System.out.println("a=" + a);
            crat = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + a);
            crat = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + a);
            crat = true;
        }
        if(!crat){
            System.out.println("нет значений, кратных 5");
        }

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
