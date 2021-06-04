package com.company;

import java.util.Scanner;

public class DAY1_QUES6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        String digits = input.next();
       int value = digits.length();
       if (value!=5)
           System.out.println("incorrect input, try with a 5-digit number");
           digits = input.next();
        if ((digits.charAt(0) == digits.charAt(4)) && (digits.charAt(1)==digits.charAt(3))) {
           System.out.println("this is palindrome");
       }else {
           System.out.println("not a palindrome");
       }
       }




    }
