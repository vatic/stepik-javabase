package xyz.vatagin.stepik.calculator;

class A {
    int i;

    public int getI() {
        return i;
    }
}

class B extends A {
    int i;
}

public class Main {
    public static void main(String[] args) {
        sqrt(-1);
//        Calculator calc = new CalculatorImpl();
//        System.out.println(calc.calculate("1,2 + 1"));
//        Object nullRef = null;
        // java.lang.NullPointerException - NPE
//        nullRef.toString();
//        B b = new B();
//        Object o = new Object();
//        A a = (A) o;
//        System.out.println(a.getI());
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException(
                    "Expected non-negative number, got " +
                    x);
        }
        return Math.sqrt(x);
    }
}
