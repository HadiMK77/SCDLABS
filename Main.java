package Lab5task1;
//2022F-BSE-063
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Thread alphabetThread = new Thread(new AlphabetPrinter());
        alphabetThread.start();
    }
}

class AlphabetPrinter implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Printed Alphabets:");
        for (int i = 0; i < 26; i++) {
            int randomNum = random.nextInt(26);
            char randomChar = (char) ('A' + randomNum);
            
            System.out.print(randomChar + " ");
            
            try {
                Thread.sleep(100 + random.nextInt(400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}






