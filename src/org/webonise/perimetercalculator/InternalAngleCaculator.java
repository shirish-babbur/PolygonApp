package org.webonise.perimetercalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InternalAngleCaculator implements PolygonCalculator {
    private static Logger LOGGER = Logger.getLogger(InternalAngleCaculator.class.getName());
    private LoggerManager loggerManager = new LoggerManager();
    private final static int pie = 180;
    private int noOfSides;
    private int sumOfAngles;

    public InternalAngleCaculator(int noOfSides) {
        LOGGER = loggerManager.getLOGGER(LOGGER);
        this.noOfSides = noOfSides;
    }

    @Override
    public void calculator() {
        sumOfAngles = pie * (noOfSides - 2);
    }

    @Override
    public void printResult() {
        LOGGER.log(Level.FINE, "Sum Of Interior Angles:" + sumOfAngles);
    }
}
