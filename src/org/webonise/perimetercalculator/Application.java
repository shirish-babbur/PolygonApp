package org.webonise.perimetercalculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    private static Logger LOGGER = Logger.getLogger(Application.class.getName());
    private LoggerManager loggerManager = new LoggerManager();
    private static final int UPPERBOUND = 3;
    private static final int LOWERBOUND = 8;
    private int noOfSides;
    private double sideLength;

    public void startApplication() {
        Scanner input = new Scanner(System.in);
        LOGGER = loggerManager.getLOGGER(LOGGER);
        LOGGER.log(Level.FINE, "Enter No of Sides and Length of Side");
        noOfSides = input.nextInt();
        sideLength = input.nextDouble();
        if (noOfSides >= UPPERBOUND && noOfSides <= LOWERBOUND) {
            PolygonCalculator polygon = new InternalAngleCaculator(noOfSides);
            polygon.calculator();
            polygon.printResult();
            polygon = new PerimeterCalculator(noOfSides, sideLength);
            polygon.calculator();
            polygon.printResult();
        } else {
            LOGGER.log(Level.WARNING, "No of sides must be between 3 to 8");
        }
    }
}
