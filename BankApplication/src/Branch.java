import java.util.ArrayList;

/**
 * Created by navjot on 3/12/16.
 */
public class Branch {

    private String branchName;
    private ArrayList<Customers> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customers>();
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){

        Customers existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++){
            Customers customers = this.customers.get(i);
            if(customers.getName().equals(customerName)){
                return customers;
            }
        }
        return null;
    }
}
