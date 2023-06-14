import java.lang.*;
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;

    public Employee(String name,int age, String phoneNumber, String address ){
        this.name = name;
        this.age=age;
        this.phoneNumber= phoneNumber;
        this.address = address;
    }

    public void getName(String name){
        this.name= name;
    }
    public void getAge(int age){
        this.age = age;
    }
    public void getAddress(String address){
        this.address= address;
    }
    public void getPhoneNumber(String phoneNumber){
        this.phoneNumber= phoneNumber;
    }

    public String setName(){
        return name;
    }
    public int setAge(){
        return age;
    }
    public String setPhoneNumber(){
        return phoneNumber;
    }
    public String setAddress(){
        return address;
    }

}

