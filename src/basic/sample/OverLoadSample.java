package basic.sample;
//これから学習予定
public class OverLoadSample {
    static int sum(int num1,int num2) {
        return num1 + num2;
    }

    static int sum(int num1,int num2,int num3) {
        return num1 + num2 +num3;
    }

    static  int sum(int... array) {
        int sum = 0;
        for (int value:array) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));//30
        System.out.println(sum(10,20,30));//60
        System.out.println(sum(1,2,3,4,5));//15
    }
}
/*
結果
30
60
15

 */
