package Lab6t2;

class Printthread extends Thread {
    private Printer printer;
    private int pagesToPrint;

    public Printthread(Printer printer, int pagesToPrint) {
        this.printer = printer;
        this.pagesToPrint = pagesToPrint;
    }

    @Override
    public void run() {
        printer.printPages(pagesToPrint);
    }
}







