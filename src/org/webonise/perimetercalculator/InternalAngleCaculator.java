package org.webonise.perimetercalculator;

public class InternalAngleCaculator implements PolygonCalculator{
    private int noOfSides;
    private int sumOfAngles;
    private final int pie=180;
    public InternalAngleCaculator(int noOfSides){
            this.noOfSides=noOfSides;
    }
    @Override
    public void calculator() {
        sumOfAngles=pie*(noOfSides-2);
    }
    @Override
    public void printResult() {
        System.out.println("Sum Of Interior Angles:"+sumOfAngles);
    }
}
