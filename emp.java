package Switch;

import java.util.Scanner;

public class emp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int epmid = in.nextInt();
        String dep = in.next();
        switch (epmid) {
            case 1:
                System.out.println("Gayathri");
                break;
                case 2:
                switch (dep) {
                    case "AIDS":
                        System.out.println("AIDS DEPARTMENT");
                        break;
                
                    case "IT":
                    System.out.println("IT dep");
                }
        
            default:
            System.out.println("Enter correct empid");
                break;
        }
    }
}
