package test.training;
import java.util.Scanner;

public class BankAccount {

     private String accno;
     private String name;
     private long balance;

     Scanner sc = new Scanner(System.in);

     //method to open an account
    void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    //method to display account details
    void showAccount() {

        System.out.println(accno + "," + name + "," + balance);
                            }

    public synchronized void deposit(){
        Long amount;
        System.out.println("Enter the amount to be deposited: ");
        amount = sc.nextLong();
        try {
            System.out.println("Depositing...");
            Thread.sleep(2000);
            balance = balance + amount;
        }
        catch (InterruptedException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Amount Deposited Succesfully");
        System.out.println("Account Balance:"+balance);
        notify();
    }
    //method to deposit money
   /* void deposit() {
        long amount;
        System.out.println("Enter Amount U Want to Deposit : ");
        amount = sc.nextLong();
        balance = balance + amount;
    }
 */
    //method to withdraw money


    void withdrawal () {
        long amount;
        System.out.println("Enter Amount U Want to withdraw : ");
        amount = sc.nextLong();
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    boolean search(String acno) {
        if (accno.equals(acno)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
