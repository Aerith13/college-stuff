import java.util.Scanner;

public class Employee {

    int id;
    String name;
    String surname;
    float salary;
}

class Main {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many employees? ");
            int n = sc.nextInt();
            Employee emp[] = new Employee[n];
            for (int i = 0; i < n; i++) {
                emp[i] = new Employee();
                System.out.println("Employee " + (i + 1) + " data ");
                System.out.print("Enter employee id :");
                emp[i].id = sc.nextInt();
                System.out.print("Enter employee first name :");
                emp[i].name = sc.next();
                System.out.print("Enter employee surname :");
                emp[i].surname = sc.next();
                System.out.print("Enter employee salary :");
                emp[i].salary = sc.nextFloat();
            }
            System.out.println("\n\n********* All Employee Details are :*********\n");
            for (int i = 0; i < n; i++) {
                System.out.println("Employee id, Name, Surname and Salary :" + emp[0].id + " " + emp[i].name + " "
                        + emp[i].surname + " " + emp[i].salary);
            }
        }
    }
}
