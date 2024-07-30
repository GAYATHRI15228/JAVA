import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println("sum2 : "+sum2());
    }
    static int sum2() {
        int d = 23;
        int f= 34;
        int sum = d+f;
        return sum;
    }

   static void sum() {
    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a+b;
        System.out.println("sum :"+ c);
    
    }
}