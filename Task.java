//2022F-BSE-063
package L7task;

public class Task {
    private int taskId;
    private String taskDescription;
    private boolean isCompleted;

    public Task(int taskId, String taskDescription) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.isCompleted = false;
    }

    public synchronized void markAsCompleted() {
        this.isCompleted = true;
        System.out.println("Task " + taskId + " completed: " + taskDescription);
    }

    public synchronized boolean isCompleted() {
        return isCompleted;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}

