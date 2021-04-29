package Array;

import java.util.Arrays;

public class MergeNums {
    //输入:
    //　　　　nums1 = [1,8,9,15], m = 4
    //　　　　nums2 = [2,5,6,12,18], n = 5
    //　　输出:
    //　　　　[1,2,5,6,8,9,12,15,18]
    public int[] merge(int[] num1,int m,int[] num2,int n){
        int[] newarr = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<m&&j<n){
            if(num1[i]<=num2[j]){
                newarr[k++] = num1[i++];
            }else{
                newarr[k++] = num2[j++];
            }
        }
        System.out.println(Arrays.toString(newarr));
        System.out.println(i+"==="+j);
        while (i<m){
            newarr[k++] = num1[i++];
        }
        while (j<n){
            newarr[k++] = num2[j++];
        }

//        for(int s = 0;s<newarr.length-1;s++){
//            num1[s] = newarr[s];
//        }
        System.out.println(Arrays.toString(newarr));
        return newarr;
    }
    public int[] merge2(int[] num1,int m,int[] num2,int n){
        int[] newarr = new int[m+n];
        int len1 = m-1;
        int len2 = n-1;
        int len = m+n-1;
        while (len1>=0&&len2>=0){
            num1[len--] = num1[len1]>num2[len2] ? num1[len1--]:num2[len2--];
            System.arraycopy(num2,0,num1,0,len2+1);
        }
        return newarr;
    }
    public static void main(String[] args) {
        MergeNums mergenums = new MergeNums();
        int[] num1 = {1,8,9,15};
        int[] num2 = {2,5,6,12,18};
        int m = 4;
        int n = 5;
        mergenums.merge(num1,m,num2,n);
    }
}
