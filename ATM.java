package ATMproject;

import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------Welcome to ATM-----------------------------");
        int balance = 10000;
        System.out.println("Please Insert your Debit Card ");
        System.out.print("PLease Enter your PIN: ");
        int pin = sc.nextInt();
          while(true){
               if (pin==1234) {
                   System.out.println("------------------------Welcome of SBI ACCOUNT-----------------------");
                   System.out.println("Press 1 to View Your Balance");
                   System.out.println("Press 2 to Make a Withdrawal");
                   System.out.println("Press 3 to Deposit Money");
                   System.out.println("Press 4 to Exit");
                   System.out.print("What would you like to choose: ");
                   int option = sc.nextInt();
                   if(option == 1){
                       System.out.println("Your Balance is " + balance);
                       System.out.print("Would you like to continue?(y/n)");
                       char loop = sc.next().charAt(0);
                       if (loop == 'n'){
                           System.out.println("-----------Please wait while your card is returned----------");
                           System.out.println("---------------Thank you for visiting us--------------------");
                           break;}
                   } else if (option == 2) {
                       System.out.print("Enter the money to be withdrawn");
                       int withdraw = sc.nextInt();
                       if (balance >= withdraw) {
                           balance -= withdraw;
                           System.out.println("Your transaction is successful.");
                           System.out.println("Your current balance is " + balance);
                           System.out.println("Please collect your Cash.");
                       }else {
                           System.out.println("Insufficient balance");
                       }
                       System.out.print("Would you like to continue?(y/n)");
                       char loop = sc.next().charAt(0);
//
                       if(loop == 'n') {
                           System.out.println("-----------Please wait while your card is returned----------");
                           System.out.println("---------------Thank you for visiting us--------------------");
                           break;}


                   } else if (option == 3) {
                       System.out.println("Enter the amount you would like to Deposit: ");
                       int deposit = sc.nextInt();
                       balance += deposit;
                       System.out.println("Your transaction is successful.");
                       System.out.println("Your current balance is " + balance);

                       System.out.print("Would you like to continue?(y/n)");
                       char loop = sc.next().charAt(0);

                       if(loop == 'n') {
                           System.out.println("-----------Please wait while your card is returned----------");
                           System.out.println("---------------Thank you for visiting us--------------------");
                           break;}

                   } else if (option == 4) {
                       System.out.println("-----------Please wait while your card is returned----------");
                       System.out.println("---------------Thank you for visiting us--------------------");
                       break;
                   }
                   else{
                       System.out.println("You select a valid option");
                   }
               } else{
                   System.out.println("Incorrect Password.");
                   System.out.println("Please try again.");
                   break;



               }

          }
    }}















