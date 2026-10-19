package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers kunder = new Customers(5);

        Customer c1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);
        Customer ekstra = new Customer("Extra Customer", "extra@example.com", 1006, PowerAgreementType.SPOTPRICE);

        System.out.println("Legger til eksempelkundene:");
        System.out.println(kunder.addCustomer(c1));
        System.out.println(kunder.addCustomer(c2));
        System.out.println(kunder.addCustomer(c3));
        System.out.println(kunder.addCustomer(c4));
        System.out.println(kunder.addCustomer(c5));
        System.out.println("Antall kunder: " + kunder.countNonNull());

        System.out.println();
        System.out.println("Soker etter kunde 1003:");
        System.out.println(kunder.getCustomer(1003));
        System.out.println("Soker etter kunde 9999:");
        System.out.println(kunder.getCustomer(9999));

        System.out.println();
        System.out.println("Prøver a legge til en kunde nar tabellen er full:");
        System.out.println(kunder.addCustomer(ekstra));

        System.out.println();
        System.out.println("Kunder i den nye tabellen:");
        for (Customer kunde : kunder.getCustomers()) {
            System.out.println(kunde);
        }

        System.out.println();
        System.out.println("Fjerner kunde 1004:");
        System.out.println(kunder.removeCustomer(1004));
        System.out.println("Antall kunder etter fjerning: " + kunder.countNonNull());
        System.out.println("Prøver a fjerne kunde 9999:");
        System.out.println(kunder.removeCustomer(9999));
    }
}
