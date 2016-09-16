package org.webonise.perimetercalculator;

import java.util.Scanner;

public class Application {
    public void startApplication(){
        int noOfSides;
        double sideLength;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No of Sides and Length of Side");
        noOfSides=input.nextInt();
        sideLength=input.nextDouble();
        if(noOfSides >=3 && noOfSides <=8){
            PolygonCalculator polygon=new InternalAngleCaculator(noOfSides);
            polygon.calculator();
            polygon.printResult();

            polygon=new PerimeterCalculator(noOfSides,sideLength);
            polygon.calculator();
            polygon.printResult();
        }
        else {
            System.out.println("No of sides must be between 3 to 8");
        }
    }
}
