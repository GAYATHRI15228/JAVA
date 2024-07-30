package Loop;
import java.util.Scanner;

public class maximum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

      /*  int max = a;
        if(b>max)
        max = b;
        if(c>max)
        max = c;
        System.out.println("max no:"+max);
        */

        int max=a ;
        if(a<b){
        max=b;
    }
        else if(max<c)
        {
            max= c;
        }
        System.out.println("max no : "+max);
    }
}