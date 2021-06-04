package com.company;

public class recur {

        static int factorial(int n){
            int z;
            if (n==0 || n==1){
                 z =1;
            } else {
                z = n * factorial(n - 1);
            }
            return z;

        }

    public static void main(String[] args) {
        long result;
        for (int i=1; i<=20;i++) {
            result = factorial(i);
            System.out.print(i);
            System.out.print("\t\t");

            System.out.println(result);
        }
    }
    }


