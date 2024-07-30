package sorting.CYCLICSORT;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        //for(int i=0;i<arr.length;i++) => [1, 4, 3, 2, 5] it willnot sort
            int i=0;
        while(i<arr.length){
            int current=arr[i]-1;
            if(arr[i]!=arr[current]) 
            swap(arr,i,current);
            else i++;
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
