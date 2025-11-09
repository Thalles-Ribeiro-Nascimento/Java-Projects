package exercises.application;

import exercises.model.entities.Account;
import exercises.model.exceptions.WithDrawException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double initialBalance, withDrawLimit, withDraw;

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Inicial Balance: ");
            initialBalance = sc.nextDouble();

            System.out.print("Withdraw Limit: ");
            withDrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withDrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            withDraw = sc.nextDouble();

            account.withDraw(withDraw);

        }
        catch (WithDrawException wde){
            System.out.println(wde.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
        finally{
            sc.close();
        }

    }
}
