public class Account {
    private Money balance;

    public Account(Money balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return "You have " + this.balance.getUnit() + "," + this.balance.getFractions() + "$ on your account";
    }

    public void deposit(Money amount) {
        this.balance = this.balance.add(amount);
        System.out.println("Deposit transaction succeeded");
    }

    public void withdraw(Money amount) {
        Money result = this.balance.subtract(amount);
        if (result.getUnit() < 0) {
            System.out.println("You don't have that much money");
            return;
        }
        this.balance = result;
        System.out.println("Withdraw transaction succeeded");
    }
}
