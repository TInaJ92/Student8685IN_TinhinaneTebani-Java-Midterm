package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */

    public class EmployeeInfo {
        private String name;
        private int age;
        private double salary;

        // Constructor
        public EmployeeInfo(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        // Method to calculate the annual salary
        public double calculateAnnualSalary() {
            return salary * 12;
        }
        // Method to check if the employee is eligible for a promotion
        public boolean isEligibleForPromotion() {
            return age >= 25;
        }

        // Method to display employee information
        public void displayEmployeeInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Annual Salary: " + calculateAnnualSalary());
            System.out.println("Eligible for Promotion: " + isEligibleForPromotion());
        }
    }
    public static void main(String[] args) {
       // EmployeeInfo employee = new EmployeeInfo(Tina  ,30, 5000.00);

        // Use getters and setters
      //  System.out.println("Employee Name: " + employee.getName());
      //  employee.setAge(35);
        //System.out.println("Employee Age: " + employee.getAge());

        // Calculate and display the annual salary
       // double annualSalary = employee.calculateAnnualSalary();
      //  System.out.println("Annual Salary: " + annualSalary);

        // Check if the employee is eligible for promotion
       // boolean eligibleForPromotion = employee.isEligibleForPromotion();
       // System.out.println("Eligible for Promotion: " + eligibleForPromotion);

        // Display the complete employee information
       // employee.displayEmployeeInfo();
    }
}
