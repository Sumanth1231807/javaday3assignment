package com.harman.day3;

import java.util.Scanner;

public class root {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("The square root of "+ n+ " is: "+squareRoot(n));
    }

    public static double squareRoot(int num)
    {

        double a;
        double sqrtroot=num/2;
        do
        {
            a=sqrtroot;
            sqrtroot=(a+(num/a))/2;
        }
        while((a-sqrtroot)!= 0);
        return sqrtroot;
    }
}
