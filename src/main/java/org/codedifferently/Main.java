package org.codedifferently;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CodeGenerator code = new CodeGenerator();
        WelcomeMessage welcome = new WelcomeMessage();
        PriceGenerator price = new PriceGenerator();

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("What is your budget?");
        double budget = scanner.nextDouble();

        System.out.println("What is your coupon Code?");
        String coupon = scanner.next();

        welcome.displayWelcomeMessage();

        double item1 = price.priceGenerator();
        double item2 = price.priceGenerator();
        double item3= price.priceGenerator();

        System.out.println("ID Code: " + code.idNumber());
        System.out.println("Receipt Code: " + code.receiptCode());
        System.out.println("Item 1: " + "$" + item1);
        System.out.println("Item 2: " + "$" + item2);
        System.out.println("Item 3: " + "$" + item3);

        double itemSum = item1 + item2 + item3;

        double finalCost = price.taxCalculator(itemSum) + itemSum;

        System.out.println("Subtotal: " + itemSum);
        System.out.println("Final Total: " + finalCost);

        if(budget < finalCost){
            double costDifference = finalCost - budget;
            costDifference = Math.round(costDifference);
            System.out.println("You do not have enough. You need " + costDifference + " to complete order");
        } else {
            System.out.print("Thank you for shopping");
        }


    }
}
