//2022F-BSE-063
package L7task;

public class Main {
    public static void main(String[] args) {
    	Taskmanager taskManager = new Taskmanager();

        for (int i = 1; i <= 5; i++) {
            taskManager.addTask(new Task(i, "Task description " + i));
        }

        Thread worker1 = new Worker(taskManager, 1);
        Thread worker2 = new Worker(taskManager, 2);
        Thread worker3 = new Worker(taskManager, 3);

        worker1.start();
        worker2.start();
        worker3.start();

        try {
            worker1.join();
            worker2.join();
            worker3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("All tasks have been processed.");
    }
}




