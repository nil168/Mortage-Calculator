package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class MortageCalculator {
    void calculateMortage(double principal,float interestRate,int noOfYears){
        final byte MONTHS_OF_YEAR = 12;
        final byte PERCENT = 100;
        interestRate = interestRate / (PERCENT * MONTHS_OF_YEAR );
        int noOfPayments = noOfYears * MONTHS_OF_YEAR;
        double mortage = (principal * interestRate * (Math.pow((1+interestRate),noOfPayments)))/((Math.pow((1+interestRate),noOfPayments))-1);
        String formattedMortage = NumberFormat.getCurrencyInstance(Locale.US).format(mortage);
        System.out.println("The mortage is : "+formattedMortage);
    }
}
