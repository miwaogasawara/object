package basic.sample;

class StaticSample {
    /**
     * 足し算をするメソッド add
     * @param x int ひとつ目の整数
     * @param y int ふたつ目の整数
     * @return int 加算した結果
     */
    static int add(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(StaticSample.add(10,20));//30
        int ans = add(100,50);
        System.out.println(ans);
    }
}
/*
staticについて

 */




