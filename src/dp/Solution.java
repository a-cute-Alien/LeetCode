package dp;

import java.util.Arrays;
import java.util.Scanner;


//题目：有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
//
//        输入：每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。输出一行表示最大的乘积。
//
//        输入：
//        3
//        7 4 7
//        2 50
//        输出：
//        49
public class Solution {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        long[][] dpm = new long[k+1][n+1];
        long[][] dpn = new long[k+1][n+1];
        //起始
        //只选1人，以第j人结尾
        for (int i = 1; i <= n; i++) {
            dpm[1][i] = a[i];
            dpn[1][i] = a[i];
        }
        //只选k人，以第1人结尾
        for (int i = 1; i <= k; i++) {
            dpm[i][1] = a[1];
            dpn[i][1] = a[1];
        }
        for (int i = 2; i <= k ; i++) {
            for (int j = 2; j <= n ; j++) {
                for (int l = Math.max(1,j-d); l < j; l++) {
                    dpm[i][j] = Math.max(dpm[i][j],Math.max(dpm[i-1][l]*a[j],dpn[i-1][l]*a[j]));
                    dpn[i][j] = Math.min(dpm[i][j],Math.min(dpm[i-1][l]*a[j],dpn[i-1][l]*a[j]));
                }
            }

        }
        long res = Math.max(dpm[k][1],dpn[k][1]);
        for(int j=2;j<=n;j++){
            res = Math.max(dpm[k][j],res);
        }
        System.out.println(res);
    }
}
