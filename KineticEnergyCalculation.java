import java.util.Scanner;

public class KineticEnergyCalculation {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a mass in kilograms: ");
      double mass = input.nextDouble();
      
      System.out.print("Enter a velocity in meter per seconds: ");
      double velocity = input.nextDouble();
      
      double x = Math.pow(velocity, 2);
      double y = mass * x;
      double z = 0.5;
      
      double KE;
      KE = ANSWER(z, y);
      System.out.printf("The object's Kinetic energy is:  %.2f j", KE);
       
    }
    
    public static double ANSWER(double a, double b){
   
        double product;
        product = a * b;
        return product;
        
    }
}