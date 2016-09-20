package org.webonise.perimetercalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PerimeterCalculator implements PolygonCalculator {
    private static Logger LOGGER = Logger.getLogger(PerimeterCalculator.class.getName());
    private LoggerManager loggerManager = new LoggerManager();
    private int noOfSides;
    private double sideLength;
    private double perimeter;

    public PerimeterCalculator(int noOfSides, double sideLength) {
        LOGGER = loggerManager.getLOGGER(LOGGER);
        this.noOfSides = noOfSides;
        this.sideLength = sideLength;
    }

    @Override
    public void calculator() {
        perimeter = noOfSides * sideLength;
    }

    @Override
    public void printResult() {
        LOGGER.log(Level.FINE, "Perimeter :" + perimeter);
    }
}
