ackage test.training;
import java.util.Scanner;

public class BankAccTest {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many account you want to create : ");
        int n = sc.nextInt();
        BankAccount AC[] = new BankAccount[n];
        for (int i = 0; i < AC.length; i++) {
            AC[i] = new BankAccount();
            AC[i].openAccount();
        }

        //run loop until menu 4 is not pressed
        int ch;
        do {
            System.out.println("1. Display\n 2. Deposit\n 3. Withdrawal\n 4.Quit ");
            System.out.println("Enter Choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < AC.length; i++) {
                        AC[i].showAccount();
                    }
                    break;

                 case 2:
                    System.out.print("Enter Account No : ");
                    String acn = sc.next();
                    boolean found = false;
                    for (int i = 0; i < AC.length; i++) {
                        found = AC[i].search(acn);
                        if (found) {
                            AC[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No Record");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No : ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i < AC.length; i++) {
                        found = AC[i].search(acn);
                        if (found) {
                            AC[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No Record");
                    }
                    break;

                case 4:
                    break;
            }
        }
        while (ch != 4);
    }
}
