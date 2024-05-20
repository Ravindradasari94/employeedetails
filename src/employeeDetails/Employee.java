package employeeDetails;
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;
    private int noOfProject;

    public void setEmployeeData(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.noOfProject = noOfProject;
    }

    public void calculateSalary() {
        if (noOfProject > 5 && noOfProject < 10) {
            salary += 5000;
        } else if (noOfProject >= 10 && noOfProject < 20) {
            salary += 10000;
        } else if (noOfProject >= 20) {
            salary += 15000;
        }
    }

    
    public String toString() {
        return "Employee ID: " + employeeId + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Salary: $" + salary + "\n" +
               "Number of Projects: " + noOfProject;
    }
    
    public static void main(String [] args)
    {
          Employee employee1 = new Employee();
        employee1.setEmployeeData("John", "Doe", 1001, 50000, 8);
        employee1.calculateSalary();
        System.out.println("Employee 1 Details:\n" + employee1);

        System.out.println();

        Employee employee2 = new Employee();
        employee2.setEmployeeData("Jane", "Smith", 1002, 70000, 15);
        employee2.calculateSalary();
        System.out.println("Employee 2 Details:\n" + employee2);

        System.out.println();

        Employee employee3 = new Employee();
        employee3.setEmployeeData("Alice", "Johnson", 1003, 80000, 25);
        employee3.calculateSalary();
        System.out.println("Employee 3 Details:\n" + employee3);
    }
}