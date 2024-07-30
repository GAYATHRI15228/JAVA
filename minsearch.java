package Linear_Search;

public class minsearch {
    public static void main(String[] args) {
        int[] num ={72, 34, 54 ,28, 87, 44 ,68, 34, 22};
        System.out.println(min(num));
    }
    public static int min(int[] arr){
        int ans =arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]<ans){
                ans = arr[index];
            }
        }
        return ans;
    }
}
