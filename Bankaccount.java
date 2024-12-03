//2022F-BSE-063
package L7task;
public class Bankaccount {
    private double balance;

    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount + ", New Balance: " + balance);
        }
    }
    public synchronized void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }
    public synchronized double getBalance() {
        return balance;
    }
}


