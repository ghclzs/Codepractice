public class Drink {
    //贪心算法
    //输入：M = 9, N = 3
    //
    //　　输出：13
    //
    //　　解释：你可以用 3 个空酒瓶兑换 1 瓶酒。所以最多能喝到 9 + 3 + 1 = 13 瓶酒。
    public int drink(int m,int n){
        int drinked = m;
        int empty = m;
        while ((empty/n)!=0){
            int changed = empty/n;
            drinked += changed;
            empty = changed+empty%n;
        }
        return drinked;

    }
}
