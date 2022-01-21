package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Principal : ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Interest rate : ");
        float interestRate = scanner.nextFloat();
        System.out.print("Enter the number of of years: ");
        int noOfYears = scanner.nextInt();
        MortageCalculator mortageCalculator = new MortageCalculator();
        mortageCalculator.calculateMortage(principal,interestRate,noOfYears);
    }
}
