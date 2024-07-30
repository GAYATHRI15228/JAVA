package BinearySearch;

public class infinitearray {
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 ,4 ,5 ,12 ,34 ,35 ,56 ,78 ,123 ,134,145,156,200,234,245,267,278,289};
        int target=34;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target){
        //find the range of the array
        //first start with the box of size 2
        int start =0;
        int end=1;
        while(target>arr[end]){
            int newstart = end+1;
            end=end+(end-start+1)*2;//doubling the size to find the target element
            start=newstart;
        }
        return binarysearch(arr,target,start,end);
    }
    public static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]) end=mid-1;
            else if(target>arr[mid]) start=mid+1;
            else return mid;
        }
        return -1;
    }
}
