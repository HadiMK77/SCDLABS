//2022F-BSE-063
package Lab6t1;

class Uthread extends Thread {
    private Bankacc account;
    private String userName;
    private int amountToWithdraw;

    public Uthread(Bankacc account, String userName, int amountToWithdraw) {
        this.account = account;
        this.userName = userName;
        this.amountToWithdraw = amountToWithdraw;
    }
    
    @Override
    public void run() {
        account.withdraw(userName, amountToWithdraw);
    }
}





