package com.syntax.review1;

public class WorkingWithVariables {

    public static void main(String[] args) {

        //create a variable and store value into it
        //declare a variable and we initialized it

        int number=10;

        // declared a variable
        int num;// declaration of a variable

        //initialize/create the variable
        num=100;// initialize the variable
        // here you dont need int again, its already declared above, happens only once

        num=200; //reassign the value
        num=2000;
        num=5000;
        //num=30.01; error different data types

        System.out.println(num); //200

        boolean hungry=false;
        hungry=true;
        //hungry="yes"; error different data types

        String myString="Hello";

        String name="Artem";

        String address="123 Test Drive";

        //Hello Artem

        System.out.println(myString+" "+name);

        int age=21;

        //Artem is 21 years old
        System.out.println(name+" is "+age+" years old");

        /*
        if we want to attach String to anything:

        string to another string
        string to int
        string to boolean
        string to char ....

        we use + --> acts as concatenation
         */
        // when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";

        System.out.println(n1+num);

        String month="December";
        int day=14;

        System.out.println(day+" "+month);

        char date='1';
        System.out.println(date +"."+ month);

        System.out.println(date+day);// you will get a number as output because behind every char there are numeric values






    }
}
