//2022F-BSE-063
package L7task;
public class Transthread extends Thread {
    private Bankaccount account;
    private boolean isDeposit;
    private double amount;
    public Transthread(Bankaccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }
    @Override
    public void run() {
        try {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Transaction interrupted");
        }
    }
}


