package offer;

public class S46 {
    public static int translateNum(int num) {
        char[] s = String.valueOf(num).toCharArray();
        int n = s.length;
        int[] dp = new int[n+1];
        dp[0] = 1;dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int c = (s[i-2]-'0')*10+(s[i-1]-'0');
            if(c>=10&&c<=25)
                dp[i] =dp[i-1]+dp[i-2];
            else
                dp[i]=dp[i-1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        translateNum(26);
    }
}
