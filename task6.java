/**
 * task4
 */

class Main
{
   static double PI = 3.142f;
   public static double sphereVolume(double r){
       double sphereVolume = (4/3)*PI*(r*r*r);
       return sphereVolume;
   }
   public static double sphereSurface(double r){
       double sphereSurface = 4*PI*(r*r);
       return sphereSurface;
   }
   public static double cylinderVolume(double r, double h){
       double cylinderVolume = PI*(r*r)*h;
       return cylinderVolume;
   }
   public static double cylinderSurface(double r, double h){
       double cylinderSurface = (2*PI*r*h)+(2*PI*r*r);
       return cylinderSurface;
   }
   public static double coneVolume(double r, double h){
       double coneVolume = PI*r*r*h/3;
       return coneVolume;
   }
   public static double coneSurface(double r, double h){
       double l = Math.sqrt(r * r + h * h);
       double coneSurface = PI*r*r*(r+l);
       return coneSurface;
   }


}
public class task6 {
   public static void main(String[] args) {
       Main obj = new Main();

       double r =54;
       double h =70;

       System.out.println(obj.sphereVolume(r));
       System.out.println(obj.sphereSurface(r));
       System.out.println(obj.cylinderVolume(r,h));
       System.out.println(obj.cylinderSurface(r, h));
       System.out.println(obj.coneVolume(r, h));
       System.out.println(obj.coneSurface(r, h));
   }
}