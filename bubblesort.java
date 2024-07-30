package sorting;

import java.util.Arrays;

import BinearySearch.Array;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={ -1 , 32 , -90 , 234 , 10 , 0 , 99 , 23 ,-88};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
           // boolean swaping=false;
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                   // swaping =true;
                }
            }
          //  if(!swaping) break;//if the array is already sorted then there is no swaping done
        }
    }
}
