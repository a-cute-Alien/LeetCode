package dfs;

public class BM61 {

    int[][] v;
    int res = 0;
    public int solve (int[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        v = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                dfs(matrix,i,j,-1);
            }
        }
        return res;
    }
//    public void dfs(int[][] matrix,int i,int j,int len){
//        if(i<0||i>=matrix.length||j<0||j>=matrix[0].length){
//            return ;
//        }
//        res = Math.max(res,len+1);
//        if(i+1<matrix.length&&matrix[i][j]<matrix[i+1][j]) {
//            dfs(matrix,i+1,j,len+1);
//        }
//        if(i-1>=0&&matrix[i][j]<matrix[i-1][j]) {
//            dfs(matrix,i-1,j,len+1);
//        }
//        if(j+1<matrix[0].length&&matrix[i][j]<matrix[i][j+1]) {
//            dfs(matrix,i,j+1,len+1);
//        }
//        if(j-1>=0&&matrix[i][j]<matrix[i][j-1]) {
//            dfs(matrix,i,j-1,len+1);
//        }
//    }

    public int dfs(int[][] matrix,int i,int j,int pre){

        if(i<0||i>=matrix.length||j<0||j>=matrix[0].length||matrix[i][j]<=pre){
            return 0;
        }
        if(v[i][j]>0) {
            return v[i][j];
        }
        int x1 = dfs(matrix,i+1,j,matrix[i][j]);
        int x2 = dfs(matrix,i-1,j,matrix[i][j]);
        int y1 = dfs(matrix,i,j+1,matrix[i][j]);
        int y2 = dfs(matrix,i,j-1,matrix[i][j]);

        v[i][j] = Math.max(x1,Math.max(x2,Math.max(y1,y2)))+1;
        res = Math.max(res,v[i][j]);
        return v[i][j];
    }

    public static void main(String[] args) {
        BM61 bm61 = new BM61();
        int[][] m = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        bm61.solve(m);
    }

}
