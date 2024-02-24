package Generics;
import java.util.*;

public class Bank <T extends BankAccount>
{
    private List<T> accounts = new ArrayList<>();

    public Bank(List<T> accounts) {
        this.accounts = accounts;
    }

    public Bank(){

    }

    public void addAccount(T account){
        accounts.add(account);
    }

    public void removeAccount(String accountNumber) {
        for (T account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                break;
            }
        }
    }

    public T getAccount(String accountNumber) {
        for (T account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
