package BinearySearch;

public class returnno {
    public static void main(String[] args){
        int arr[]={ 1 , 2 , 3 , 4 , 5 , 6 , 12 , 23 , 34 , 45 , 56 };
        int target =2;
        System.out.println(binarysearch(arr,target));
    }
    
    public static int binarysearch(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid =start+(end-start)/2;
        if(target<arr[mid])  end =mid-1;

        else if(target>arr[mid]) start =mid+1;

        else return mid;
        }
        return -1;
        // return start;  // ceiling of a number =smallest element in array greater or=target
        //return end; // greater number smaller or=target;
    }
}
