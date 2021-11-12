package basic.sample;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//オブジェクトをStreamに変換する
//参照先　Stream APIの基本：https://java-code.jp/1501

public class StreamBasic {
    public static void main(String[] args) {
        //事例1：ArrayList
        List<String>data = new ArrayList<>(
                Arrays.asList("あいう","かきくけこ","さしすせそ"));
        data
                // ①Streamを生成
                .stream()
                // ②中間処理（加工）
                .filter(s -> s.length() >= 5)//文字数が5以上あるもの
                .map(s -> s.substring(0))// フィルターでピックアップ後頭文字だけ取り出します
                // ③終端処理
                .forEach(System.out::println);
        //事例2：Mapタイプ
        //参照先：Streamの生成　https://java-code.jp/1506
        Map<String, String> data1 =
                Map.of("dog", "犬", "cat", "猫", "hamster", "ハムスター");

        data1.entrySet().stream()//Mapはstreamメソッドを持たないので、一旦、entrySetメソッドでSetに変換
                .forEach(System.out::println);//cat=猫 dog=犬 hamster=ハムスター

        //事例3：ラムダ式の戻り値から生成する – generateメソッド:public static <T> Stream<T> generate(Supplier<? extends T> s)
        //  T：要素の型  s：要素生成のためのラムダ式
        Stream
                .generate(() -> {//generateメソッドは無限ストリームを生成します
                    try {
                        // ダミーの休止
                        Thread.sleep(300);
                    } catch (InterruptedException e) { }
                    return (new Date()).getTime();
                })
                .limit(10)//limitメソッドで最初の10件でStreamを打ち切っています。
                .forEach(System.out::println);//結果は下記参照

        //事例：４　複数のStreamを結合する – concatメソッド
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        // T：要素の型 a、b：結合するStream
        Stream<String> s1 = Stream.of("あいうえお", "かきくけこ");
        Stream<String> s2 = Stream.of("さしすせそ", "たちつてと");
        Stream.concat(s1, s2)
                .forEach(System.out::println);//結果は下記参照

        //事例5：指定範囲のStreamを生成する – rangeメソッド:public static IntStream range(int start, int end)
        //startInclusive：開始値  endExclusive：終了値,start～endの範囲を持つStreamを生成　
        // rangeメソッドの戻り値は、基本型（int／long／double）に対応したIntStream／LongStream／DoubleStream
        IntStream.range(5, 10)//rangメソッドは末尾の値を含まない（＝for(int i=5;i<10;i++)
                .forEach(System.out::println);//5 6 7 8 9
        IntStream.rangeClosed(5,10)//rangeClosedメソッドは末尾を含む（＝for(int i=5;i<=10;i++)
                .forEach(System.out::println);//5 6 7 8 9 10




    }

    }

/*
事例1：解説
リスト（ArrayList）からStreamを生成するにはstreamメソッドを呼び出すだけです。
この例であればString型のリストなので、生成されるのもStream<String>です。
Streamを生成できたら、これを流れる値を処理（加工）するのが中間処理です（②）。
ここではfilterメソッドで文字数が5以上である文字列だけを残し、残った文字列から
substringメソッドで頭文字だけ取り出します。このように中間処理は必要に応じて
複数あっても構いませんし、不要であれば省略しても構いません。
最終的な処理結果を出力するのが最終処理です。この例であれば、forEachメソッドを
使って、得られた結果を順に出力しています。

事例１結果
かきくけこ
さしすせそ

事例2：結果
cat=猫
dog=犬
hamster=ハムスター

事例3：結果
1636680797512
1636680797824
1636680798137
1636680798449
1636680798762
1636680799075
1636680799403
1636680799715
1636680800028
1636680800371

事例　4：
あいうえお
かきくけこ
さしすせそ
たちつてと

事例　5：
5
6
7
8
9


 */


