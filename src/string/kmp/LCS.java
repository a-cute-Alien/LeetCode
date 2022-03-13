package string.kmp;

public class LCS {
    public static String LCS (String str1, String str2) {
        // write code here
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        int m = s1.length;
        int n = s2.length;
        int[][] dp = new int[m+1][n+1];
        int len = 0,end = 0;
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s1[i-1]==s2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]>len){
                        len = dp[i][j];
                        end = i;
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return str1.substring(end-len,end);

    }

    public static void main(String[] args) {
        System.out.println(LCS("abcdefg", "ab1cdefgabc1defg"));

    }
}
