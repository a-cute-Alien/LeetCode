package sort.exchange;

import java.util.Arrays;

public class Quick {
//    public static int[] sort(int[] arr,int i,int j){
//        if(i>j) return null;
//        int l =i,r =j;
//        int pos = arr[i];
//        while(l<r){
//            while(l<r&&arr[j]>pos) r--;
//            arr[l]=arr[r];
//            while(l<r&&arr[i]<pos) l++;
//            arr[r]=arr[l];
//        }
//        arr[l] = pos;
//        sort(arr,i,l-1);
//        sort(arr,l+1,j);
//        return arr;
//    }

    public static void main(String[] args) {
        int [] arr = new int[]{5,4,3,2,1};
        sort(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }



















    public  static void sort(int[]a ,int m,int n ){
        if(m>n) {
            return;
        }
        int l = m, r = n;
        int p = a[m];
        while (l<r){
            while(l<r&&a[r]>p) {
                r--;
            }
            a[l] = a[r];
            while(l<r&&a[l]<p) {
                l++;
            }
            a[r] = a[l];
        }
        a[l] = p;
        sort(a,m,l-1);
        sort(a,l+1,n);

    }
}
