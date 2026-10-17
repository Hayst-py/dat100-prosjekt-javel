package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer kunde1 = new Customer("Hans", "hansing@gmail.com", 1, PowerAgreementType.NORGESPRICE);

        System.out.println(kunde1);

        kunde1.setAgreement(PowerAgreementType.POWERSUPPORT);
        
        System.out.println(kunde1.getAgreement());

        System.out.println(kunde1);
    }
}
