package string.kmp;

import java.util.Arrays;

public class KMP {
    public  static  int[] Getnext(String t)
    {
        int next[] = new int[t.length()];
        //类似双指针 查找公共前缀
        //j为遍历指针
        // k是公共前缀指针
        int j=0,k=-1;
        //初始化next[0]=-1，便于重制k，当没有匹配到公共前缀 k回退到-1
        next[0]=-1;
        while(j<t.length()-1)
        {
            //存在相等前缀 移动j、k
            if(k == -1 || t.charAt(j) == t.charAt(k))
            {
                j++;k++;
                next[j] = k;
            }
            else k = next[k];  //k回退到-1
        }
        return next;
    }

    public static int KMP(String s1, String s2){
        char[] s11 = s1.toCharArray();
        char[] s22 = s2.toCharArray();
        int[] next = Getnext(s2);
        int i = 0,j = 0;
        while(i<s11.length&&j< s22.length){
            if(j==-1||s11[i]==s22[j]){
                i++;
                j++;
            }else{
                j = next[j];
            }
            if(j==s22.length-1) return i-j;
        }
        return -1;
    }



    public static void main(String[] args) {
//        System.out.println(Arrays.toString(Getnext("ABCDABC")));
        System.out.println(KMP("abcdede", "ed"));
    }



}
