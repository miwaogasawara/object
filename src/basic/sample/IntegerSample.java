package basic.sample;
//ラッパークラスの利用
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/Integer.html
public class IntegerSample {
    public static void main(String[] args) {
        //クラスに設定された値(クラスフィールドと呼び,static修飾子が付く)
        System.out.println("Integerの最大値:" + Integer.MAX_VALUE);//Integerの最大値:2147483647
        System.out.println("Integerの最小値:" + Integer.MIN_VALUE);//Integerの最小値:-2147483648

        //オートボクシング（プリミティブ→ラッパークラス）
        int i1 = 10;
        Integer integer1 = i1;
        System.out.println("基本型:" + i1);//基本型:10
        System.out.println("ラッパークラス:" + integer1);//ラッパークラス:10

        //アンボクシング
        Integer integer2 = 20;
        int i2 = integer2;
        System.out.println("基本型:" + i2);//基本型:20
        System.out.println("ラッパークラス:" + integer2);//ラッパークラス:20

        //基本型への変換メソッド
        byte b = integer1.byteValue();
        short s = integer2.shortValue();
        long l = integer1.longValue();
        float f = integer1.floatValue();
        double d = integer1.doubleValue();

        //文字列への変換メソッド、
        String str = integer1.toString();//10

        //println()メソッドの引数に書くと自動的にtoString()が呼び出される
        System.out.println(integer1);

        //値の比較
        System.out.println(integer1.equals(10));//true
        System.out.println(integer1 == 10);//true
        System.out.println(integer1.equals(10.0));//false

    }
}
/*
ラッパークラス
Integer.MAX_VALUE
すべて大文字で記載します
基本が使用できないときにINTEGERを使用する

結果
Integerの最大値:2147483647
Integerの最小値:-2147483648
基本型:10
ラッパークラス:10
基本型:20
ラッパークラス:20
10
true
true
false

MAX_VALUE
@Native
public static final int MAX_VALUE
intに設定可能な最大値2の7乗-1を保持する定数

MIN_VALUE
public static final byte MIN_VALUE
byteに設定可能な最小値 -2の7乗を保持する定数。




 */