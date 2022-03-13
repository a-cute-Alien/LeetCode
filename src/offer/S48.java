package offer;

public class S48 {
    int[] c = new int[128];
    int res = 1;
    public int lengthOfLongestSubstring (String s) {
        // write code here
        //双指针 滑动窗口
        char[]ss = s.toCharArray();
        int n =s.length();
        int l = -1;
        for(int r = 0;r<n;r++){
            c[ss[r]]++;
            if(c[ss[r]]==1){
                res = Math.max(res,r-l);
            }else{
                while(c[ss[r]]!=1){
                    l++;
                    c[ss[l]]--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        S48 s = new S48();
        System.out.println(s.lengthOfLongestSubstring("dvdf"));
    }
}
