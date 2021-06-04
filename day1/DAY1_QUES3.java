package com.company;
import java.util.Scanner;

public class DAY1_QUES3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input = new int[5];
        int  n_sum=0; int p_sum=0; int z_sum=0;
        System.out.println("Enter 5 numbers");
        for (int i=0; i<5;i++){
            input[i] = sc.nextInt();
            if(input[i]==0){
                z_sum=z_sum+1;
            } else if (input[i]>0){
                p_sum=p_sum+1;
            } else {
                n_sum=n_sum+1;
            }
        }
        System.out.println("" +p_sum+ " are number of positive numbers you have entered");
        System.out.println("" +n_sum+ " are number of negative numbers you have entered");
        System.out.println("" +z_sum+ " are number of zeroes you have entered");
    }
}
