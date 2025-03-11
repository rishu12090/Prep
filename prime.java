import java.util.*;
class prime{
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {  // Checking up to 'n' instead of 'sqrt(n)'
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start = ");
        int x = sc.nextInt();
        System.out.println("Enter End = ");
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}