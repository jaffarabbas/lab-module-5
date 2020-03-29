
import java.util.Scanner;

class Account
{ 
    static Scanner obj = new Scanner(System.in);
    static String accountTitle;
    static Long AccountNumber;
    static Long LastNumber=0L;

    static void ac()
    {
        long Accountseries=500000000000000L + obj.nextLong();
        AccountNumber = Accountseries;
        LastNumber=AccountNumber;
    }
    static void show()
    {
        ac();
        System.out.println("Previous Account: "+LastNumber);
        System.out.println("Name : ");
        accountTitle=obj.next();
        System.out.println("Name : "+accountTitle);
        System.out.println("Account No: "+AccountNumber+1);
    }
}




 class task5 {

    public static void main(String[] args) throws Exception{
            Account.show();
    }
 }