import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//        double value = (double) Func.factorial(10.0);
//        System.out.println(value);
//        System.out.println(Func.sec(5));
//        System.out.println(Func.cosec(5));
//        System.out.println(Func.cot(5));
//        System.out.println(Func.sinh(5));
//        System.out.println(Func.cosh(5));
//        System.out.println(Func.tanh(5));
//        System.out.println(Func.sech(5));
//        System.out.println(Func.cosech(5));
//        System.out.println(Func.coth(5));
//        System.out.println(Func.sec(5));
//        System.out.println(Func.sec(5));
//        System.out.println(Func.sec(5));
//        System.out.println(Func.permutation(10,2));
//        System.out.println(Func.combination(10,2));
//        System.out.println(Func.binaryStringToDouble("1111001.0"));
//        System.out.println(2<<1);


//        Decimal
        System.out.println(Func.toBinary("24344324.23423432"));
        System.out.println(Func.double_to_ieee(323.434234));
        System.out.println(Func.double_to_hex("12432423432.4324234"));
        System.out.println();

//        Binary
        System.out.println(Func.binary_to_ieee("101010101011100100101010.01010001010101"));
        System.out.println(Func.binary_to_hex("010100001010101001.00101001"));
        System.out.println(Func.binary_to_double("001010101001010.101010010101010101010010101"));
        System.out.println();

//        Hexadecimal
        System.out.println(Func.hex_to_double("1212ade4221faed.42143adef23122a"));
        System.out.println(Func.hex_to_binary("30.123"));
        System.out.println();

//        1's and 2s's comp
        System.out.println(Func.comp_1("10101010001010.0"));
        System.out.println(Func.comp_2("10101010001010"));
        System.out.println("");

//        other
        System.out.println(Func.remove_decimal("01101010101.01001"));
        System.out.println(Func.hex_to_binary("abde.3d"));

    }


}
