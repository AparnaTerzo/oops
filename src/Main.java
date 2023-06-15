
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String[] opr = expression.split("[+-/*]");
        String[] num= expression.split("[0-9]");

        int a=0;
        int i=0;
        for(String str:num) {
            int b = Integer.parseInt(opr[i]);
            if (str.equals("+")) {
                a += b;
            } else if (str.equals("-")) {
                a -= b;
            } else if (str.equals("/") && b != 0) {
                if(i==0){
                    a=1;
                }
                a /= b;
            } else {
                if(i==0){
                    a=1;
                }
                a *= b;
            }
            i++;

        }
        if(num.length==0){
            a+=Integer.parseInt(opr[0]);
        }
        System.out.println(a);

    }

}