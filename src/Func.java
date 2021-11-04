import java.math.BigInteger;

public class Func {

    public static int factorial(double number) {
        int i, fact = 1;
        for (i = 1; i <= (int) number; i++) {
            fact = fact * i;
        }
        return fact;
    }


    public static double sec(double value) {
        double a = 1 / Math.cos(value);
        return a;
    }

    public static double cosec(double value) {
        double a = 1 / Math.sin(value);
        return a;
    }

    public static double cot(double value) {
        double a = 1 / Math.tan(value);
        return a;
    }

    public static double sinh(double value) {
        double a = Math.sinh(value);
        return a;
    }

    public static double cosh(double value) {
        double a = Math.cosh(value);
        return a;
    }

    public static double tanh(double value) {
        double a = Math.tanh(value);
        return a;
    }

    public static double coth(double value) {
        double a = 1 / Math.tanh(value);
        return a;
    }

    public static double sech(double value) {
        double a = 1 / Math.cosh(value);
        return a;
    }

    public static double cosech(double value) {
        double a = 1 / Math.sinh(value);
        return a;
    }


    public static double permutation(double n, double r) {
//        n >= r
        int totalobjects = (int) n;
        int selectedobject = (int) r;
        int f1 = totalobjects;
        for (int i = totalobjects - 1; i >= 1; i--) {
            f1 = f1 * i;
        }
        int number;
        number = totalobjects - selectedobject;
        int f2 = number;
        for (int i = number - 1; i >= 1; i--) {
            f2 = f2 * i;
        }
        double result = f1 / f2;

        return result;
    }

    public static double combination(double N, double K) {
//        N >= K
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf( (long) N - k))
                    .divide(BigInteger.valueOf(k + 1));
        }
        double result = Double.parseDouble(String.valueOf(ret));
        return result;


    }
}


