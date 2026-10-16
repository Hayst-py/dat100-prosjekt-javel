package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        int day = 1;
        for (double[] d : usage) {
            System.out.print("Day " + day + ":");
            DailyPower.printPowerUsage(d);
            System.out.println();
            day++;
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        int day = 1;
        for (double[] d : prices) {
            System.out.print("Day" + day + ":");
            DailyPower.printPowerPrices(d);
            System.out.println();
            day++;
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (double[] d : usage) {
            sum += DailyPower.computePowerUsage(d);
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int day = 0;

        while (day < powerusage.length && !exceeded) {
            usage += DailyPower.computePowerUsage(powerusage[day]);
            if (usage > threshold) {
                exceeded = true;
            }
            day++;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        for (int i = 0; i < usage.length; i++) {
            price += DailyPower.computeSpotPrice(usage[i], prices[i]);
        }
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            support += DailyPower.computePowerSupport(usage[i], prices[i]);
        }
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
