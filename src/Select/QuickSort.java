package Select;

import java.util.Arrays;

public class QuickSort {
    //6,2,23,1,4,5,78,90,3
    public void quickSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        sort(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr,int left,int right){
        int base = arr[left];
        int i = left;
        int j = right;
        while (i<j){
            while (arr[j]>=base&&i<j){
                j--;
            }
            while (arr[i]<=base&&i<j){
                i++;
            }
            while (i!=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;

        sort(arr,left,i-1);
        sort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int[] arr = {6,2,23,1,4,5,78,90,3};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
    }
}
