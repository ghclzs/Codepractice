package StringDemo;

public class fibonacci {
    //大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
    //n≤39
    public int Fibonacci(int n) {
        if(n==0){

            return 0;
        }
        if(n==1){
            return 1;
        }

        int num = Fibonacci(n-1)+Fibonacci(n-2);
        return num;

    }

    public int Fibonacci2(int n){
        int[] res = {0,1};
        if(n<2){
            return res[n];
        }
        int first = 0;
        int second = 2;
        int fibn = 0;
        for(int i = 0;i<=n;i++){
            fibn = first+second;
            first = second;
            second = fibn;
        }
        return fibn;
    }

    public static void main(String[] args) {
        fibonacci a = new fibonacci();
        int result = a.Fibonacci(10);
        System.out.println(result);
    }
}
