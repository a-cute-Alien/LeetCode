package dp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BM71 {
    public static int LIS (int[] arr) {
        // write code here
        int m = arr.length;
        if(m<=1) {
            return m;
        }
        int[] dp = new int [m+1];
        dp[1] = 1;
        int res = 1;
        for(int i =2 ;i<=m;i++){
            dp[i] = 1;
            for(int j =1 ;j<i;j++){
                if(arr[j-1]<arr[i-1]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(dp[i],res);
        }
        return dp[m];

    }

    public static void main(String[] args) {
        LIS(new int[]{6,3,1,5,2,3,7});
    }
}
