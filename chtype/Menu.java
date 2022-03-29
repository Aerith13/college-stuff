package chtype;

import java.util.Scanner;

public class Menu {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // create initial accounts
            System.out.print("How many number of customers do you want to input? ");
            int n = sc.nextInt();
            BankDetails C[] = new BankDetails[n];
            for (int i = 0; i < C.length; i++) {
                C[i] = new BankDetails();
                C[i].openAccount();
            }
            // loop runs until number 6 is not pressed to exit
            int ch;
            do {
                System.out.println("\n What do you want to do? ");
                System.out.println(
                        "1. Display all account details\n 2. Display Balance\n 3. Search by Phone No.\n 4. Deposit\n 5. Withdraw\n 6.Exit ");
                System.out.println(" ");
                System.out.println("Enter your choice: ");

                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showAccount();
                        }
                        break;

                    case 2: {
                        System.out.println("Your Account Balance is "  + BankDetails.getBalance() + "PHP");
                        
                        System.out.println(" ");
                    }
                        break;

                    case 3:
                        String ac_no = sc.next();
                        boolean found = false;
                        for (BankDetails element : C) {
                            found = element.search(ac_no);
                            if (found) {
                                break;
                            }
                            if (!found) {
                                System.out.println("Search failed. Account doesn't exist.");
                            }
                            break;
                        }
                    case 4:
                        System.out.print("Enter Account no. : ");
                        ac_no = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(ac_no);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed. Account doesn't exist.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter Account No : ");
                        ac_no = sc.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(ac_no);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search failed. Account doesn't exist. ");
                        }
                        break;
                    case 6:
                        System.out.println("GoodBye 🤟🏽.");
                        break;
                }
            } while (ch != 6);
        }
    }
}