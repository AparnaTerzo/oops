public class Calc {
    int num1;
    int num2;

    public Calc(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void getNum1(int num1){
        this.num1 = num1;
    }
    public void getNum2(int num2){
        this.num2 = num2;
    }
    public int setNum1(){
        return num1;
    }
    public int setNum2(){
        return num2;
    }

}
