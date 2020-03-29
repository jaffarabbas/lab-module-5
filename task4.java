
import java.util.Scanner;

class Account
{ 
    static Scanner obj = new Scanner(System.in);
    static String accountTitle;
    static Long AccountNumber;
    static Long LastNumber;

    static void ac()
    {
        long Accountseries=100000000000000L + obj.nextLong();
        AccountNumber = Accountseries;
        System.out.println(AccountNumber);
        LastNumber=AccountNumber;
    }
}




 class task4 {

    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     char a = obj.next().charAt(0);
     if(a =='a'){
        Account.show();
     }else if(a == 'b'){
        System.out.println(Account.LastNumber);
     }
    }
}