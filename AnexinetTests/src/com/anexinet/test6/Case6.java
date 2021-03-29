package com.anexinet.test6;

public class Case6 {
    
    private static final Integer HOUR_POSITION = 5;
    
    private static final Integer ANGLE = 6;

    /**
     * Return the inner angle between the poiner of hour and the poiner of minute in an analog clock
     * <p>
     * The hour parameter must be between 1 and 12
     * <p>
     * The minute parameter must be between 0 and 59
     * @param hour
     * @param minute
     * @return an {@link int} representing the inner angle between the two pointers
     */
    public int calculateInnerAngle(final Integer hour, final Integer minute) {        
        this.validateInputInfo(hour, minute);
        
        final Integer hourPointer = hour * HOUR_POSITION;
        
        final Integer calculatedAngle = Math.abs(ANGLE * (hourPointer - minute));
        
        return calculatedAngle > 180 ? 
                Math.abs(calculatedAngle - 360) : calculatedAngle;
    }
    
    private void validateInputInfo(final Integer hour, final Integer minute) throws IllegalArgumentException {
        if(hour == null) throw new IllegalArgumentException("Hour param is null");
        
        if(minute == null) throw new IllegalArgumentException("Minute param is null");        
        
        if(hour < 1 || hour > 12) throw new IllegalArgumentException("Hour not between 1 and 12");
        
        if(minute < 0 || minute > 59) throw new IllegalArgumentException("Minute param not between 1 and 59");
    }
}
