package company_app_design;

public interface Employee {
	
	/** INSTRUCTIONS
     *
     * Employee is an Interface which contains multiple unimplemented methods.
     *
     * Read the methods and understand what they might be used for. What could be the requirements behind creating such
     * methods? Think about it, and then implement them in a concrete class.
     *
     * You also need to add some additional methods to meet any additional business requirements of this application
     *
     * Get creative - think like a dev
	 */
    public class FullTimeEmployee implements Employee {
        private int id;
        private String name;
        private String department;
        private int salary;

        // Constructor
        public FullTimeEmployee(int id, String name) {
            this.id = id;
            this.name = name;
        }
        // Implementing the methods from the Employee interface

        @Override
        public int employeeId() {
            return id;
        }

        @Override
        public String employeeName() {
            return name;
        }

        @Override
        public void assignDepartment() {
            // Implementation to assign a department to the employee
            department = "Engineering";
        }
        @Override
        public int calculateSalary() {
            // Implementation to calculate the salary based on some criteria
            salary = 50000; // For simplicity, we set a fixed salary here
            return salary;
        }

        @Override
        public void benefits() {
            // Implementation to provide benefits information to the employee
            System.out.println("Health insurance, paid leave, and retirement plan are available.");
        }

        // Additional methods for meeting additional business requirements


        public void performWork() {
            // Implementation to perform the work assigned to the employee
            System.out.println("Work performance in progress...");
        }

        public void requestLeave(int numberOfDays) {
            // Implementation to handle employee leave request
            System.out.println("Leave request submitted for " + numberOfDays + " days.");
        }
        // Main method to demonstrate the class
        public static void main(String[] args) {
            FullTimeEmployee employee = new FullTimeEmployee(1, "John Doe");

            employee.assignDepartment();
            System.out.println("Department: " + employee.department);

            int salary = employee.calculateSalary();
            System.out.println("Salary: $" + salary);

            employee.benefits();

            employee.performWork();

            employee.requestLeave(5);
        }
    }

        int employeeId();

    String employeeName();

    void assignDepartment();

    int calculateSalary();

    void benefits();

}
