package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int WithdrawAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        // We need to get input from user
        System.out.println("Enter your pin number");

        int password = scanner.nextInt();

        if (password == pin) {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome Dear: " + name);

            while (true) {
                System.out.println("Press 1 to View your Balance");
                System.out.println("Press 2 to add money");
                System.out.println("Press 3 for Withdrawl");
                System.out.println("Press 4 to Generate Receipt");
                System.out.println("Press 5 to Exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is" + balance);
                        break;

                    case 2:
                        System.out.println("Enter the amount you want to add");
                        AddAmount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("Enter the amount you want to withdraw");
                        WithdrawAmount = scanner.nextInt();
                        if (WithdrawAmount > balance) {
                            System.out.println("Insufficient funds"
                                    + "Amount should be greater than or equal to your available balance");
                        } else {
                            System.out.println("Withdrawl successfull");
                            balance = balance - WithdrawAmount;
                            // balance = 500 - 10000 = 9500
                            // shift+alt+F (Allign properly)
                        }
                        break;
                    case 4:
                        System.out.println("Welcome " + name);
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount Deposited" + AddAmount);
                        System.out.println("Amount Withdrawn" + WithdrawAmount);
                        System.out.println("Thank You");

                        break;
                    default:
                        System.out.println("Press 5 to Exit");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thank You");
                    break;
                }
            }

        } else {
            System.out.println("Enter the correct Pin");
        }
    }

}
