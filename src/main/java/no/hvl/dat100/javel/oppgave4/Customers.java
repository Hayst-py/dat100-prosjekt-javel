package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {
    
    private Customer[] customers;
    
    public Customers(int size) {
        this.customers = new Customer[size];
    }

    public int countNonNull() {
        int count = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    public Customer getCustomer(int customer_id) {
        boolean funnet = false;
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                funnet = true;
            }
        }
        return c;
    }


    public boolean addCustomer(Customer c) {
        boolean inserted = false;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
            }
        }
        return inserted;
    }

    
    public Customer removeCustomer(int customer_id) {
        boolean deleted = false;
        Customer c = null;
        for (int i = 0; i < customers.length; i++){
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                deleted = true;
            }
        }
        return c;
    }

    public Customer[] getCustomers() {
        Customer[] customers = null;

        int count = countNonNull();
        customers = new Customer[count];

        int index = 0;

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] != null){
                customers[index] = this.customers[i];
                index++;
            }
        }
        return customers;
    }
}