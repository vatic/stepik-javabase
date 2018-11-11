package xyz.vatagin.stepik;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * A program that prints <code>Hello world</code>
 *
 * @author Sergei Vatagin
 * @version 1.0
 */
public class HelloWorld {
    /*
     * метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
     * Во всех остальных случаях метод должен возвращать false.
     */
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        // t, t, f, f -> t
        // f, f, t, t -> t

        // t, f, t, f -> t
        // t, f, f, t -> t
        // f, t, t, f -> t
        // f, t, f, t -> t

        // t, t, t, t -> f
        // t, t, t, f -> f
        // t, t, f, t -> f
        // t, f, t, t -> f
        // t, f, f, f -> f
        // f, t, t, t -> f
        // f, t, f, f -> f
        // f, f, t, f -> f
        // f, f, f, t -> f
        // f, f, f, f -> f
        return ((a & b) & (!c & !d)) || ((!a & !b) & (c & d)) || ((a ^ b) & (c ^ d));
    }

    /*
     * метод, вычисляющий количество високосных лет с начала нашей эры (первого года)
     * до заданного года включительно
     */
    public static int leapYearCount(int year) {
        return (year / 4) - (year / 100) + (year / 400);
    }

    /*
     * метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
     * Допустимая погрешность – 0.0001 (1E-4)
     */
    public static boolean doubleExpression(double a, double b, double c) {
        final double eps = 0.0001;
        return Math.abs(a + b - c) < eps;
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        final int mask = 1 << (bitIndex - 1);
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toBinaryString(mask));
        return (value ^ mask);
    }

    /*
     * метод, который возвращает букву,
     * стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
     */
    public static char charExpression(int a) {
        final int sym = '\\';
        return (char) (sym + a);
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        final int absValue = Math.abs(value);
        return (value != 0) && absValue == Integer.lowestOneBit(absValue);
    }

    /**
     * Checks if
     * given<code> text</code>
     * is a
     * palindrome .
     *
     * @param text any
     *             string
     * @return <code>true</code>
     * when<code> text</code>
     * is a
     * palindrome, <code>false</code>otherwise
     */

    public static boolean isPalindrome(String text) {
        String textWithoutSpaces = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(textWithoutSpaces);
        String reversed = sb.reverse().toString();
        return textWithoutSpaces.equals(reversed);
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 0; i < value; i++) {
            result = result.multiply(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int totalLength = a1.length + a2.length;
        int[] result = new int[totalLength];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < roles.length; j++) {
            String role = roles[j];
            if (j > 0 ) {
                result.append("\n");
            }
            result.append(role + ":" + "\n");
            for (int i = 0; i < textLines.length; i++) {
                String line = textLines[i];
                String term = role + ": ";
                String lineWithoutRole = line.replaceFirst(term, "");
                if (line.startsWith(term)) {
                    result.append( (i+1) + ") " + lineWithoutRole + "\n");
                }
            }
        }
        return result.toString();
    }

    /**
     * Progfam entry point.
     *
     * @param args command-line arguments
     */
//    public static void main(String[] args) {
//        Animal animal1 = new Animal("Моська");
//        System.out.println(animal1.getName());
//        switch(direction) {
//            case UP:
//                robot.turnRight;
//                break;
//            default:
//                break;
//        }
//    }

}

