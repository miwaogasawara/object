package basic.sample;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//Streamの終端処理　参照先　https://java-code.jp/1514
public class StreamBasic3 {
    public static void main(String[] args) {
        //事例1：要素を順に処理する – forEachメソッド:「個々の要素を引数として受け取り、これを処理する（戻り値はなし）」
        // public void forEach(Consumer<? super T> action)
        //T：要素の型 //action：個々の要素を処理するラムダ式
        Stream.of("あいうえお", "かきくけこ", "さしすせそ")
                .forEach(System.out::println);//.forEach(s -> System.out.println(s));でも同じ

        //事例2：Stream内の値が条件を満たすかを判定する – xxxxxMatchメソッド
        //public boolean anyMatch(Predicate<? super T> predicate)..条件式を満たす要素がひとつでもある場合true
        //public boolean allMatch(Predicate<? super T> predicate)..すべての要素が条件式を満たす場合true
        //public boolean noneMatch(Predicate<? super T> predicate..ひとつも満たさない場合true
        //T：要素の型 //predicate：条件式を表すラムダ式
        System.out.println(
        Stream.of("あかさか", "さくらぎちょう", "よよぎ")
                .allMatch(v -> v.length() >= 5) );//要素が5文字以上であるかを判定// 結果：false

        //事例3：最初の要素だけを取得する – findFirstメソッド:public Optional<T> findFirst()//T：要素の型
        System.out.println(
                Stream.of("あかさか", "さくま", "あおし")
                        .filter(s -> s.startsWith("あ"))//startsWithメソッドは、指定した文字列の始まりの文字列を判定する
                        //”あ”から始まる文字列の中で最初の要素を判定、findFirstメソッドの戻り値は、Optional型です
                        .findFirst()
                        //値を取得するにはorElseなどのメソッドを介さなければなりません
                        .orElse("×")
        );  // 結果：あかさか

        //事例4：Streamの内容を集計する:average／sumメソッドが利用できるのは、IntStreamなどの基本型Streamだけです。
        //public Optional<T> max(Comparator<? super T> comparator) … 最大値
        //public Optional<T> min(Comparator<? super T> comparator) … 最小値
        //public long count() … 個数
        //public OptionalDouble average() … 平均値
        //public int sum() … 合計値
        //T：要素の型  //comparator：比較ルールを表すラムダ式

        IntStream stream =IntStream.of(15, 7, 38, 50, 1);
        //結果は1行ずつコメントアウト、コメントを解除した上で確認してください.
        // 一旦、終端処理を呼び出したStreamに対して繰り返し終端処理を呼び出すことはできません。

        //System.out.printf("最大値：%d\n", stream.max().orElse(0));//50
        //System.out.printf("最小値：%d\n", stream.min().orElse(0));//最小値：1
        //System.out.printf("個数：%d\n", stream.count());//個数：5
        //System.out.printf("平均値：%f\n", stream.average().orElse(0));//平均値：22.200000
        //System.out.printf("合計値：%d", stream.sum());//合計値：111

        //事例5：Streamの値をまとめる:public Optional<T> reduce(BinaryOperator<T> accumulator
        //T：要素の型//accumulator：値を結合するためのラムダ式
        //String型のStreamをタブ区切りでまとめる例
        System.out.println(
                Stream.of("あかさか", "さくらぎちょう", "よよぎ")
                        .reduce((result, str) -> result + "\t" + str)
                        .orElse("")
        );  // 結果：あかさか  さくらぎちょう よよぎ
    }
}


/*
事例1：結果
あいうえお
かきくけこ
さしすせそ

事例2：結果
false

事例3：結果
あかさか

事例4：結果
構文中に掲載

事例5：結果
あかさか	さくらぎちょう	よよぎ

 */



