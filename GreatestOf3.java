public class GreatestOf3 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=9;
        if(a>b&&a>c){
            System.out.println("A is Largest");
        }
        else if(b>a&&b>c){
            System.out.println("B is Largest");
        }
        else{
            System.out.print("C is largest");
        }
    }
}
