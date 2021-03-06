package com.company;

import java.util.Scanner;

public class _3FormattingNumbers {
    //Write a program that reads 3 numbers: an integer a (0 ? a ? 500),
    // a floating-point b and a floating-point c and prints them in 4 virtual columns
    // on the console. Each column should have a width of 10 characters.
    // The number a should be printed in hexadecimal, left aligned; then the number a
    // should be printed in binary form, padded with zeroes, then the number b should
    // be printed with 2 digits after the decimal point, right aligned; the number c
    // should be printed with 3 digits after the decimal point, left aligned.

    //TO RUN THIS CLASS PRESS CTRL+SHIFT+F10
    //TO RUN THIS CLASS PRESS CTRL+SHIFT+F10
    //TO RUN THIS CLASS PRESS CTRL+SHIFT+F10
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();


        String unpaddedBinary = Integer.toBinaryString(a);

        String binary = String.format("%10s", unpaddedBinary).replace(' ', '0');

        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, binary, b, c);
    }
}
