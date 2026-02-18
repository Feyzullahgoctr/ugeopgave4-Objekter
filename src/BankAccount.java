import java.util.ArrayList;

public class BankAccount {

    private String owner;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        transactions = new ArrayList<>();
        transactions.add(new Transaction("deposit", balance));
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            this.transactions.add(new Transaction("deposit", amount));
            System.out.println(amount +" kr was deposited.");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            this.transactions.add(new Transaction("withdraw", amount));
            System.out.println(amount +" kr was withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("\n " + owner + " Transaction :");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }

    public Transaction getLargestTransaction(){

        if (transactions.size() == 0) {
            return null;
        }

        Transaction maxAmountTransaction = transactions.get(0);
        for (Transaction t : transactions) {
            if (maxAmountTransaction.getAmount() < t.getAmount()) {
                maxAmountTransaction = t;
            }
        }
        return maxAmountTransaction;
    }

}
