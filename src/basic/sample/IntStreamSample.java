package basic.sample;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
//n回繰り返すIntStream
public class IntStreamSample {
    public static void main(String[] args) {
        int count = 5;

        String query = IntStream.range(0,count)//0からcountまでのStreamインスタンス作成
                .mapToObj(i -> "?")//番号にかかわらず｛？｝に変換
                .collect(Collectors.joining(","));//｛，｝で結合
        System.out.println(query);//?,?,?,?,?
    }
}
