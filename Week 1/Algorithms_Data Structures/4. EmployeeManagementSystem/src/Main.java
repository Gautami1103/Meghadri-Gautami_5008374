public class Main {
    public static void main(String[] args) {
        // Create an EmployeeManagementSystem with a capacity of 5
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Add some employees
        system.addEmployee(new Employee(1, "Alice", "Manager", 80000.0));
        system.addEmployee(new Employee(2, "Bob", "Developer", 60000.0));
        system.addEmployee(new Employee(3, "Charlie", "Tester", 50000.0));

        // Print all employees
        System.out.println("Employees:");
        system.traverseEmployees();

        // Search for an employee by ID
        int searchId = 2;
        Employee foundEmployee = system.searchEmployeeById(searchId);
        if (foundEmployee != null) {
            System.out.println("\nEmployee with ID " + searchId + " found:");
            System.out.println(foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Delete an employee by ID (assuming ID 3 exists)
        int deleteId = 3;
        if (system.deleteEmployeeById(deleteId)) {
            System.out.println("\nEmployee with ID " + deleteId + " deleted successfully.");
            System.out.println("\nRemaining employees:");
            system.traverseEmployees();
        } else {
            System.out.println("\nEmployee with ID " + deleteId + " not found.");
        }
    }
}