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

}


