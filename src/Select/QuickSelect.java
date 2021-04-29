package Select;

import java.util.Arrays;

public class QuickSelect {
    public void quickSort(int[] arr){
        Qsort(arr,1,arr.length-1);
    }
    private void Qsort(int[] arr,int low,int high){
        int pivot;
        if(low<high){
            pivot=partition0(arr,low,high);
            Qsort(arr,low,pivot-1);
            Qsort(arr,pivot+1,high);
        }
    }
    private int partition0(int[] arr,int low,int high){
        int pivotkey;
        pivotkey = arr[low];
        while (low<high){
            while ((low<high)&&arr[high]>=pivotkey){
                high--;
            }
            swap(arr,low,high);
            while (low<high&&arr[low]<=pivotkey){
                low++;
            }
            swap(arr,low,high);
        }

        return low;
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSelect quickSelect = new QuickSelect();
        int[] arr = new int[]{1,11,2,4,6,3};
        System.out.println(Arrays.toString(arr));
        quickSelect.quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
