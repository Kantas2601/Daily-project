package com.company;
import java.util.Scanner;

public class DAY1_QUES5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your wish of seeing the square of side = ");
        int square_side = sc.nextInt();
        for (int i = square_side; i>0; i--) {
            for (int j = 0; j < square_side; j++) {
                if (i == 1 || i == square_side) {
                    System.out.print("*");
                } else if (j==0 || j == (square_side-1)){
                    System.out.print("*");
                }else
                    System.out.print(" ");
                    if (j==(square_side-1)){
                        System.out.println("");
                    }



            }

                }

        }
        }




