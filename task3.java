/**
 * task3
 */

class Main{
            
         static double basicRate=0.04f;
         static double luxuryRate=0.1f;
         static double price_Main;

         private static double roundToNearestvalue(double price)
         {
            double check  = Math.round(price * 100.0) / 100.0;
            price_Main = check;
            return price_Main;
         }

         static double computeCostBasic(double price)
         {
             price = price_Main;
             return price + basicRate;
         }

         static double computeCostLuxury(double price)
         {
             price = price_Main;
             return price + luxuryRate;
         }

         static double changeBasicRateTo(double newRate)
         {      
               return basicRate+newRate;
         }

         static double changeLuxuryRateTo(double newRate)
         {      
               return luxuryRate+newRate;
         }

 
             public static double check(){
                return roundToNearestvalue(100.4567);  
             }

}
public class task3 {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.check();
        System.out.println("Rate  : "+Main.changeBasicRateTo(Main.price_Main));
        System.out.println("Tax : "+Main.changeBasicRateTo(10));
        System.out.println("Rate + Tax : "+Main.computeCostBasic(Main.price_Main));

        System.out.println("Tax (L): "+Main.changeLuxuryRateTo(200));
        System.out.println("Rate + Tax (L): "+Main.computeCostLuxury(Main.price_Main));
    }
}