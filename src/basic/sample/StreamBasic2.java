package basic.sample;

import basic.student.Student;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//stream 中間処理 参照先：https://java-code.jp/1510
public class StreamBasic2 {
    public static void main(String[] args) {
        //事例1：値を加工する – mapメソッド:与えられた文字列リストから先頭文字のコードポイント値を求める例
        // public <R> Stream<R> map(Function<? super T,? extends R> mapper)
        //T：元の要素の型 //R：加工後の要素の型//mapper：要素を加工するためのラムダ式
        Stream.of("あいうえお", "かきくけこ", "さしすせそ")
                .map(s -> s.codePointAt(0))
                .forEach(System.out::println);
        //※mapメソッドによる加工前後のデータ型は変化しても構いません。
        // この例であれば、加工前はStream<String>ですが、加工後はStream<Integer>です。

        //事例2：条件で値を絞り込む – filterメソッド:public Stream<T> filter(Predicate<? super T> predicate)
        //T：要素の型 //predicate：要素を判定するラムダ式
        Stream.of("あかさか", "さくらぎちょう", "あおもり")
                .filter(s -> s.startsWith("あ"))//「あ」で始まる要素だけを残す
                .forEach(System.out::println);//あかさか  あおもり

        //事例3：特定範囲の要素だけを取得する – skip／limitメソッド:
        // public Stream<T> skip(long n),public Stream<T> limit(long max)
        //T：要素の型 //n：スキップする要素数 //max：取得する要素数
        IntStream.range(1, 10)//Streamからn+1～n+max番目の要素
                .skip(5)//先頭5番目の要素をスキップ
                .limit(3)//6番目の要素から3個の要素を取得す
                .forEach(System.out::println);//6 7 8

        //値を並べ替える – sortedメソッド:public Stream<T> sorted(Comparator<? super T> comparator
        //T：要素の型 //comparator：比較ル比ール
        Stream.of("あかさか", "さくらぎちょう", "よよぎ")
                .sorted((s1, s2) -> s2.length() - s1.length())
                //s1、s2の文字列長の差を求め、文字列長の大小を表しています。
                //文字列長が長い順に並べ替えます。
                .forEach(System.out::println);//さくらぎちょう  あかさか  よよぎ




    }
}
/*
事例1　結果
12354
12363
12373

事例2　結果
あかさか
あおもり

事例3：結果
6
7
8

事例4：結果
さくらぎちょう
あかさか
よよぎ
 */
