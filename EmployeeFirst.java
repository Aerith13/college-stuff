import java.util.Scanner;

public class EmployeeFirst {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee newEmployee = getEmployeeDetails();
        double Percentage = getPercentage();

        System.out.println();
        System.out.println("Confirm employee details: ");
        System.out.println("Id : " + newEmployee.getEmployeeId());
        System.out.println("Name : " + newEmployee.getEmployeeName());
        System.out.println("Salary : " + newEmployee.getSalary());

        newEmployee.calculateNetSalary(Percentage);
        System.out.println("Net Salary : " + newEmployee.getNetSalary());
    }

    public static Employee getEmployeeDetails() {
        Employee employee = new Employee();
        System.out.println("Enter Id: ");
        employee.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Name: ");
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter salary: ");
        employee.setSalary(scanner.nextDouble());
        return employee;
    }

    public static double getPercentage() {
        System.out.println("Enter percentage:");
        double Percentage = scanner.nextDouble();
        return Percentage;
    }

}