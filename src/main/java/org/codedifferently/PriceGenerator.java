package org.codedifferently;

import java.util.Random;

public class PriceGenerator {
    Random random2 = new Random();

    public double priceGenerator() {
        double sum = random2.nextDouble(1) * 100;
        return Math.round(sum);
    }

    public double  calculateSubTotal (double item1, double item2, double item3){
        return item1 + item2 + item3;
    }

    public double taxCalculator(double subTotal ) {
        return .06 * subTotal;
    }


}
