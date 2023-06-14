public class Account {
    private String name;
    private String email;
    private long acc_no;
    private float amount;

    public Account(String name, String email, long acc_no,float amount){
        this.name= name;
        this.email=email;
        this.acc_no = acc_no;
        this.amount=amount;
    }
    public void getName(String name){
        this.name = name;
    }
    public void getEmail(String email){
        this.email = email;
    }
    public void getAccount(long acc_no){
        this.acc_no = acc_no;
    }
    public void getAmount(float amount){
        this.amount =amount;
    }

    public String setName(){
        return name;
    }
    public String setEmail(){
        return email;
    }
    public long setAccount(){
        return acc_no;
    }
    public float setAmount(){
        return amount;
    }
    public String eligible(){
        if(amount >100000 ){
            System.out.println("Eligible for applying loan");
            float loan = amount *7;
            System.out.println("The loan amount for the account holder is "+loan);

        }
        else {
            System.out.println("Not Eligible for Applying Loan");
        }
        return "The amount in the account is "+amount;
    }

}
