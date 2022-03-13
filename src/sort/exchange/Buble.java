package sort.exchange;

import java.util.Arrays;

public class Buble {
    public static int[] sort (int arr[]){
        int n = arr.length;
        for (int i = n-1; i > 0; i--) {
            boolean changed = false;
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] =arr[j]-arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    changed =true;
                }
            }
            if(changed = false) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
