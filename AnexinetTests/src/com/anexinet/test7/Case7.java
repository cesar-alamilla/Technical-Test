package com.anexinet.test7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Case7 {
    
    private static final BigDecimal TWO = new BigDecimal(2);
    
    /**
     * Given a fraction of a decimal and a limit of digits it can container this function will return 
     * the binary representation of the fraction
     * @param fraction
     * @param limit
     * @return {@link BigDecimal} with the representantion of the fraction as a binary
     */
    public BigDecimal transformFractionToBinary(final Double fraction, final Integer limit) {

        final List<Integer> resultValues = new ArrayList<Integer>();

        this.calculateBinaryValue(new BigDecimal(fraction), limit, 0, resultValues);

        return new BigDecimal(this.concatenateValues(resultValues));
    }

    private void calculateBinaryValue(final BigDecimal fraction, final Integer limit, final Integer counter, final List<Integer> resultValues) {
        // if we reach the limit or the fraction are 0
        if(counter >= limit || BigDecimal.ZERO.compareTo(fraction) == 0)
            return;
        System.out.println("interation #" + counter);
                
        final BigDecimal binaryRepresentation = fraction.multiply(TWO);
        final Integer binaryValue = binaryRepresentation.intValue();
        resultValues.add(binaryValue);
        final BigDecimal newFraction = binaryRepresentation.subtract(new BigDecimal(binaryValue));
        
        this.calculateBinaryValue(newFraction, limit, counter+1, resultValues);
    }
    
    private String concatenateValues(List<Integer> resultValues) {
        final StringBuilder strBuild = new StringBuilder();
        
         strBuild.append(resultValues.size() == 0 ? "0.0" : ".");
        
        for(Integer value: resultValues) {
            strBuild.append(value);
        }
        
        return strBuild.toString();
    }
}
