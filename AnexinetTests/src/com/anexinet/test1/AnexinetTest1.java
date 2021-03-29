package com.anexinet.test1;

import java.text.ParseException;
import java.util.Date;

public class AnexinetTest1 {
    

    public static void main(String[] args) throws ParseException {
        final Case1 testCase = new Case1();
        
        final long testCase1 = testCase.getDifferenceInMinutes(
                new Date(), 
                testCase.generateDateFromString("04/01/2021 00:00:00"));
        System.out.println("Differente in minutes between now and 04/01/2021 00:00:00 in minutes is " + testCase1);
        
        final long testCase2 = testCase.getDifferenceInMinutes(new Date(), new Date());
        System.out.println("The difference in minutes between now and now is " + testCase2);
        
        final long testCase3 = testCase.getDifferenceInMinutes(
                testCase.generateDateFromString("04/01/2022 00:00:00"), 
                testCase.generateDateFromString("04/01/2021 00:00:00"));
        System.out.println("The minutes in a year is " + testCase3);
    }

}
