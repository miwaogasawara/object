package basic.sample;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBasic6 {
    //Listの初期化..IntStream.of~.boxed()
    public static void main(String[] args) {
        //IntStream.ofで作成したStreamからListを作成、.boxed()メソッドでプリミティブ型intを　Integerに変換
        List<Integer>integerList = IntStream.of(1,62,31,1,54,31).boxed()
                .collect(Collectors.toList());
        System.out.println(integerList);//[1, 62, 31, 1, 54, 31]

        //値の範囲からListを作成:IntStream.range..100を含む場合はIntStream.rangeClosedを使う
        List<Integer>integerList1 = IntStream.range(1,100).boxed()
                .collect(Collectors.toList());
        System.out.println(integerList1);//[1,2,3~98,99]...100は含まないので注意❕

        //Streamを用いて配列を作成する
        Integer[]integerArray = IntStream.of(1,62,31,1,54,31).boxed()
                .toArray(n->new Integer[n]);

    }
}
