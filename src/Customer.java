import java.util.Scanner;

public class Customer {
    String customerName;
    long customerAccountNo;
    int customerPin;
    String accountType;
    double amount;

    public Customer(String customerName,long customerAccountNo,int customerPin,String accountType,double amount) {
        this.customerName = customerName;
        this.customerAccountNo = customerAccountNo;
        this.customerPin = customerPin;
        this.accountType = accountType;
        this.amount = amount;
    }



    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerAccountNo(long customerAccountNo){
        this.customerAccountNo = customerAccountNo;
    }
    public void setCustomerPin(int customerPin){
        this.customerPin = customerPin;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getCustomerName(){
        return customerName;
    }
    public long getCustomerAccountNo(){
        return customerAccountNo;
    }
    public int getCustomerPin(){
        return customerPin;
    }
    public String getAccountType(){
        return accountType;
    }
    public double getAmount(){
        return amount;
    }
    public String toString(){
        return "Customer Name : "+getCustomerName()+ "\nCustomer Account Number : "+getCustomerAccountNo()+ "\nCustomer Account pin : "+getCustomerPin()+"\nAccount Type : "+getAccountType()+ "\nAmount in the account : "+getAmount();
    }
}
