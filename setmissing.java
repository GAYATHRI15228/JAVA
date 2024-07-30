package sorting.CYCLICSORT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class setmissing {
    public static void main(String[] args){
        int[] arr={2,1,4,2,6,5};
       System.out.println(Arrays.toString(missing(arr)));
     // System.out.println(missing(arr));
    }
    static int[] missing(int[]arr){
        int i=0;
        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current])
                swap(arr,i,current);
            else i++;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1)
                return new int[]{arr[index],index+1};  
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
