package com.anexinet.test3;


public class AnexinetTest3 {

    public static void main(String[] args) {
        final Case3 case3 = new Case3();
        
        final String[] firstTest = case3.combineArrays(
                new String[] {"x","y","z"}, 
                new String[] {"10","20","30"});
        printArray(firstTest);
        
        final String[] secondTest = case3.combineArrays(
                new String[] {"x","y"}, 
                new String[] {"10","20","30"});
        printArray(secondTest);
        
        final String[] thirdTest = case3.combineArrays(
                new String[] {"x","y","z"},  
                new String[] {"10"});
        printArray(thirdTest);
        
        final String[] fourthTest = case3.combineArrays(
                new String[] {"x","y","z"},  
                new String[] {});
        printArray(fourthTest);
        
        final String[] fithTest = case3.combineArrays(
                new String[] {},  
                new String[] {});
        printArray(fithTest);
        
        final String[] sixthTest = case3.combineArrays(
                new String[] {"a","b","c","d","x","y","z"}, 
                new String[] {"10","20","30"});
        printArray(sixthTest);        
    }
    
    public static void printArray(final String[] arrayToPrint) {
        final StringBuilder strBuild = new StringBuilder();
        strBuild.append("array values: [");
        for(int i = 0; i < arrayToPrint.length; i++) {
            if(i != 0) strBuild.append(",");
                
            strBuild.append(arrayToPrint[i]);
        }
        strBuild.append("]");
        System.out.println(strBuild.toString());
    }

}
