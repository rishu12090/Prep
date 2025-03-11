import java.util.*;
public class Swap3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter Value of b = ");
        int b = sc.nextInt();
       a *= b;
       b = a/b;
       a = a/b;
        System.out.println("Value of after swap A = "+a);
        System.out.println("Value of afetr swap B = "+b);
    }
}
