//2022F-BSE-063
package L7task;
import java.util.LinkedList;
import java.util.Queue;

public class Taskmanager {
    private Queue<Task> taskQueue;
    private final Object lock = new Object();

    public Taskmanager() {
        taskQueue = new LinkedList<>();
    }

    public synchronized void addTask(Task task) {
        taskQueue.offer(task);
        System.out.println("Added Task " + task.getTaskId() + ": " + task.getTaskDescription());
    }

    public synchronized Task getNextTask() {
        return taskQueue.poll(); // Get the next task for the worker
    }

    public synchronized boolean hasPendingTasks() {
        return !taskQueue.isEmpty();
    }
}

