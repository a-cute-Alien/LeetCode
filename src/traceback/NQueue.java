package traceback;

import java.util.HashSet;
import java.util.Set;

public class NQueue {
    
    int res = 0;
    //列
    Set<Integer> c = new HashSet<>();
    //y=x
    Set<Integer> x = new HashSet<>();
    //y=-x
    Set<Integer> y = new HashSet<>();
    
    public int Nqueen (int n) {
        // write code here
        traceback(0,n);
        return res;
    }

    public void traceback(int row,int n){
        if(row == n){
            res++;
            return;
        }
        for (int column = 0; column < n; column++) {
            if(c.contains(column)) {
                continue;
            }
            if(y.contains(row-column)) {
                continue;
            }
            if(x.contains(row+column)) {
                continue;
            }
            c.add(column);
            y.add(row-column);
            x.add(row+column);
            traceback(row+1,n);
            c.remove(column);
            y.remove(row-column);
            x.remove(row+column);
        }
    }
}
