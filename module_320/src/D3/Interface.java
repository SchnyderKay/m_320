package D3;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) throws FormatException {
        TodoList todoList = new TodoList();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("What do you want to do? add/delete/print/exit");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            boolean rightFormat = true;

            switch (action) {
                case "add" -> {
                    System.out.println("Whats your task?");
                    String taskName = scanner.nextLine();
                    System.out.println("When is the deadline? DD.MM.YYYY");
                    String endDate = scanner.nextLine();
                    if (!endDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
                        throw new FormatException();
                    }
                    System.out.println("Whats the task priority?");
                    String priority = scanner.nextLine();
                    Task task = new Task(taskName, priority, endDate);
                    todoList.addTask(task);
                }
                case "delete" -> {
                    System.out.println("Which task do you want to delete?");
                    String taskToDelete = scanner.nextLine();
                    todoList.deleteTask(taskToDelete);
                }
                case "print" -> todoList.printList();
                case "exit" -> isRunning = false;
            }
        }
    }
}
