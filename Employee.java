
public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    // Setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateNetSalary(double Percentage) {
        double Amount = salary + (salary * Percentage / 100);
        double netSalary = salary + Amount;
        this.setNetSalary(netSalary);
    }
}

// oldSalaryPerMonth + (oldSalaryPerMonth * hike/100)