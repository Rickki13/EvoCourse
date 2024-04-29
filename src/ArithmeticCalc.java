import java.util.stream.LongStream;

public class ArithmeticCalc {
    public static void getArithmeticProgressionSum(int a, int b) {
        long sum = LongStream.range(a, b).sum();

        System.out.println("а = " + a + ", b = " + b + ", sum = " + sum);
    }
}
