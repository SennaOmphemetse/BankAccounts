public class MastaAccount extends Account{

    private int bankCharges;

    public MastaAccount()
    {

    }

    public MastaAccount(String Fname, String Lname, double balance, char accType)
    {
        super(Fname,Lname,balance,accType);
        this.bankCharges = bankCharges;

    }

    public int getBankCharges()
    {
        return bankCharges;
    }

    public double setCharges()
    {
        double amount = 3.00;

        return amount;
    }

    public void makeDeposit(double amount)
    {
        double balance = 0;
        if(amount > 0)
        {
            balance = super.getBalance() + amount;
            super.setBalance(balance);
        }
    }
    public boolean withdrawAmount(double amount)
    {

        if (amount < super.getBalance())
            super.setBalance(super.getBalance() - amount - setCharges());
        else
            return false;
        return true;
    }

    public String toString()
    {
        String str;
        str = super.toString() + " " + super.getBalance();
        return str;
    }
}
