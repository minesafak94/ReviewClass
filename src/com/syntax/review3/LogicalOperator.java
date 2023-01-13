package com.syntax.review3;

public class LogicalOperator {
    public static void main(String[] args) {
// 2 or more conditions to test -> Logical OR or AND
        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false;

        if(loginButtonClickable&&loginButtonDisplayed){
            System.out.println("test case passed");
        }else{
            System.out.println("test case failed");
        }

        System.out.println("******************Logical OR**********************");

        boolean dashboard=true;
        String message="Welcome admin";

        if (dashboard || message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
        }else{
            System.out.println("User isn't logged in!");
        }

        System.out.println("*****************Logical NOT***********************");

        boolean b=true;

        System.out.println(!true);

        boolean agreeCheckboxSelected=false;

        if (agreeCheckboxSelected){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");


        boolean boo=!false;
        System.out.println("boo");//output: true
    }
}
