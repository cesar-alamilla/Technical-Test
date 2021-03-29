package com.anexinet.test7;

import java.math.BigDecimal;

public class AnexinetTest7 {

    public static void main(String[] args) {
        final Case7 case7 = new Case7();
        
        final BigDecimal binaryRepresentation = case7.transformFractionToBinary(0.15, 32);
        System.out.println("Binary representation: " + binaryRepresentation);
    }

}
