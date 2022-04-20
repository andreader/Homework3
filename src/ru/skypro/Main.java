package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Integer variables");

        byte plusByte = 127;
        byte minusByte = -128;
        short plusShort = 32767;
        short minusShort = -32768;
        int plusInt = 2147483647;
        int minusInt = -2147483648;
        long plusLong = 9223372036854775807l;
        long minusLong = -9223372036854775808l;

        System.out.println("Floating point variables");

        float plusFloat = 3.44438f;
        float minusFloat = -3.44438f;
        double plusDouble = 1.777777;
        double minusDouble = -1.777777;

        System.out.println("Symbol variables");
        char zeroChar = 0;
        char plusChar = 65535;

        System.out.println("Logical variables");
        boolean Boolean = true || false;

    }
}
