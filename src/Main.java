import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account holder Name : ");
        String customerName = sc.next();
        System.out.print("Enter the account number : ");
        long customerAccountNo = sc.nextLong();
        System.out.print("Enter the Account pin : ");
        int customerPin = sc.nextInt();
        System.out.print("Enter the Amount in account : ");
        double amount = sc.nextDouble();
        System.out.print("Enter the Account type : ");
        String accountType = sc.next();


        Customer customer = new Customer(customerName, customerAccountNo, customerPin, accountType,amount);

        if (accountType.equals("savings") || accountType.equals("Savings"))
        {
            Account savings = new Savings();
            System.out.println("Savings Account");
            System.out.println("Enter your choice:\n1. View account details\n2. Deposit\n3. Withdraw");
            int choose = sc.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.println("Enter the account number");
                    long accountNo = sc.nextLong();
                    System.out.println("Enter the account pin : ");
                    int accountPin = sc.nextInt();
                    if(accountPin == customerPin)
                    {
                        System.out.println(customer.toString());
                    }
                    else
                    {
                        System.out.println("Account and pin does not match");
                    }
                   break;

                case 2:
                    savings.deposit();
                    double deposit = sc.nextDouble();
                    System.out.println("The total amount deposited in the account : " + (amount+deposit));
                    break;

                case 3:
                    savings.withDraw();
                    double withdraw = sc.nextDouble();
                    System.out.println("The total amount in the account : " +(amount-withdraw));
                    break;
            }

        }
        else
        {
            Current current = new Current();
            System.out.println("Current Account");
            System.out.println("Enter your choice:\n1. View account details\n2. Deposit\n3. Withdraw");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the account number");
                    long accountNo = sc.nextLong();
                    System.out.println("Enter the account pin : ");
                    int accountPin = sc.nextInt();
                    if(accountPin == customerPin)
                    {
                        System.out.println(customer.toString());
                    }
                    else
                    {
                        System.out.println("Account and pin does not match");
                    }
                    break;


                case 2:
                    current.withDraw();
                    double deposit = sc.nextDouble();
                    System.out.println("The total amount deposited in the account : " +(amount+deposit));
                    break;

                case 3:
                    current.deposit();
                    double withdraw = sc.nextDouble();
                    System.out.println("The total amount in the account : " + (amount-withdraw));
                    break;
            }

        }
    }


}
