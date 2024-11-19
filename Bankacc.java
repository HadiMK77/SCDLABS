//2022F-BSE-063
package Lab6t1;

class Bankacc {
    private int balance = 50000;
 
    public synchronized void withdraw(String user, int amount) {
        if (amount <= balance) {
            System.out.println("The "+ user + " is attempting to withdraw= " + amount);
            balance -= amount;
            System.out.println(user + " successfully withdrew= " + amount);
            System.out.println("Remaining balance= " + balance);
        } else {
            System.out.println(user + " tried to withdraw= " + amount + ", but funds are insufficient.");
        }
    }
}






