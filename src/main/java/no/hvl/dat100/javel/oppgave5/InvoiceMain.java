package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer a = new Customer("Lasse", "Lasse@gmail.com", 1, PowerAgreementType.SPOTPRICE);
        Customer b = new Customer("Sebastian", "Sebastian@gmail.com", 2, PowerAgreementType.POWERSUPPORT);
        Customer d = new Customer("Martin", "Martin@gmail.com", 3, PowerAgreementType.NORGESPRICE);

        double[][] prices = MonthPowerData.powerprices_month;

        Invoice[] invoices = {
                new Invoice(a, "January", CustomerPowerUsageData.usage_month_customer1, prices),
                new Invoice(b, "January", CustomerPowerUsageData.usage_month_customer2, prices),
                new Invoice(d, "January", CustomerPowerUsageData.usage_month_customer3, prices)
        };

        Invoices.processInvoices(invoices);

    }
}
