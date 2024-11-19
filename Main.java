package Lab6t2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Printthread printJob = new Printthread(printer, 15);
        printJob.start();

        Traythread addPages = new Traythread(printer, 10);
        addPages.start();
    }
}




