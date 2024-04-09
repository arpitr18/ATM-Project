package ATMproject;

import java.util.*;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------Welcome to ATM-----------------------------");

        int balance = 3000;
        System.out.println("Please Insert your Debit Card ");
        Thread.sleep(5000);
        int chances = 3;
        while (chances != 0) {

            System.out.print("PLease Enter your PIN: ");
            int pin = sc.nextInt();
            System.out.println("Please wait, we are verifying you PIN......");
            Thread.sleep(1000);
            if (pin == 1234) {
                System.out.println("---------------------------LOGIN SUCCESSFUL--------------------------");

                Thread.sleep(1000);
                System.out.println("------------------------Welcome of SBI ACCOUNT-----------------------");
                System.out.println("Press 1 to View Your Balance");
                System.out.println("Press 2 to Make a Withdrawal");
                System.out.println("Press 3 to Deposit Money");
                System.out.println("Press 4 to Exit");
                System.out.print("What would you like to choose: ");
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.println("Your Balance is " + balance);
                    System.out.print("Would you like to continue?(y/n)");
                    char loop = sc.next().charAt(0);
                    if (loop == 'n') {
                        System.out.println("-----------Please wait while your card is returned----------");
                        Thread.sleep(3000);
                        System.out.println("---------------Thank you for visiting us--------------------");
                        break;
                    }
                } else if (option == 2) {
                    System.out.print("Enter the money to be withdrawn");
                    int withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Your transaction is successful.");
                        System.out.println("Your current balance is " + balance);
                        System.out.println("Please collect your Cash.");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.print("Would you like to continue?(y/n)");
                    char loop = sc.next().charAt(0);
                    //
                    if (loop == 'n') {
                        System.out.println("-----------Please wait while your card is returned----------");
                        Thread.sleep(3000);
                        System.out.println("---------------Thank you for visiting us--------------------");
                        break;
                    }

                } else if (option == 3) {
                    System.out.println("Enter the amount you would like to Deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your transaction is successful.");
                    System.out.println("Your current balance is " + balance);

                    System.out.print("Would you like to continue?(y/n)");
                    char loop = sc.next().charAt(0);

                    if (loop == 'n') {
                        System.out.println("-----------Please wait while your card is returned----------");
                        Thread.sleep(3000);
                        System.out.println("---------------Thank you for visiting us--------------------");
                        break;
                    }

                } else if (option == 4) {
                    System.out.println("-----------Please wait while your card is returned----------");
                    Thread.sleep(3000);
                    System.out.println("---------------Thank you for visiting us--------------------");
                    break;
                } else {
                    System.out.println("You select a valid option");
                }
            } else {
                System.out.println("---------------------------LOGIN FAILED------------------------------");
                System.out.println("Incorrect pin.");
                chances = chances - 1;
                System.out.println("Please try again. You have " + chances + " chances left.");

            }

        }
    }
}
