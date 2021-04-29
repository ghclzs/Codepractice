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
    //这种方法没用
    public int searchRepeatArr2(int[] arr){
        for (int i = 0; i <= arr.length; i++) {
            if(arr[arr[i]]==arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5,3};
        SearchRepeatArr searchRepeatArr = new SearchRepeatArr();
        int result = searchRepeatArr.searchRepeatArr2(arr);
        System.out.println(result);
    }

}
