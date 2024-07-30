package Loop;
import java.util.Scanner;

public class Alphabetcasecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.next().trim().charAt(0);
        if(a >='a' && a>='z'){
            System.out.println("Lower case");

        }
        else{
            System.out.println("Upper case");
        }
    }
}
