package sort.exchange;

import java.util.Arrays;

public class Quick {
    public static int[] sort(int[] arr,int i,int j){
        if(i>j) return null;
        int l =i,r =j;
        int pos = arr[i];
        while(l<r){
            while(l<r&&arr[j]>pos) r--;
            arr[l]=arr[r];
            while(l<r&&arr[i]<pos) l++;
            arr[r]=arr[l];
        }
        arr[l] = pos;
        sort(arr,i,l-1);
        sort(arr,l+1,j);
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr,0,4)));
    }
}
