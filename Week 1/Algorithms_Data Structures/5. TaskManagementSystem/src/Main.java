
public class Main
{
    class Node {
        Task task;
        Node next;
        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
    private Node head=null;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public Task searchTaskById(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
    public boolean deleteTaskById(int taskId) {
        Node current = head;
        Node previous = null;
        while (current != null && current.task.getTaskId() != taskId) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return false; // Task not found
        }
        if (previous == null) {
            head = current.next; // Removing the head node
        } else {
            previous.next = current.next; // Removing a non-head node
        }
        return true; // Task deleted successfully
    }
    public static void main(String[] args)
    {
        // Create a TaskManager object (using the nested Node class within Main)
        Main manager = new Main();

        // Add some tasks
        Task task1 = new Task(1, "Finish report", "Pending");
        Task task2 = new Task(2, "Grocery shopping", "Completed");
        Task task3 = new Task(3, "Call plumber", "To Do");
        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        // Print all tasks
        System.out.println("Tasks:");
        manager.traverseTasks();

        // Search for a task by ID
        int searchId = 2;
        Task foundTask = manager.searchTaskById(searchId);
        if (foundTask != null) {
            System.out.println("\nTask with ID " + searchId + " found:");
            System.out.println(foundTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Delete a task by ID
        int deleteId = 1;
        if (manager.deleteTaskById(deleteId)) {
            System.out.println("\nTask with ID " + deleteId + " deleted successfully.");
            System.out.println("\nRemaining tasks:");
            manager.traverseTasks();
        } else {
            System.out.println("\nTask with ID " + deleteId + " not found.");
        }
    }
}
