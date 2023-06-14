import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

class Account implements Bank{
    String name;
    long accountNo;
    double amount;
    String email;
    Scanner sc = new Scanner(System.in);
    public Account(String name, String email,long accountNo, double amount){
        this.name = name;
        this.email =email;
        this.accountNo = accountNo;
        this.amount = amount;
    }

    @Override
    public void deposit() {
        System.out.println("Enter the amount to deposit");
        int deposit = sc.nextInt();
        amount = deposit+amount;
        System.out.println("The total amount in the account is " +amount);
    }

    @Override
    public void loan() {
        if(amount > 10000){
            System.out.println("Eligible to apply for loan");
        }
        else{
            System.out.println("Not eligible to apply for any loan");
        }
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount to withdraw");
        int withdraw = sc.nextInt();
        amount = amount-withdraw;
        System.out.println("The total amount in the account is " +amount);

    }
}
