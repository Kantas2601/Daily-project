package com.company;
import java.util.Scanner;

public class DAY1_QUES4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [][] employee = new float[3][4];
        for (int i=0; i<3;i++) {
            System.out.print("employee id = ");
            employee[i][0] = sc.nextInt();
            System.out.print("number of working hour = ");
            employee[i][1] = sc.nextInt();
            System.out.print("enter amount charge as per hour pay = ");
            employee[i][2] = sc.nextInt();
            if (employee[i][1] > 40) {
                employee[i][3] = (employee[i][1] - 40) * (1.5f * employee[i][2]) + 40 * employee[i][2];
            } else
                employee[i][3] =  employee[i][1] * employee[i][2];
            System.out.println("gross pay for employee is " +employee[i][3]+ "");

        }


    }
}
