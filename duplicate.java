package sorting.CYCLICSORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface duplicate {
    public static void main(String[] args){
        int[] arr={7,5,5,3,2,1,1};
        cyclicsort(arr);
        System.out.println(  cyclicsort(arr));
        
    }
    static List cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
                int current=arr[i]-1;
                if(arr[i]!=arr[current])
                swap(arr,i,current);
            else i++;
        }
        List ans=new ArrayList<>();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
