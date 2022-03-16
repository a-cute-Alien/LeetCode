package doublepointer;

import java.util.ArrayList;
import java.util.Comparator;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class BM89 {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        for (int i = 1; i < intervals.size(); i++) {
            Interval pre = intervals.get(i-1);
            Interval cur = intervals.get(i);
            if(cur.start<=pre.end){
                if(cur.end>pre.end) {
                    pre.end = cur.end;
                }
                intervals.remove(i);
            }
        }
        return intervals;
    }
}
