import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee name : ");
        String name = sc.next();

        System.out.print("Enter the employee Age : ");
        int age = sc.nextInt();

        System.out.print("Enter the employee address: ");
        String address = sc.next();

        System.out.print("Enter the employee phone Number : ");
        String phoneNumber = sc.next();

        System.out.print("Enter the Number of days worked : ");
        int period = sc.nextInt();

        System.out.print("Enter the Extra Hours worked : ");
        int extra = sc.nextInt();


        Salary sal = new Salary(name, age, phoneNumber, address,period,extra);
        System.out.println("Employee Salary : "+sal.setSalary());
        System.out.println("Employee Bonus : "+sal.setBonus());
    }
}