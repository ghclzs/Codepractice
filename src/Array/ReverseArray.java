package Array;

import java.util.Arrays;

public class ReverseArray {
    public int[] reverse(int[] array){
        int[] newarr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarr[i] = array[array.length-i-1];
        }
        return newarr;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ReverseArray reversearray = new ReverseArray();
        System.out.println(Arrays.toString(reversearray.reverse(arr)));


    }
}
