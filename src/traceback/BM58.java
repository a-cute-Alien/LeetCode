package traceback;

import java.util.ArrayList;
import java.util.Arrays;

public class BM58 {
    ArrayList<String> res = new ArrayList<>();
    StringBuilder builder = new StringBuilder();
    boolean[] visited;
    public ArrayList<String> permuteUnique(String str) {
        visited = new boolean[ str.length()];
        char[] c = str.toCharArray();
        Arrays.sort(c);
        trackBack(c);
        return res;
    }
    public void trackBack(char[] c){
        if(builder.length()== c.length) {
            res.add(builder.toString());
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if(visited[i]==true || i>0 && c[i] == c[i-1]&& visited[i-1] == false) {
                continue;
            }
            builder.append(c[i]);
            visited[i] = true;
            trackBack(c);
            builder.deleteCharAt(builder.length()-1);
            visited[i] = false;
        }
    }
}
