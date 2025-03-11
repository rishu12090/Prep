import java.util.Scanner;

public class Palindrome {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = 121;
        int m = n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n = n/10;
        }
        if(m==rev){
            System.out.println("Palindrome");
        }
        else System.out.println("Not an palindrome");
    }
}
