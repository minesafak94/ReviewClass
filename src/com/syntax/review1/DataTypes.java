package com.syntax.review1;

import java.sql.SQLOutput;

public class DataTypes {

    public static void main(String[] args) {
        /* Data Types in Java: 1.Primitive and 2.Non-Primitive

        Primitive Datatypes: byte, short, float, int, long, double, boolean, char

        numeric:
            whole numbers: byte, short, int, long (l)
            decimal numbers: float (f), double

        boolean: true/false
        char: any character, but a single character in ' '

         */
        //dataType nameOfTheVariable=value, we assign value to the varible nameofthevariable
        // data Types for whole numbers
        byte num = 127;
        short num1 = 10;
        int num2 = 1000; //most used
        long num3 = 10000099999999990l; //can upper or lower case L or l

        //data Types for decimal values
        float number = 10.99f; //can be upper or lower case F or f
        double number2 = 100.89;

        //datatype to represent single character
        char money = '$';
        char gender = 'm';

        //bis hierhin haben wir die Daten gespeichert, noch nicht genutzt, alles was gespeichert wurde, muss auch verwendet werden


        //to represent yes or no
        boolean needBreak=true;
        boolean understandingJava=true;

        System.out.println(num1); // printing value inside of variable num1
        System.out.println("num1"); // printing a String value=num1

        //create a variable and store value into it
        boolean hungry=false; //in boolean you can just give true/false as value in
        System.out.println(hungry);




    }

}
