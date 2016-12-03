/**
 * Created by navjot on 3/12/16.
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Melbourne");
        bank.addCustomer("Melbourne", "Nav", 99.99);
        bank.addCustomer("Melbourne", "Jones", 95.99);

        bank.addBranch("Shepparton");
        bank.addCustomer("Shepparton", "James", 200.99);

        bank.addCustomerTransaction("Melbourne", "Nav", 22.95);
        bank.addCustomerTransaction("Melbourne", "Jones", 25.75);
        bank.addCustomerTransaction("Shepparton", "James", 50.97);
        bank.addCustomerTransaction("Melbourne", "Nav", 24.85);

        bank.listCustomers("Melbourne", true);
        bank.listCustomers("Shepparton", true);

    }
}
