package DSA;

import java.util.Arrays;

public class BuubleSortAlgo {
    public static void main(String[] args) {
//        int[] arr = {100,99,3,4,7,9,10,2,1};
        int[] arr = {1,2,3,4,5,6,7};
        buuble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void buuble(int[] arr){
        boolean swap;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            swap = false;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
            if (swap == false){
                System.out.println("Array already sorted");
                break;
            }
        }
    }

}

