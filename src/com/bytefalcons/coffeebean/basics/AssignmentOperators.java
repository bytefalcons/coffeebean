package com.bytefalcons.coffeebean.basics;

public class AssignmentOperators {

    public static void main(String[] args) {

        // 1) Simple assignment
        int a = 5;

        // 2) Compound assignment
        a += 10;

        // 3) Chained assignment
        int x,y,z;
        x = y = z = 20;

        System.out.println(x);

        // int x = y = z = 20; // CE : Cannot find Symbol y, Cannot find Symbol z

        int j , k, l;

        int i = j = k = l = 20;

        /**
         * Compound Assignment Operators in Java.
         * += , -= , *=, /=, %=
         * &= , |=, ^=
         * >>=, >>>=, <<=
         */

        byte b = 127;

       //  b = b + 3; // CE : Required byte, found int.

        b += 3; // in case of compound assignment, the internal type casting is performed automatically.

        System.out.println(b);


    }
}

