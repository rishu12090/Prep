import java.util.Scanner;

public class Armstrong {
     public static void main(String[] var0) {
      new Scanner(System.in);
      int var2 = 153;
      int var3 = var2;

      int var4;
      for(var4 = 0; var2 > 0; var2 /= 10) {
         int var5 = var2 % 10;
         var4 += var5 * var5 * var5;
      }

      if (var4 == var3) {
         System.out.println("" + var4 + " is an armstrong Number");
      } else {
         System.out.println("" + var4 + " Not an Armstrong Number");
      }

   }
}
