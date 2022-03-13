package traceback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BM55 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    boolean[] visited;
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        visited = new boolean[num.length];
        Arrays.sort(num);
        trackBack(num,0);
        return res;
    }
    public void trackBack(int[] num,int index){
        if(path.size()== num.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if(visited[i]==false){
                trackBack(num,i);
                path.add(num[index]);
                visited[index] = true;
                trackBack(num,i);
                path.remove(path.size()-1);
                visited[index] = false;
            }
        }
    }


//    public void trackBack(int[] num,int index){
//        if(index == num.length-1){
//            res.add(new ArrayList<>(Arrays.stream(num).boxed().collect(Collectors.toList())));
//            return;
//        }
//        for (int i = index; i < num.length; i++) {
//                swap(num,index,i);
//                trackBack(num,index+1);
//                swap(num,index,i);
//        }
//    }
//    public void swap(int[]num,int i,int j){
//        if(i==j) {
//            return;
//        }
//        num[i]+=num[j];
//        num[j]=num[i]-num[j];
//        num[i]=num[i]-num[j];
//    }
}
