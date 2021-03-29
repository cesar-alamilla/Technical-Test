package com.anexinet.test2;


public class AnexinetTest2 {

    public static void main(String[] args) {
        final Case2 testCase = new Case2();
        
        final String reversedString = testCase.reverseString("123456789");
        System.out.println("reversedString: " + reversedString);
        
        final String reversedString2 = testCase.reverseString("");
        System.out.println("reversedString: " + reversedString2);
        
        final String reversedString3 = testCase.reverseString("zyxwvutsrqponmlkjihgfedcba ZYXWVUTSRQPONMLKJIHGFEDCBA");
        System.out.println("reversedString: " + reversedString3);
        
        final String symbolString = testCase.reverseString("!@#$%ˆ&*()_+{}:',./<>?:'][=-");
        System.out.println("reversedString: " + symbolString);
        
        final String symbolString2 = testCase.reverseString(" a \" z ");
        System.out.println("reversedString: " + symbolString2);
        
        try {
            final String nullObject = testCase.reverseString(null);
            System.out.println("reversedString: " + nullObject);            
        } catch(NullPointerException npe) {
            System.out.println("catched error: " + npe.getMessage());
        }
    }

}
