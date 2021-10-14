package basic.sample;
//配列のサイズ変更のサンプル

import java.util.Arrays;

public class ArraysSample {
    static  int sum(int...array){//可変長引数の構文　int...arrayでいくつになるかわからないけどって感じ
        int sum = 0;
        for (int value:array) sum += value;
        return sum;
    }
    public static void main(String[] args) {
        //配列のコピー　Arrays.copyOfでoldに加えて3個配列を追加
        int[]oldArray = {10,20,30};
        int[]newArray = Arrays.copyOf(oldArray, oldArray.length+3);

        //配列の文字列表現
        System.out.println((Arrays.toString(oldArray)));
        System.out.println((Arrays.toString(newArray)));

        //配列の並び変え
        int[]array = {100,20,0,50,70};
        System.out.println(Arrays.toString(array));//[100, 20, 0, 50, 70]
        Arrays.sort(array);//並び変えメソッド
        System.out.println(Arrays.toString(array));//[0, 20, 50, 70, 100]昇順に並び変えられました

        //配列の検索
        int[] array1 ={1,2,4,7,8};//ソート済み（並ぶ替え済み）
        //検索　binarySearch
        System.out.println(Arrays.binarySearch(array1,2));// 検索は探したい数値を入力、結果：1(要素1ということです）
        System.out.println(Arrays.binarySearch(array1,3));//結果： -3（該当がない場合は、マイナス符号で返ります）

        //可変長引数
        System.out.println(sum(1,2,3,4,5));//15
        System.out.println(sum(10,20));//30
        /**
         * 可変長引数はこの部分を受けてます　実務ではよく使用します
         * クラス設定直下に記載されてます
         *  static  int sum(int...array){//可変長引数の構文　int...arrayでいくつになるかわからないけどって感じ
         *         int sum = 0;
         *         for (int value:array) sum += value;
         *         return sum;
         */


    }
}
/*
    結果1
元の配列を利用し、配列数を+3追加された、数値は初期化”0”に設定されます
[10, 20, 30]
[10, 20, 30, 0, 0, 0]
結果2
元の配列を利用し、配列数を－２で配列を減らした。
[10, 20, 30]
[10]
 */