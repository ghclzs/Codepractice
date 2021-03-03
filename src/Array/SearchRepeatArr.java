package Array;

public class SearchRepeatArr {
    public int searchRepeatArr(int[] arr){
        int i = 0;
        while (i<arr.length){
            if(arr[i]==i){
                i++;
                continue;
            }
            if(arr[arr[i]]==arr[i]){
                return arr[i];
            }
            int tmp = arr[i];
            arr[i] = arr[tmp];
            arr[tmp] = tmp;
        }
        return -1;
    }
    public int searchRepeatArr2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[arr[i]]==arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,7,7,7,};
        SearchRepeatArr searchRepeatArr = new SearchRepeatArr();
        int result = searchRepeatArr.searchRepeatArr2(arr);
        System.out.println(result);
    }

}
