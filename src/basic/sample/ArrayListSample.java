package basic.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        //宣言と初期化①
        List<Integer> list = new ArrayList<>();//LIST<整数intという意味＞
        //List<Integer> list = new ArrayList<>(Arrays.asList(20,10,40,30,50));//①+②

        //初期化②
        list.addAll(Arrays.asList(20,10,40,30,50));//Array(1000)と多めに設定もできる

        //表示
        System.out.println(list);//[20, 10, 40, 30, 50]

        //要素の追加
        list.add(60);//末尾に表示される
        System.out.println(list);//[20, 10, 40, 30, 50, 60]
        list.add(2,70);//要素の途中に追加する,要素2として70を追加
        System.out.println(list);//[20, 10, 70, 40, 30, 50, 60]

        //要素の上書き
        list.set(0,80);//0要素を80に変更する
        System.out.println(list);//[80, 10, 70, 40, 30, 50, 60]

        //要素の削除
        list.remove(2);//要素の削除
        System.out.println(list);//[80, 10, 40, 30, 50, 60]

        list.removeAll(Arrays.asList(30,60));//30，60の要素があれば削除
        System.out.println(list);//[80, 10, 40, 50]



        //インデックスを指定して要素を取得
        System.out.println(list.get(3));//[50]

        //サイズ
        System.out.println(list.size());//4

        //一部の要素の取得
        System.out.println(list.subList(1,3));//[10,40]

        //要素の消去
        list.clear();
        System.out.println(list);//[]
        //空（要素がない）ことの判定
        System.out.println(list.isEmpty());//true

        //初期化
        list.addAll(Arrays.asList(2,6,1,4,5,0,4));
        System.out.println(list);

        //値の検索
        System.out.println(list.contains(6));//true
        System.out.println(list.contains(10));//false1,2,4
        System.out.println(list.containsAll(Arrays.asList(1, 2, 3)));//false

        int num = 4;
        if (list.contains(num)){
            System.out.println(list.indexOf(num));//最初にみつけたインデックス　3
            System.out.println(list.lastIndexOf(num));//最後に見つけたインデックス　6
        }
        //ソート（並び変え）
        list.sort(Comparator.naturalOrder());
        System.out.println(list);//[0, 1, 2, 4, 4, 5, 6]　昇順
        list.sort(Comparator.reverseOrder());
        System.out.println(list);//[6, 5, 4, 4, 2, 1, 0]　降順

    }
}
/*
追記　要素の削除　サンプル
list.retainAll(Arrays.asList(80,10,40、50));//一致しなければ削除
        System.out.println(list);//[80,10,40]

   結果
   [20, 10, 40, 30, 50]
    [20, 10, 40, 30, 50, 60]
    [20, 10, 70, 40, 30, 50, 60]
    [80, 10, 70, 40, 30, 50, 60]
    [80, 10, 40, 30, 50, 60]
    [80, 10, 40, 50]
    50
    4
    [10, 40]
    []
    true

 /*

 その他のメソッドはリファレンスを参照してください。
https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/ArrayList.html
 */

