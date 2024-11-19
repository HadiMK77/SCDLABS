//2022F-BSE-063
package Lab6t2;

class Traythread extends Thread {
    private Printer printer;
    private int pagesToAdd;

    public Traythread(Printer printer, int pagesToAdd) {
        this.printer = printer;
        this.pagesToAdd = pagesToAdd;
    }

    @Override
    public void run() {
        printer.addPages(pagesToAdd);
    }
}

