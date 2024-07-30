package BinearySearch;
// LC 1095
public class mountainarry {
    public static void main(String[] args) {
        int[] arr={1,12,23,34,45,32,16,11};
        int target=34;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
    int peek=peekmountain(arr);
        int first=search(arr,target,0,peek);
        if(first!=-1) return first;
        return search(arr,target,peek+1,arr.length-1);
    }
    static int peekmountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]) start=mid+1;
            else end=mid;
        }
        return end;
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]) end=mid-1;
            else if(target>arr[mid]) start=mid+1;
            else return mid;
        }
        return -1;
    }
}
