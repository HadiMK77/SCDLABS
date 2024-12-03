//2022F-BSE-063
package L7task;

public class Worker extends Thread {
    private Taskmanager taskManager;
    private int workerId;

    public Worker(Taskmanager taskManager, int workerId) {
        this.taskManager = taskManager;
        this.workerId = workerId;
    }

    @Override
    public void run() {
        try {
            Task task;
            while ((task = taskManager.getNextTask()) != null) {
                System.out.println("Worker " + workerId + " processing Task " + task.getTaskId() + ": " + task.getTaskDescription());
                Thread.sleep(1000);
                task.markAsCompleted();
            }
        } catch (InterruptedException e) {
            System.out.println("Worker " + workerId + " was interrupted.");
        }
    }
}

