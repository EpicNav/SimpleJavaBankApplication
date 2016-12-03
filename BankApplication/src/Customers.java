import java.util.ArrayList;

/**
 * Created by navjot on 3/12/16.
 */
public class Customers {

    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name, double initialAmount){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
