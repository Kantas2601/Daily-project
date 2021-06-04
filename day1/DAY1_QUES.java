package com.company;
import java.util.Scanner;

public class DAY1_QUES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b) {
            System.out.println("these numbers are equal");
        }else if (a>b){
                System.out.println("" +a+ " is larger");
            } else{
            System.out.println("" +b+ " is larger");
        }


    }
}
