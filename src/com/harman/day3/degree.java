package com.harman.day3;

import java.util.Scanner;

public class degree {
    public static void main(String[] args) {
        float fahrenheit,celsius;
        Scanner x=new Scanner((System.in));
        System.out.println(" ent fahrenheit");
        fahrenheit=x.nextFloat();
        celsius=((fahrenheit-32)*5)/9;
        System.out.println("temp in celcious :"+celsius);
    }
}
