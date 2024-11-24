//2022F-BSE-063
package Lab6t1;

public class Main1 {
    public static void main(String[] args) {
        Bankacc sharedAccount = new Bankacc();
        
        Uthread userA = new Uthread(sharedAccount, "User A", 45000);
        Uthread userB = new Uthread(sharedAccount, "User B", 20000);
        userA.start();
        userB.start();
    }
}
