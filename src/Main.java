import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account holder name : ");
        String name = sc.next();

        System.out.print("Enter the account holder email : ");
        String email = sc.next();

        System.out.print("Enter the Account number : ");
        long acc_no = sc.nextLong();

        System.out.println("Enter the Amount in the account : ");
        float amount = sc.nextFloat();




//        Account acc = new Account(name, email,acc_no,amount);
//        System.out.println(acc.eligible());
        Loan loa = new Loan(name, email,acc_no,amount);
        System.out.println(loa.eligible());

    }
}