package com.chrisz;

public class Main {

    public static void main(String[] args) {
	// DECIMAL  DATA TYPE
        int myIntValue = 5 / 2; // width of int is 32 (4 bytes)
        float myFloatValue = 5; // width of float is 32
        // proper way for decimals ->  = 5.4f
        // can also do this -> = (float) 5.4
        double myDoubleValue = 5d; // width of double is 64 (8 bytes)

        System.out.println("myIntValue = " + myIntValue);       // 2
        System.out.println("myFloatValue = " + myFloatValue);   // 5.0
        System.out.println("myDoubleValue = " + myDoubleValue); // 5.0

        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println("myFloat = " + myFloat);   // 1.6666666 seven digits after decimal
        System.out.println("myDouble = " + myDouble); // 1.6666666666666667 sixteen digits after decimal

        // challenge
        double myWeightInPounds = 176.5;
        double myWeightInKilograms = myWeightInPounds * (1/2.204);
        System.out.println("My weight in kilograms = " + myWeightInKilograms);
    }
}

// Use double, (1) faster on modern computers, (2) inbuilt functions use double and (3) more precise
