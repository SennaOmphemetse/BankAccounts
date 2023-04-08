import java.util.Random;

public abstract class Account implements Accountable{

    private String Fname;
    private String Lname;
    private double balance;
    private char accType;
    private static int numObject;

    public Account()
    {
        numObject++;
    }

    public Account( String Fname, String Lname, double balance, char accType)
    {
        this.Fname = Fname;
        this.Lname = Lname;
        setBalance(balance);
        this.accType = accType;
        numObject++;
    }

    public String getFname()
    {
        return Fname;
    }
    public String getLname()
    {
        return Lname;
    }
    public double getBalance()
    {
        return balance;
    }
    public char getAccType()
    {
        return accType;
    }

    public static int getNumObject()
    {
        return numObject;
    }

    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }

    private String setAccNumber()
    {
        Random value = new Random();
        String accNumber = "";
        return accNumber = Fname.substring(0,3).toUpperCase() + Lname.substring(0,3).toUpperCase() + getAccType() + "#" +(value.nextInt(100) + 100);
    }

    public String setAccType()
    {
        if(getAccType() == 'm')
        {
            return "MasterCard";
        }
        else if(getAccType() == 'v')
        {
            return "Visa";
        }
        else
        {
            return "Other";
        }
    }

    public abstract boolean withdrawAmount(double amount);
    public abstract void makeDeposit(double amount);
    @Override
    public String toString()
    {
        String str;
        str = setAccNumber() + " " + getFname() + " " + getLname() + " " + setAccType();
        return str;
    }

}
