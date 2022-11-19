package exercise45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer customer = new Customer(customerName, initialTransaction);
        if(findCustomer(customerName) == null){
            this.customers.add(customer);
            return true;
        }
            return false;

    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i< this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;

    }


}
