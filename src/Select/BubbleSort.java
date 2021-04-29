package Select;

import Set.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BubbleSort {
    public void bubblesort(int[] arr){
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public void Listdemo(){
        int[] arr = {2,2,2,1,1,1,1,7,7,8,2};
        List list = new ArrayList();
        list.add(arr[1]);
        list.add("haha");
        list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public void SetDemo(){
        int[] arr = {2,2,2,1,1,1,1,7,7,8,2};
        HashSet set = new HashSet();
        for(int i :arr){
            set.add(i);
        }
        Iterable it = (Iterable) set.iterator();


    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,1,1,1,1,7,7,8,2};
        BubbleSort  b = new BubbleSort();
//        b.Listdemo();
        b.bubblesort(arr);

    }
}
