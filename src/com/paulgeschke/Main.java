package com.paulgeschke;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please Enter Item Costs: ");
        Scanner input = new Scanner(System.in);

        double totalCost = 0;
        double inputCost;
        String totalCostA;
        String taxesA;
        String totalWithTaxesA;
        String tipAmountA;

        do {
            inputCost= input.nextDouble();
            totalCost += inputCost;
        }while (inputCost != 0);
        //System.out.println("Debug #1: " + totalCost);
        double taxes = totalCost * 0.025;
        //System.out.println("Debug #2: " + taxes);
        double totalWithTaxes = taxes + totalCost;
        //System.out.println("Debug #3: " + totalWithTaxes);
        double tipAmount = totalWithTaxes * 0.175;
        //System.out.println("Debug #4: " + tipAmount);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        totalCostA = nf.format(totalCost);
        taxesA = nf.format(taxes);
        totalWithTaxesA = nf.format(totalWithTaxes);
        tipAmountA = nf.format(tipAmount);

        System.out.println("Total $" + totalCostA);
        System.out.println("Tax: $" + taxesA);
        System.out.println("Total With Tax: $" + totalWithTaxesA);
        System.out.println("Suggested Tip: $" + tipAmountA);
    }
}
