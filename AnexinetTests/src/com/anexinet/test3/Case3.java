package com.anexinet.test3;

import java.util.ArrayList;
import java.util.List;

public class Case3 {
    
    /**
     * Function that combine the elements of two arrays of type {@link String}
     * <p>
     * For example given [x,y,z], [10,20,30] it will generate the next arrat [x,10,y,20,z,30]
     * @param firstArray
     * @param secondArray
     * @return the array with their elements alternatingly combined
     * @throws NullPointerException if any of the parameters is null
     */
    public String[] combineArrays(final String[] firstArray, final String[] secondArray) {
        final List<String> combinedArray = new ArrayList<String>();

        Integer counter = 0;
        while(counter < firstArray.length || counter < secondArray.length) {
            
            if(counter < firstArray.length) {
                combinedArray.add(firstArray[counter]);
            }
            
            if(counter < secondArray.length) {
                combinedArray.add(secondArray[counter]);
            }
            
            counter++;
        }
        
        return combinedArray.toArray(new String [combinedArray.size()]);
    }

}
