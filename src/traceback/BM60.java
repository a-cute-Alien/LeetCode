package traceback;

import java.util.ArrayList;

public class BM60 {
    ArrayList<String> res = new ArrayList<>();
    StringBuilder builder = new StringBuilder();
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        traceback(0,0,n);
        return res;
    }
    public void traceback(int l,int r,int n){
        if(l<r||l>n||r>n) {
            return;
        }
        if(l==n&&r==n){
            res.add(builder.toString());
            return ;
        }
        builder.append("(");
        traceback(l+1,r,n);
        builder.deleteCharAt(builder.length()-1);
        builder.append(")");
        traceback(l,r+1,n);
        builder.deleteCharAt(builder.length()-1);
    }
}
