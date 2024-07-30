package Linear_Search;
public class maxwealth {
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int[] account2 : accounts) {
            
            for (int element : account2) {
                sum+=element;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}