//2022F-BSE-063
package L7task;
public class Banksys {
    public static void main(String[] args) {
    	Bankaccount account = new Bankaccount(1000);

        Thread t1 = new Transthread(account, true, 500);  
        Thread t2 = new Transthread(account, false, 300);
        Thread t3 = new Transthread(account, true, 200);  
        Thread t4 = new Transthread(account, false, 400);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Final balance: " + account.getBalance());
    }
}



