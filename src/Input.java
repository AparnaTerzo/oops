import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product quantity : ");
        int productQuantity = sc.nextInt();

        System.out.print("Enter the product Name : ");
        String productName = sc.next();

        System.out.print("Enter the product Details : ");
        String productDetails = sc.next();

        Product prd = new Product(productName, productQuantity, productDetails);
        System.out.println(prd.getDetails());
    }
}
