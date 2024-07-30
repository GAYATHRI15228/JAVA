package sorting;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={ -1 , 32 , -90 , 234 , 10 , 0 , 99 , 23 ,-88};
        selection(arr);
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){   
            int last=arr.length-i-1;         
            int maxno = max(arr,0,last);
            swap(arr,maxno,last);
        }
    }
    static int max(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<arr.length;i++){
            if(arr[max]<arr[i]);
            max=i;
        }
        return max;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
