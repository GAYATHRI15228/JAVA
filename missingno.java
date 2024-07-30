package sorting.CYCLICSORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingno {
    public static void main(String[] args) {
        int[] arr={7,3,2,4,8,2,3,1,0};
        System.out.println(cyclicsort(arr));

      //  System.out.println(Arrays.toString(arr));
    }
   static List<Integer> cyclicsort(int[] arr){
    //static int cyclicsort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int current=arr[i];
            if (arr[i]<arr.length&& arr[i]!=arr[current]) {
                swap(arr,i,current);
            }
            else i++;
        }
       List<Integer> ans = new ArrayList<>();
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
               ans.add(index);
              //  return index;
            }
        }
        return ans;
       // return arr.length;
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
