import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number2 : ");
        int num2 = sc.nextInt();

        System.out.println("Case 1 : Addition ");
        System.out.println("Case 2 : Subtraction ");
        System.out.println("Case 3 : Multiplication ");
        System.out.println("Case 4 : Division ");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();


        Arith calc = new Arith(num1,num2);

        switch (choice){
            case 1:
                calc.add();
                break;
            case 2:
                calc.sub();
                break;
            case 3:
                calc.mul();
                break;
            case 4:
                calc.div();
        }
    }
}