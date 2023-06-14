public class Arith extends Calc {
    public  Arith(int num1, int num2) {
        super(num1,num2);
    }
    void add(){
        int add = num1+num2;
        System.out.println(add);
    }
    void sub(){
        int sub = num1-num2;
        System.out.println(sub);
    }
    void mul(){
        int mul = num1*num2;
        System.out.println(mul);
    }
    void div(){
        int div = num1/num2;
        System.out.println(div);
    }
}
