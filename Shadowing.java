public class Shadowing {
    static int a = 10; // this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(a);// 10
        int a = 223; 
        System.out.println(a);
        fun();
    }
    static void fun() {
        System.out.println(a);
    }
}
