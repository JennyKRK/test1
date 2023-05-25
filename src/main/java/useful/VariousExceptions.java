package useful;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class VariousExceptions {
    public static void main(String[] args) {
        divideMeOtherVersion(2, 0);
        divideMeOtherVersion(2, 1);
        divideMeOtherVersion2(2, 0);
        divideMeOtherVersion3(2, 0);

    }

    public static void tryCatchFin(Integer... ints) {
        try {
            for (int i : ints) {
                System.out.println(20 / i);
            }
        } catch (ArithmeticException ae) {
            throw new ArithmeticException();
        } finally {
            System.out.println("Are you happy?");
        }
    }

    public static double divideMe(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void divideMeOtherVersion(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.err.format("ArithmeticException: %s", ae);
            System.out.println();
        }
    }

    public static void divideMeOtherVersion2(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("Ooops! You cannot divide by 0");
        }
    }

    public static void divideMeOtherVersion3(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(ExceptionUtils.getStackTrace(ae));
        } finally {
            System.out.println("Happy?");
        }
    }

}
