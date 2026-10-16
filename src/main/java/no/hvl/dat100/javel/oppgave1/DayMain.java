package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        System.out.println("a) Strømpriser");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("");

        System.out.println("b) strømbruks");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("");

        System.out.println("C) strømbruk for 1 dag");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));

        System.out.println("D) Spotprise");
        System.out.println(DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println("");

        System.out.println("F) powerSuport");
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println("");

        System.out.println("g) norges pris");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println("");

        System.out.println("h) ");
        System.out.println(DailyPower.findPeakUsage(powerusage_day));
        System.out.println("");

        System.out.println("i) ");
        System.out.println(DailyPower.findAvgPower(powerusage_day));
        System.out.println("");
    }
}
