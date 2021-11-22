package basic.sample;

import java.util.function.Consumer;
import java.util.function.Predicate;
//参照先：https://qiita.com/sano1202/items/40cc8a0e29def0c76fa8
//ラムダ式の省略方法まとめ//無名クラスをラムダ式にする
public class StreamBasic0 {
    public static void main(String[] args) {
//省略の流れ（出力なし、表記方法を覚える）
        //基本形　インタフェースPredicate<T>：関数型インタフェースなので、ラムダ式またはメソッド参照の代入先として使用できます。
        Predicate<String> javaChecker = (String s) -> { return s.equals("Java"); };

        //引数の型が省略
        Predicate<String> javaChecker1 = (s) -> { return s.equals("Java"); };

        //引数の()も省略/型を指定した場合は省略できません/引数が複数ある場合も省略できません
        Predicate<String> javaChecker2 = s -> { return s.equals("Java"); };


        //メソッドの{}も省略/処理が2文以上あると省略できません/returnを記述すると省略できません
        Consumer<String> buyer = goods -> System.out.println(goods + "を購入しました");


        //returnは省略可能ですが、メソッドの{}を残したままでは省略できません
       // Predicate<String> javaChecker3 = s ->{ s.equals("Java"); };//コンパイルエラー
        Predicate<String> javaChecker4 = s -> s.equals("Java"); ;



        //Runnableインターフェースを実装した無名クラスの例
        Runnable runner = new Runnable() {
            @Override
           public void run() {
                System.out.println("Hello Lambda!");
           }
        };
         runner.run(); //Hello Lambda!

        //事例1：無名クラスから更に「new Runnable(){}」と「public void run」を省略してラムダ式
        Runnable runner1 = () -> { System.out.println("Hello Lambda!"); };
        runner.run(); //Hello Lambda!

        //事例2：引数にインターフェースを指定して、ラムダ式を受け取ることができるメソッドを定義する
        method(()->{System.out.println("Hello Lambda!");});
    }
    public static void method(Runnable r) {
        r.run();
    }           //Hello Lambda!

    }


    /*
    解説
    事例1：
    最初の()はrunメソッドの引数を表し、->{}の中身はrunメソッドの実装内容になります。
    runner変数にはRunnableを実装した無名クラスのインスタンスが代入されます。
    つまり、ラムダ式とはインターフェースを実装したインスタンスを生成する式といえます。
    「new Runnable(){}」を省略したら、何型のインスタンスを生成するのかわかりません。
    Javaでは代入される変数の型によって自動的に推論する仕組みになっています。
    この仕組みを型推論と呼びます。

    事例2：
    引数の型から型推論して、自動的にRunnable型のインスタンスが生成されています。
    「public void run」を省略すると、複数メソッドが定義されているインターフェースの場合、どのメソッドをオーバーライドするのかわかりません。
    そのため、ラムダ式で使用できるのは抽象メソッドが一つのインターフェースのみとなります。
     */

