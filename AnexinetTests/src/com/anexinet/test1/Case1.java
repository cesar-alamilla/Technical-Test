package com.anexinet.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Case1 {

    /**
     * Given to {@link Date} objects this method will return the difference between them in minutes.
     * <p> Order between dates doesn't matters.
     * @param  {@link Date} firstDate the first date
     * @param  {@link Date} secondDate the second date
     * @return {@link long} the difference in minutes
     * @throws NullPointerException if any of the parameters is null
     */
    public long getDifferenceInMinutes(final Date firstDate, final Date secondDate) {
        this.validateDates(firstDate, secondDate);
        
        long diffInMilliSeconds = Math.abs(firstDate.getTime() - secondDate.getTime());
        return TimeUnit.MINUTES.convert(diffInMilliSeconds, TimeUnit.MILLISECONDS);
    }
    
    private void validateDates(final Date firstDate, final Date secondDate) {
        if (firstDate == null) {
            throw new NullPointerException("First date param is null");
        }
        
        if(secondDate == null) {
            throw new NullPointerException("Second date param is null");
        }
    }
    
    /**
     * Method to get a {@link Date} object from a {@link String} with the format MM/dd/yyyy HH:mm:ss 
     * @param stringToParse {@link String} with format MM/dd/yyyy
     * @return The {@link Date} related to the provided {@link String}  
     * @throws ParseException if the parameter provided couldn't be parsed
     * @throws NullPointerException if the parameter provided is null
     */
    public Date generateDateFromString(final String stringToParse) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        return sdf.parse(stringToParse);
    }
}
