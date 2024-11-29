package work_6_23_3;

class Account
{
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int id, double balance, double annuallnterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnuallnterestRate()
    {
        return annuallnterestRate;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate)
    {
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getMonthlyInterest()
    {
        return (annuallnterestRate / 12);
    }

    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("余额不足，无法提款！");
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}

public class TestAccount
{
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000, 4.5);
        a1.withdraw(30000);
        System.out.println(a1.getBalance());
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("余额：" + a1.getBalance() + " 月利率：" + a1.getMonthlyInterest() + "%");
    }
}
