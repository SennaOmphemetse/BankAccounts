import java.util.Scanner;

public class TestClass {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        OtherAccounts [] arrAccount = new OtherAccounts[20];
        arrAccount = fillArray(arrAccount);
        char chara, chara2;
        int i,k;

        while(true)
        {
            System.out.printf("\nDo you want to do transection? (y or n): ");
            chara = input.next().charAt(0);
            if(chara == 'y' || chara == 'Y')
            {
                displayArray(arrAccount);
                System.out.printf("\nEnter number to proceed: ");
                k = input.nextInt();
                k = k - 1;
                System.out.printf("Do you want to Withdraw(w) or Deposit(d): ");
                chara2 = input.next().charAt(0);
                if(chara2 == 'w' || chara2 == 'W')
                {
                    System.out.printf("\nEnter amount to withdraw: ");
                    double amount = input.nextDouble();
                    if(arrAccount[k].withdrawAmount(amount)== false)
                    {
                        System.out.printf("You have insufficient funds");
                    }
                    else
                    {
                        System.out.printf("\nYour balance is: R" + arrAccount[k].getBalance());
                        System.out.printf("\n\nTransection Done.");
                    }
                }
                else
                {
                    System.out.printf("Enter amount to Deposit: ");
                    double amount = input.nextDouble();
                    arrAccount[k].makeDeposit(amount);
                    System.out.printf("\nYour new balance is: R" + arrAccount[k].getBalance());
                    System.out.printf("\n\nTransection Done.");
                }
            }
            else
            {break;}
        }
    }
    public static OtherAccounts[] fillArray(OtherAccounts[] arrAccount)
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("\f");
        int counter = 0;
        String Fname, Lname;
        char y, n, chara;
        char accType;
        double balance;

        while(true)
        {
            System.out.printf("\nEnter the Firstname of account holder: ");
            Fname = input.next();

            System.out.printf("Enter the Lastname of account holder: ");
            Lname = input.next();

            System.out.printf("Enter account type (m or v): ");
            accType = input.next().charAt(0);

            System.out.printf("Enter the amount: ");
            balance = input.nextDouble();
            System.out.printf("\n");

            arrAccount[counter] = new OtherAccounts(Fname,Lname,balance,accType);
            counter++;
            System.out.printf("Do you want to enter another Account? (Yes-y or No-n)): ");
            chara = input.next().charAt(0);
            if(chara != 'y' && chara  != 'Y')
                break;
        }
        return arrAccount;
    }
    public static void displayArray(OtherAccounts [] arrAccount)
    {
        for(int i =0; i < VisaAccount.getNumObject();i++)
        {

            System.out.printf((i + 1) + ". " + arrAccount[i].toString());
            System.out.println();
        }
    }
}
