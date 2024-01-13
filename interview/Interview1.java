package com.interview;

import java.util.Scanner;

public class Interview1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the n value");//****************
        int n = in.nextInt();
        int rem = 0,sum = 0;


        for (int i = 0; n>0; ) {
            if(n>=10) {
                sum = 0;
                while (n > 0) {
                    rem = n % 10;
                    sum += rem;
                    n = n / 10;
                }
            }
            n = sum;
            if(n<10){
                System.out.println(n);
                break;
            }
        }
    }
}
