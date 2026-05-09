package basicbankingsystem;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choices;
        double balance = 10.99;
        boolean isActive = true;



        while(isActive){
            System.out.println("#######################");
            System.out.println("Welcome to the Basic Bank:");
            System.out.println("1.Check Your Balance");
            System.out.println("2.Request a withdraw");
            System.out.println("3.Request a Deposit");
            System.out.println("4.Exit from the bank");
            System.out.print("Enter Your Choices(1-4):");
            char choice = input.next().charAt(0);

            switch (choice){
                case '1' -> checkBalance(balance);
                case '2' -> balance -= doWithdraw();
                case '3' -> balance = balance + doDeposit();
                case '4' -> {
                        isActive=false;
                        System.out.println("Exiting from the bank");
                }
                default ->{
                    isActive=false;
                    System.out.println("You have input something invalid please check again...");
                }
            }
        }






    }

    static void checkBalance(double balance){
        System.out.printf("Your current Balance is: %.3f৳\n",balance);
    }

    static double doDeposit(){

        double depositAmount;
        System.out.print("Enter your deposit amount:");
        depositAmount = input.nextDouble();

        if(depositAmount<0){
            System.out.println("Deposit amount can't be negative:\n");
            return 0;
        }
        else{
            return depositAmount;
        }


    }
    static double doWithdraw(){
        double withdrawAmount;
        System.out.print("Please enter the amount you want to withdraw:");
        withdrawAmount = input.nextDouble();

        if (withdrawAmount<0){
            System.out.println("You can't do this:");
            return 0;
        }
        else{
            return withdrawAmount;
        }
    }
}
