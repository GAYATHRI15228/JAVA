package BinearySearch;

public class rowmatrix {
    public static void main(String[] args, Object ans){
        int[][] arr={{10 ,20 ,30,40},{12,22,33,44},{13,23,34,45},{15,25,35,50}};
        System.out.println(Array.tostring(search(arr,34)));
    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col<=0){
            if(arr[row][col] == target) return new int[]{row,col};
            if(arr[row][col]<target) row++;
            else col++;
        }
        return new int[]{-1,-1};
    }
}
