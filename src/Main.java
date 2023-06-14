import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color of the shape : ");
        String color = sc.next();

        System.out.print("Enter the side  : ");
        int side = sc.nextInt();

        System.out.print("Enter the length : ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth : ");
        int breadth = sc.nextInt();

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:

                Shape square = new Square(color,side);
                square.area();
                square.perimeter();
                break;
            case 2:
                Shape rectangle = new Rectangle(color,length, breadth);
                rectangle.area();
                rectangle.perimeter();
                break;
            default:
                break;
        }

    }
}