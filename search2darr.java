package Linear_Search;

import java.util.Arrays;

public class search2darr {
    public static void main(String[] args) {
        int[][] num={
            {23,45,63},
            {38,56,43,22},
            {45,26},
            {98,90}
        };
        int target = 26;
        int[] ans=search(num,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(num));
    }
    public static int[] search(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col< arr[row].length;col++){
                if(arr[row][col]==target){
                return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    //searching maximum number
    public static int max(int[][] arr){
        int maxim = arr[0][0];
        int row,col;
        for(row=0;row< arr.length;row++){
            for(col=0;col< arr[row].length;col++){
                if (maxim<arr[row][col]) {
                    maxim=arr[row][col];
                    
                }
            }
        }
        return maxim;
    }
}
