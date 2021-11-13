import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

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

    public static double toBinary(double d, int precision) {
        long wholePart = (long) d;
        return Double.parseDouble(wholeToBinary(wholePart) + '.' + fractionalToBinary(d - wholePart, precision));
    }

    private static String wholeToBinary(long l) {
        return Long.toBinaryString(l);
    }

    private static String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

    public static double binaryStringToDouble(String s) {
        return stringToDouble(s, 2);
    }

    public static double stringToDouble(String s, int base) {
        String withoutPeriod = s.replace(".", "");
        double value = new BigInteger(withoutPeriod, base).doubleValue();
        String binaryDivisor = "1" + s.split("\\.")[1].replace("1", "0");
        double divisor = new BigInteger(binaryDivisor, base).doubleValue();
        return value / divisor;
    }

    public static double ieeeToFloat(String binString) throws Exception {
        binString = binString.replace(" ", "");
        /* 32-bit */
        if (binString.length() == 32) {
            return Float.intBitsToFloat(Integer.parseUnsignedInt(binString, 2));
        }
        /* 64-bit */
        else if (binString.length() == 64) {
            return Double.longBitsToDouble(Long.parseUnsignedLong(binString, 2));
        }
        /* An exception thrown for mismatched strings */
        else {
            throw new Exception("Does not represent internal bits of a floating-point number");
        }
    }

//    public static long bin_to_ieee(double int){
//        float f1 = Float.intBitsToFloat(Integer.parseUnsignedInt(numerio,2));
//
//    }

    // Convert the 32-bit binary into the decimal
    private static float GetFloat32( String Binary )
    {
        int intBits = Integer.parseInt(Binary, 2);
        float myFloat = Float.intBitsToFloat(intBits);
        return myFloat;
    }

    // Get 32-bit IEEE 754 format of the decimal value
    private static String GetBinary32( float value )
    {
        int intBits = Float.floatToIntBits(value);
        String binary = Integer.toBinaryString(intBits);
        return binary;
    }


    public static String double_to_ieee(double f)
    {
        // Convert 19.5 into IEEE 754 binary format..
        String str = GetBinary32( (float) f );
        if (str.startsWith("11")){
            str = str;
        }
        else{
            str = "0" + str;
        }
        return str;


    }



    public static double binary_to_double(String binary)
    {

        int len = binary.length();
        int point = binary.indexOf('.');

        if (point == -1)
            point = len;

        double intDecimal = 0,
                fracDecimal = 0,
                twos = 1;

        for(int i = point - 1; i >= 0; i--)
        {
            intDecimal += (binary.charAt(i) - '0') * twos;
            twos *= 2;
        }

        twos = 2;
        for(int i = point + 1; i < len; i++)
        {
            fracDecimal += (binary.charAt(i) - '0') / twos;
            twos *= 2.0;
        }

        return intDecimal + fracDecimal;
    }

    public static String binary_to_ieee(String binary){
        double decimal = binary_to_double(binary);
        String ieee = double_to_ieee(decimal);
        return ieee;
    }

    public static String hexa_to_binary(String hex){
        hex = hex.toUpperCase();
        String result = "";
        for (int index = 0; index < hex.length(); index++){
            String value = "";
            switch (hex.charAt(index)){
                case 'A':
                    value = Hex.A.value;
                    break;
                case 'B':
                    value = Hex.B.value;
                    break;
                case 'C':
                    value = Hex.C.value;
                    break;
                case 'D':
                    value = Hex.D.value;
                    break;
                case 'E':
                    value = Hex.E.value;
                    break;
                case 'F':
                    value = Hex.F.value;
                    break;
                case '0':
                    value = Hex._0.value;
                    break;
                case '1':
                    value = Hex._1.value;
                    break;
                case '2':
                    value = Hex._2.value;
                    break;
                case '3':
                    value = Hex._3.value;
                    break;
                case '4':
                    value = Hex._4.value;
                    break;
                case '5':
                    value = Hex._5.value;
                    break;
                case '6':
                    value = Hex._6.value;
                    break;
                case '7':
                    value = Hex._7.value;
                    break;
                case '8':
                    value = Hex._8.value;
                    break;
                case '9':
                    value = Hex._9.value;
                    break;
            }
            result += value;
        }
        return result;
    }

    public static double hexa_to_double(String hexa){
        String binary = hexa_to_binary(hexa);
        double decimal = binary_to_double(binary);
        return decimal;
    }




}


