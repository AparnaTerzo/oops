class Salary extends Employee{
    int period;
    int extra;

    public Salary(String name, int age, String phoneNumber, String address,int period,int extra) {
        super(name, age, phoneNumber, address);
        this.period = period;
        this.extra = extra;


    }
    public void getPeriod(int period){
        this.period= period;
    }

    public int setSalary(){
        return period*5000;
    }
    public int setBonus(){
        return extra*500;
    }
}