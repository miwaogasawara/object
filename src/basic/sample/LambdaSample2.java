package basic.sample;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

////ラムダ式関数型インタフェース
public class LambdaSample2 {
    public static void main(String[] args) {
        //Function<T, R> :Tはメソッドの引数の型、Rは戻り値の型を指定します。メソッドは R apply(T) です。
        Function<Integer, String> asterisker = (i) -> { return "*"+ i; };
        String result = asterisker.apply(10);//applyメソッドは、引数があり、戻り値もあります
        System.out.println(result); // *10

        //BiFunctionインターフェース:2つの引数を受け付ける
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> { return a + b; };
        int result1= adder.apply(1, 2);
        System.out.println(result1); // 3

        //Consumer<T>:メソッドの引数の型を指定します。メソッドは void accept(T) です。
        Consumer<String> buyer = (goods) -> { System.out.println(goods + "を購入しました"); };
        buyer.accept("おにぎり"); // おにぎりを購入しました。

        //Predicate<T>:Tはメソッドの引数の型を指定します。メソッドは boolean test(T) です。
        Predicate<String> checker = (s)-> { return s.equals("Java"); };
        boolean result2 = checker.test("Java");
        System.out.println(result2); //true
    }

}
