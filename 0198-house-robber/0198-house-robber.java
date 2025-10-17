class Solution {
    public int rob(int[] arr) {
      int dp[]=new int[arr.length];
      int n=arr.length;
      if(n==0) return 0;
      if(n==1) return arr[0];
      dp[0]=arr[0];
      dp[1]=Math.max(arr[0],arr[1]);
      for(int i=2;i<arr.length;i++){
        dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        
      }
      return dp[(arr.length)-1];
    }
}