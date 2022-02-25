package com.bytefalcons.coffeebean.basics;

/**
 * @Java DataTypes
 * There are 8 Primitive Types
 * Primitive DataTypes
 *      |__ Boolean
 *      |__ Numeric
 *            |__ Integer ( byte, short, int, long )
 *            |__ Floating-Point ( float, double )
 *            |__ Character ( char )
 */
public class DataTypes {

    public static void main(String[] args) {

        System.out.println("************ [Primitive DataTypes] ************");

        System.out.println("[Primitive DataTypes] (Boolean)");
        boolean bool = true;

        System.out.println("[Primitive DataTypes] (Numeric) => Integer");

        byte  byteValue  = 10;
        short shortValue = 100;
        int   intValue   = 1000;
        long  longValue  = 10000L; // L is required for values above range of Integer.

        System.out.println("byte  : Min-Value = "+ Byte.MIN_VALUE +"\t, Max-Value = "+Byte.MAX_VALUE);
        System.out.println("short : Min-Value = "+ Short.MIN_VALUE +"\t, Max-Value = "+Short.MAX_VALUE);
        System.out.println("int   : Min-Value = "+ Integer.MIN_VALUE +"\t, Max-Value = "+Integer.MAX_VALUE);
        System.out.println("long  : Min-Value = "+ Long.MIN_VALUE +"\t, Max-Value = "+Long.MAX_VALUE);

        System.out.println("[Primitive DataTypes ] (Numeric) => Floating-Point");
        float floatValue = 5.5f;
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Floating-Point => \n\t minFloatValue = "+minFloatValue+",\n\t maxFloatValue = "+maxFloatValue);

        System.out.println("[Primitive DataTypes] (Numeric) => Double");
        // Java treats double as the default floating-point number.
        double doubleValue = 5.5;
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double, minDoubleValue="+minDoubleValue+", maxDoubleValue ="+maxDoubleValue);


        System.out.println("[Primitive DataTypes] (Numeric) => Character");
        char charValue = 65;
        char charValue2 = 'B';
        char unicodeChar = '\u0950';
        System.out.println("Character value "+charValue+" ,"+charValue2);
        System.out.println("Unicode Character :"+unicodeChar);

    }

}

