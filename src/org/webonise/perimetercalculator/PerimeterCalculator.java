package org.webonise.perimetercalculator;

public class PerimeterCalculator implements PolygonCalculator{
    private int noOfSides;
    private Double sideLength,perimeter;
    public PerimeterCalculator(int noOfSides,double sideLength){
        this.noOfSides=noOfSides;
        this.sideLength=sideLength;
    }
    @Override
    public void calculator() {
        perimeter=noOfSides*sideLength;
    }
    @Override
    public void printResult() {
        System.out.println("Perimeter :"+perimeter);
    }
}
