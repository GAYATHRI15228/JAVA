
package BinearySearch;
public class orderagnostic {
    public static void main(String[] args){
        int[] arr={90 , 87 , 76 , 65 , 43 , 23 , 21 , 12 , 11 , 8 , 6 , 4};
        int target = 11;
        int ans=order(arr,target);
        System.out.println(ans);
    }
    public static int order(int[] arr,int target){
        int start=0;
        int end =arr.length-1;// if arr.length then index out of bound error.
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]) return mid;
            if(arr[start]<arr[end]){
                if(target<arr[mid] ) end =mid-1;
                else start=mid+1;
            }
            else{
                if(target>arr[mid]) end=mid-1;
                else start =mid+1;
            }
        }
        return -1;
    }
    
}
