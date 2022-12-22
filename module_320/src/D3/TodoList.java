package D3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TodoList {

    List<Task> todoLists = new ArrayList<>();

    public void addTask(Task task){
        todoLists.add(task);
    }

    public void printList(){
        for (Task task: todoLists) {
            System.out.println(task.taskName);
            System.out.println(task.priority);
            System.out.println(task.endDate);
        }
    }

    public void deleteTask(String taskName){
        todoLists.removeIf(task -> Objects.equals(task.taskName, taskName));
    }
}
