//2022F-BSE-063
package Lab6t2;

class Printer {
    private int pagesInTray = 10;

    public synchronized void printPages(int pagesToPrint) {
        while (pagesToPrint > pagesInTray) {
            try {
                System.out.println("Not enough pages in the tray. Waiting for more pages...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pagesInTray -= pagesToPrint;
        System.out.println("Printing " + pagesToPrint + " pages.");
        System.out.println("Remaining pages in tray: " + pagesInTray);
    }

    public synchronized void addPages(int pages) {
        pagesInTray += pages;
        System.out.println("Added " + pages + " pages to the tray.");
        notify();
}
}












