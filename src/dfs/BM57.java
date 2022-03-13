package dfs;

public class BM57 {
    int res = 0;
    boolean[][] v;
    public int solve (char[][] grid) {
        // write code here
        int m = grid.length;
        int n = grid[0].length;
        v = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(v[i][j] == false && grid[i][j]== '1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int i,int j){
        if(i<0||i>=v.length||j<0||j>=v[0].length||grid[i][j]!='1'||v[i][j]==true) {
            return;
        }
        grid[i][j]='0';
        v[i][j]=true;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }

    public static void main(String[] args) {
        BM57 bm57= new BM57();
        char[][] grid = new char[][]{{'1','1','0','0','0'},{'0','1','0','1','1'},{'0','0','0','1','1'},{'0','0','0','0','0'},{'0','0','1','1','1'}};
        bm57.solve(grid);
    }
}
