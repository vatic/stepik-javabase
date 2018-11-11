package xyz.vatagin.stepik.benchmarks;

import java.math.BigDecimal;
import java.util.function.DoubleUnaryOperator;

public class Main {

    // With lamda
    public static void main(String[] args) {
//        Timer timer = new Timer();
//        long time = timer.measureTime(Main::bigDecimalPower);
//        System.out.println("Measured time: " + time + " ms");
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        final int N = 10000000;
        double h = (b - a) / N;
        for (int i = 0; i < N; i++) {
            result += f.applyAsDouble(a + h * i);
        }
        result *= h;

        return Math.ceil( result * 10000) / 10000;
    }

    private static void bigDecimalPower() {
        new BigDecimal("1234567").pow(1000000);
    }

    /* With anonymous class
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(new Runnable() {
            @Override
            public void run() {
                new BigDecimal("1234567").pow(1000000);
            }
        });
        System.out.println("Measured time: " + time + " ms");
    }

    /* without anonymous class
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(new BigDecimalPower());
        System.out.println("Measured time: " + time + " ms");
    }

    private static class BigDecimalPower implements Runnable {

        @Override
        public void bigDecimalPower() {
            new BigDecimal("1234567").pow(1000000);
        }
    }
    */
}
