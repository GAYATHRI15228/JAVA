package Linear_Search;

public class searchinrank {
    public static void main(String[] args) {
        int[] num = {55,66,3,43,27,99,97};
        int target = 3;
        System.out.println(search(num,target,2,6));
    }
    static int search(int[] arr,int target, int start,int end){
        if(arr.length == 0){
            return 0;
        }
        for(int index=start;index<=end;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
