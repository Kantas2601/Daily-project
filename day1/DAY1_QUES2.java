package com.company;
import java.util.Scanner;

public class DAY1_QUES2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int a = input.nextInt();
        int [] numbers = new int[5];
        numbers [0] = a/10000;
        numbers [1] = (a-(numbers [0]*10000))/1000;
        numbers [2] = (a-(numbers [0]*10000 + numbers [1]*1000))/100;
        numbers [3] = (a-(numbers [0]*10000 + numbers [1]*1000 + numbers [2]*100))/10;
        numbers [4] = (a-(numbers [0]*10000 + numbers [1]*1000 + numbers [2]*100 + numbers [3]*10));
       for (int i=0; i<=4;i++){
           System.out.print(numbers[i]);
           System.out.print("   ");
       }
    }
}
