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

        System.out.print("Enter the account number : ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter the amount in the account :");
        double amount = sc.nextDouble();

        Account acc = new Account(name,email,accountNumber,amount);

        System.out.println("Enter the choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                acc.deposit();
                break;
            case 2:
                acc.withdraw();
                break;
            case 3:
                acc.loan();
                break;
            default:
                break;
        }








    }
}