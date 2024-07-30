package Loop;
public class Reverse {
    public static void main(String[] args) {
        int n = 12675453;
        int a =0;
        while (n>0) {
            int r = n%10;
            a=a*10+r;
            n/=10;
        }
        System.out.println("Reverse"+a);
    }
}
