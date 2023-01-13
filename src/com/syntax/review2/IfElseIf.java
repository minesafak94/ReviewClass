package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        /* when we have more conditions to test

        if (boolean condition){
        code A:
        }else if (boolean condition){
        code B;
        }else fi (boolean condition){
        code C;
        }
         */

        /* Check homework

        if you completed more than 25 -> great job
        if you completed more than 20 -> good job
        if you completed more than 10 -> ok job
        if you completed more than 5 -> not good job
         */

        int a=25;
        int b=21;
        int c=10;
        int d=5;

        if (a>25){
            System.out.println("If you completed more than "+a+" -> Great job");
        }else if(b>20){
            System.out.println("If you completed more than "+b+" -> Good job");
        }else if(c>10){
            System.out.println("If you completed more than "+c+" -> ok job");
        }else if (d>5){
            System.out.println("If you completed more than "+d+" -> not good job");
        }

        System.out.println("-------------------");

        String browser="firefox";

        if (browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        }else if(browser.equals("safari")){
            System.out.println("Test cases executed on safari browser");
        }else if(browser.equals("firefox")){
        System.out.println("Test cases executed on firefox browser");
    }else{//when none of the conditions are true,code comes to else block
            System.out.println("Browser is not supported");
        }
}}
