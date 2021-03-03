public class BinarySearch {
    //被查找的序列arr中有重复的元素，在此序列中查找目标数target。
    //
    //　　被查找的序列示例：int[] arr1 = { 1, 2, 5, 5, 5, 13, 19, 33, 33, 38, 40, 48, 48 }。
    public int binarysearch1(int[] arr,int target){
        if(arr==null||arr.length==0){
            return -1;
        }
        int left =0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                right = mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else if(arr[mid]>mid){
                right = mid;
            }
        }
        if (left==arr.length){
            return -1;
        }
        return arr[left]==target?left:-1;

    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr1 = { 1, 2, 5, 5, 5, 13, 19, 33, 33, 38, 40, 48, 48 };
        int result = binarySearch.binarysearch1(arr1,48);
        System.out.println(result);
    }
}
