package com.company;
import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissor{
    public static void main(String[] args) {
Random generator = new Random();
Scanner sc = new Scanner(System.in);

int gamenumber = generator.nextInt();
        System.out.println("1 FOR ROCK, 2 FOR PAPER, 0 FOR SCISSOR, ENTER YOUR INPUT WISELY");
        int input = sc.nextInt();
        switch (input) {
            case 0 -> System.out.println("you choose scissor");
            case 1 -> System.out.println("you choose rock");
            case 2 -> System.out.println("you choose paper");
            default -> System.out.println("your input is invalid");
        }
        //System.out.println(gamenumber);
        int play_code = gamenumber % 3;
        switch (play_code) {
            case -2 -> {
                System.out.println("computer choose paper");
                play_code = play_code * (-1);
            }
            case -1 -> {
                System.out.println("computer choose rock");
                play_code = play_code * (-1);
            }
            case 0 -> System.out.println("computer choose scissor");
            case 1 -> System.out.println("computer choose rock");
            case 2 -> System.out.println("computer choose paper");
        }
        if (play_code == input){
            System.out.println("repeat the round");
        } else if (play_code == 0 && input == 1) {
            System.out.println("you wins");
        } else if (play_code == 0 && input == 2) {
            System.out.println("computer wins");
        }  else if (play_code == 1 && input == 0) {
            System.out.println("computer wins");
        }  else if (play_code == 1 && input == 2) {
            System.out.println("you wins");
        }  else if (play_code == 2 && input == 1) {
            System.out.println("computer wins");
        }  else if (play_code == 2 && input == 0) {
            System.out.println("you wins");
        }

    }
}
