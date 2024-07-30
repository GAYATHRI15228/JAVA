package Linear_Search;

import java.util.Stack;

public class search_index {
    public static void main(String[] args){
        int[] n = {12,23,11,45,63,34};
        int target = 3;
        int ans = linearsearch(n,target);
        int a= linearsearch(n,target);
        System.out.println(ans);
        System.out.println(a);
        
    }
    //search in the array : return the index if item found
    public static int linearsearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int element= arr[i];
            if(element == target){
            return i;
            }
        }
    return -1;
}
//search in the array : return the index if item found
    public static int linearsearch2(int[] arr,int target){
    if(arr.length == 0){
        return -1;
    }
    for (int element : arr) {
        if(element == target){
        return element;
        }
    }
return Integer.MAX_VALUE;
}

}
