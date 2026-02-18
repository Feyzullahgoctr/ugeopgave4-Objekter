public class Opgave3Main {

    void main() {

        BankAccount bankAccount = new BankAccount("Feyzullah", 2000);
        bankAccount.deposit(500);
        bankAccount.deposit(600);
        bankAccount.withdraw(200);
        bankAccount.withdraw(100);
        bankAccount.withdraw(3000);

        bankAccount.printTransactionHistory();

        System.out.println("\nTotal Available Balance : " + bankAccount.getBalance());

        // Ekstra udfordring
        Transaction maxAmountTransaction = bankAccount.getLargestTransaction();
        System.out.println("Max Amount Transaction : ");
        System.out.println(maxAmountTransaction);

    }

}
