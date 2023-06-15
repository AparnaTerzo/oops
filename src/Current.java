public class Current extends Account{
    @Override
    void deposit() {
        System.out.println("Enter the amount to be deposited in the account: ");
    }

    @Override
    void withDraw() {
        System.out.println("Enter the amount to withdraw in the account");

    }
}
