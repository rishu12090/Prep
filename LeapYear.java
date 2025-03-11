import java.util.Scanner;

public class LeapYear {

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter Year You Want to check Leap Or Not = ");
      int var2 = var1.nextInt();
      if (var2 % 400 == 0) {
         System.out.println("Leap Year");
      } else if (var2 % 100 == 0) {
         System.out.println("Not A Leap Year");
      } else if (var2 % 4 == 0) {
         System.out.println("Leap Year");
      } else {
         System.out.println("Not a Leap Year");
      }

   }
}
