package BasicJavaPrograms;

import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        int balance = 10000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM");
            System.out.println("Choose 1 to withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 to check balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform");

            //get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdrawn");
                    //get withdrawl money from user
                    withdraw = sc.nextInt();

                    //check whether the balance is greater than or
                    // equal to the withdrawal amount

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Enter money to be deposited");
                  deposit=sc.nextInt();

                //add deposit to the total balance
                balance=balance+deposit;
                    System.out.println("Your money is successfully deposited");
                    System.out.println(" ");
                    break;
                case 3:
                    //display total balance
                    System.out.println("Balance:" + balance);
                    System.out.println(" ");
                    break;

                case 4:
                    //exit from main menu
                    System.exit(0);
            }
        }
    }
}
