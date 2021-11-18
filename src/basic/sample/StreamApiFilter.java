package basic.sample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiFilter {
    //条件に一致したオブジェクトだけを抽出する。//条件判定の関数（Predicate）を渡す
    public static void main(String[] args) {
        Stream<String> s0 = Stream.of("a", "bcd", "z");

        // filter:文字数が1文字だけのものを抽出し、2文字に増幅させる peek:値を受け取る関数
        Stream<String> s1 = s0.peek(t -> System.out.printf("peek1=%s%n", t));//s1にs0の値を受け取る：peek1=a　peek1=bcd　peek1=z
        Stream<String> s2 = s1.filter(t -> t.length() == 1);//１文字の要素を抽出してｓ2に代入
        Stream<String> s3 = s2.peek(t -> System.out.printf("peek2=%s%n", t));//s3にs2の値を受け取る；peek2=a　peek2=z
        Stream<String> s4 = s3.map(t -> t + t);//抽出した要素の文字を２文字に増幅する（t+t)
        Stream<String> s5 = s4.peek(t -> System.out.printf("peek3=%s%n", t));//s4にs5の値を受け取る：peek3=aa　peek3=zz

        List<String> r = s5.collect(Collectors.toList());// Stream<<String> s5 （ peek3=aa　peek3）→→　List<String> r に変換　
        System.out.println(r);//[aa, zz]

        /*
        処理される順番は、要素1つずつに対して「1個目のpeek」→「filter」→「2個目のpeek」→「map」→「3個目のpeek」であることが分かる。
        ある値（この例では「bcd」）が途中のfilterで条件外になると、残りのmap以降は呼ばれていない。
        つまり、（mapやfilterをいくつ組み合わせても、）全データを走査する回数は1回だけ（ループが1回だけ）ということになる。

         */

    }
}
/*
出力結果
peek1=a
peek2=a
peek3=aa
peek1=bcd
peek1=z
peek2=z
peek3=zz
[aa, zz]

 */