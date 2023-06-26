package org.example;

public class Main {
    public static void main(String[] args) {


                double poundToEuro = 1 + (Math.random() * 0.2);
                int pounds = 10000;
                int euros = 0;
                int days = 0;

                while (pounds > 0) {
                    poundToEuro = 1 + (Math.random() * 0.2); // Recalculate exchange rate every day

                    if (poundToEuro > 1.15 && pounds >= 1000) {
                        pounds -= 1000; // Sell 1000 pounds
                        euros += 1000 * poundToEuro; // Convert pounds to euros
                    }

                    days++; // Increment the number of days
                }

                System.out.println("It took " + days + " days for the bot to sell all of its pounds.");
            }
}