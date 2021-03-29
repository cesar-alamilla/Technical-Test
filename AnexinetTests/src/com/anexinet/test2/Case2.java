package com.anexinet.test2;


public class Case2 {

    /**
     * Function that reverse the given string
     * @param originalString
     * @return the originalString reversed
     * @throws NullPointerException if the given parameter is null
     */
    public String reverseString(final String originalString) {
        if(originalString == null) throw new NullPointerException("The given parameter is null");
        
        final StringBuilder strBuild = new StringBuilder();
        final char[] charactersInString = originalString.toCharArray();
        
        for(int i = charactersInString.length; i >= 1; i--) {
            strBuild.append(charactersInString[i - 1]);
        }
        
        return strBuild.toString();
    }
}
