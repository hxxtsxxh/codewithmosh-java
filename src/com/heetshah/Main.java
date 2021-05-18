package com.heetshah;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Simple Interest Calculator
            - Principal: initial amount
            - Rate: rate of interest per year in decimal
            - Time/Period: how many years
            Formula: P x A x R
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Rate: ");
        double ir = scanner.nextDouble();

        System.out.print("Period (Years): ");
        byte time = scanner.nextByte();



        var formula = principal * (ir/100) * time;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Simple Interest: " + currency.format(formula));

    }
}
