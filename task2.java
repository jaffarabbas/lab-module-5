/**
 * task2
 */

class SavingAccount
 {
      static double annualInterestRate;
      static double savingBalance;
      static double balance;

      SavingAccount(double balance)
      {
            this.balance = balance;
      }

      static void modifyInterestRate()
      {
          annualInterestRate=10;
      }

      static void calculateMonthlyInterest()
      {
          modifyInterestRate();
          savingBalance = balance+ (balance*annualInterestRate)/12; 
          System.out.println(savingBalance);
      }

      static void printBalance()
      {
          calculateMonthlyInterest();
      }

      static void monthlyInt()
      {
        annualInterestRate=10;
      }
 }
public class task2 {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount(100);
        SavingAccount.printBalance();
    }
}