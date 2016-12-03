/**
 * Created by navjot on 3/12/16.
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Melbourne");
        bank.addCustomer("Melbourne", "Navjot Singh Kamboj", 99.99);
        bank.addCustomer("Melbourne", "Gulzar Khan", 95.99);

        bank.addBranch("Shepparton");
        bank.addCustomer("Shepparton", "Jaspal Singh Kamboj", 200.99);

        bank.addCustomerTransaction("Melbourne", "Navjot Singh Kamboj", 22.95);
        bank.addCustomerTransaction("Melbourne", "Gulzar Khan", 25.75);
        bank.addCustomerTransaction("Shepparton", "Jaspal Singh Kamboj", 50.97);
        bank.addCustomerTransaction("Melbourne", "Navjot Singh Kamboj", 24.85);

        bank.listCustomers("Melbourne", true);
        bank.listCustomers("Shepparton", true);

    }
}
