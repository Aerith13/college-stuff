package chtype;

import java.util.Scanner;

class BankDetails {
    private String accno;
    private String name;
    private String surname;
    private static double balance;
    Scanner sc = new Scanner(System.in);

    // inputs
    public void openAccount() {
        System.out.print("Enter Phone No: ");
        accno = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Surname: ");
        surname = sc.next();
        System.out.println(" ");
        System.out.print("Your Balance is 100000");

        // idk i put it der omg lol
        balance = 100000;

    }

    // method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name + surname);
        System.out.println("Account no.: " + accno);
        System.out.println("Balance: " + balance);
    }

    // method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
        System.out.println("Your deposit has been added. Check your balance.");
    }

    // method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    // method to search an acc number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

    public static double getBalance() {
        return balance;
    }
}
