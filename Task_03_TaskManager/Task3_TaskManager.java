package Task_03_TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    int id;
    String name;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Task3_TaskManager {
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int taskId = 1;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- TASK MANAGER ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> updateTask();
                case 4 -> deleteTask();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    static void addTask() {
        System.out.print("Enter task name: ");
        String name = sc.nextLine();
        tasks.add(new Task(taskId++, name));
        System.out.println("Task added successfully");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t.id + " : " + t.name);
        }
    }

    static void updateTask() {
        System.out.print("Enter task id to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Task t : tasks) {
            if (t.id == id) {
                System.out.print("Enter new task name: ");
                t.name = sc.nextLine();
                System.out.println("Task updated");
                return;
            }
        }
        System.out.println("Task not found");
    }

    static void deleteTask() {
        System.out.print("Enter task id to delete: ");
        int id = sc.nextInt();

        for (Task t : tasks) {
            if (t.id == id) {
                tasks.remove(t);
                System.out.println("Task deleted");
                return;
            }
        }
        System.out.println("Task not found");
    }
}
