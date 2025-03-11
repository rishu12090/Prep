import java.util.*;
public class SwapBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter Value of b = ");
        int b = sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("Value of after swap A = "+a);
        System.out.println("Value of afetr swap B = "+b);
    }
}
