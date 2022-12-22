package D3;

public class Task{

    String taskName;
    String priority;
    String endDate;

    public Task(String taskName, String priority, String endDate) {
        this.taskName = taskName;
        this.priority = priority;
        this.endDate = endDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
