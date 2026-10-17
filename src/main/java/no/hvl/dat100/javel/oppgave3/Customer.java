package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    public String getName() {
        return name;
    }
    public void setName(String NewName) {
        this.name = NewName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String NewEmail) {
        this.email = NewEmail;
    }

    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int NewCustomer_id) {
        this.customer_id = NewCustomer_id;
    }

    public PowerAgreementType getAgreement() {
        return agreement;
    }
    public void setAgreement(PowerAgreementType NewAgreement) {
        this.agreement = NewAgreement;
    }



    // TODO - toString method

}
