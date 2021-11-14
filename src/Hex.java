enum Hex {
    A("1010"),
    B("1011"),
    C("1100"),
    D("1101"),
    E("1110"),
    F("1111"),
    _0("0000"),
    _1("0001"),
    _2("0010"),
    _3("0011"),
    _4("0100"),
    _5("0101"),
    _6("0110"),
    _7("0111"),
    _8("1000"),
    _9("1001");

    public final String value;
    Hex(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public static String decide(String binary){
        String value = "";
        switch (binary){
            case "0000":
                value += 0;
                break;
            case "0001":
                value += 1;
                break;
            case "0010":
                value += 2;
                break;
            case "0011":
                value += 3;
                break;
            case "0100":
                value += 4;
                break;
            case "0101":
                value += 5;
                break;
            case "0110":
                value += 6;
                break;
            case "0111":
                value += 7;
                break;
            case "1000":
                value += 8;
                break;
            case "1001":
                value += 9;
                break;
            case "1010":
                value += A;
                break;
            case "1011":
                value += B;
                break;
            case "1100":
                value += C;
                break;
            case "1101":
                value += D;
                break;
            case "1110":
                value += E;
                break;
            case "1111":
                value += F;
                break;
        }
        return value;
    }

}


