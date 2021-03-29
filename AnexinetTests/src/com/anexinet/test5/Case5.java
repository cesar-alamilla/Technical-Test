package com.anexinet.test5;

import java.util.ArrayList;
import java.util.List;

public class Case5 {
    
    private final static String OPEN = "(";
    
    private final static String CLOSE = ")";

    public void printValidParenthesesCombination(final Integer userInput) {
        List<String> combinations = new ArrayList<String>();
         this.generateParenthesesCombination("", 0, 0, userInput, combinations);
        System.out.println("ans: " + combinations.toString());
    }
    
    public void generateParenthesesCombination(final String parenthesesCombinations, final Integer parenthesesOpened, 
            final Integer parenthesesClosed, final Integer userInput, final List<String> combinations){
        //final condition the given input*2 = the max number of parentheses in a combination 
        if (parenthesesCombinations.length() == userInput * 2) {
            combinations.add(parenthesesCombinations);
            return;
        }
        // first we generate the open parentheses
        if (parenthesesOpened < userInput)
            generateParenthesesCombination(parenthesesCombinations+OPEN, parenthesesOpened+1, parenthesesClosed, userInput, combinations);
        // then we close the parentheses in the proper order 
        if (parenthesesClosed < parenthesesOpened)
            generateParenthesesCombination(parenthesesCombinations+CLOSE, parenthesesOpened, parenthesesClosed+1, userInput, combinations);
    }
}
