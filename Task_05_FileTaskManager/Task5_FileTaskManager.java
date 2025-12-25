package Task_05_FileTaskManager;

import java.io.*;
import java.util.*;

public class Task5_FileTaskManager {

    static Scanner sc = new Scanner(System.in);
    static final String FILE = "tasks.txt";

    public static void main(String[] args) throws Exception {
        int choice;

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) addTask();
            else if (choice == 2) viewTasks();

        } while (choice != 3);
    }

    static void addTask() throws Exception {
        System.out.print("Enter task: ");
        String task = sc.nextLine();
        FileWriter fw = new FileWriter(FILE, true);
        fw.write(task + "\n");
        fw.close();
        System.out.println("Task saved");
    }

    static void viewTasks() throws Exception {
        File file = new File(FILE);
        if (!file.exists()) {
            System.out.println("No tasks found");
            return;
        }

        Scanner fileSc = new Scanner(file);
        while (fileSc.hasNextLine()) {
            System.out.println(fileSc.nextLine());
        }
        fileSc.close();
    }
}
