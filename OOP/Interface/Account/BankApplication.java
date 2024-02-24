package OOP.Interface.Account;

public class BankApplication implements BankApplicationInterface
{
    protected String name;
    protected Account[] accounts = new Account[1000];
    protected int sizeOfAccounts = 0;

    public BankApplication(String name, Account[] accounts, int sizeOfAccounts) {
        this.name = name;
        this.accounts = accounts;
        this.sizeOfAccounts = sizeOfAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addAccount(Account a) {
        accounts[sizeOfAccounts] = a;
        sizeOfAccounts++;
    }

    @Override
    public void printAccounts(){
        for (int i = 0; i < sizeOfAccounts; i++) {
            System.out.println(accounts[i]);
        }
    }

    @Override
    public Account getMaxBalance() {
        Account richBitch = accounts[0];
        double maxBalance = richBitch.balance;

        if (sizeOfAccounts == 0) {
            return null;
        }

        for (int i = 1; i < sizeOfAccounts; i++) {
            if (accounts[i] != null && accounts[i].getBalance() > maxBalance) {
                richBitch = accounts[i];
                maxBalance = accounts[i].getBalance();
            }
        }

        return richBitch;
    }
}
