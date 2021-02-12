package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner bank =new Scanner(System.in);

        int user1, pass1, user, pass, login, balance,transaction, withdraw, deposit;
        user1= 0;
        pass1=0;
        balance=0;

        String transactions = "1 for: check balance\n"
                + "2 for: withdraw money \n"
                + "3 for: deposit money\n"
                + "4 for: quit \n"
                +"********************";



        System.out.println("Wellcome to our bank!");

        while (true)
        {
            System.out.println("********************");
            System.out.println("1- login \n2- Register");
            login = bank.nextInt();

            if (login == 2)
        {
            System.out.println("Thank you for choosing us. Your nu and pass must be integer!");
            System.out.println("********************");
            System.out.println("Your id?");
            user = bank.nextInt();
            user1=user;
            System.out.println(user);
            System.out.println("Your password?");
            pass =bank.nextInt();
            pass1=pass;

        }
           else if (login == 1)
            {
                System.out.println("User id");
                user =bank.nextInt();
                System.out.println("Password");
                pass = bank.nextInt();

                if(user1!=user || pass!=pass1 )
                {
                    System.out.println("Wrong id or pass please try again");
                    continue;
                }
                else
                {
                    System.out.println("Wellcome!");
                }
            }



           else
            {
                System.out.println("Wrong chose again");
                System.out.println("********************");
            }
        while(true)
        {
            System.out.println("Please chose your transactions\n" +transactions);

            transaction = bank.nextInt();

           if(transaction==1)
           {
               System.out.println("Your balance is:" + balance);
               System.out.println("********************");
           }
            if(transaction==2)
            {
                System.out.println("How many money you want to withdraw?");
                withdraw = bank.nextInt();
                balance = balance + withdraw;
                System.out.println("new balance:"+ balance);
                System.out.println("********************");

            }
            if(transaction==3)
            {
                System.out.println("How many money you want to deposit?");
                deposit = bank.nextInt();
                if (balance-deposit<0)
                {
                    System.out.println("insufficient balance");
                }
                else {
                    balance = balance - deposit;
                    System.out.println("new balance:"+ balance);
                }
                System.out.println("********************");
            }
        if(transaction==4)
        {
            System.out.println("quiting...");
            System.out.println("********************");
            break;
        }


        }


        }

    }
}
