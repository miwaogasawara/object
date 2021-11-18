package basic.sample;

import java.util.Arrays;

//Stream APIのmapメソッド：保持している値を変換する（値を変更した新しいStreamを返す）
//参照先：https://www.ne.jp/asahi/hishidama/home/tech/java/stream.html#Stream.map
public class StreamApiMap {
    public static void main(String[] args) {
        //各要素を2倍にする操作
        int[] nums = {1, 2, 3};
        int[] newNums = Arrays.stream(nums).map(num -> 2 * num).toArray();//numsの各要素を2倍にする
        System.out.println(Arrays.toString(nums));//[1, 2, 3]
        System.out.println(Arrays.toString(newNums));//[2, 4, 6]

        //置き換える操作
        String[] strs = { "abc", "abcd", "abcde" };
        String[] newStrs = Arrays.stream(strs).map(str -> str.replace("bc", "z")).toArray(String[]::new);
        System.out.println(Arrays.toString(strs));//[1, 2, 3][2, 4, 6]
        System.out.println(Arrays.toString(newStrs));//[abc, abcd, abcde][az, azd, azde]
        /*
        解説
        String型配列{ “abc”, “abcd”, “abcde” }に対して、「bc」を「z」に置き換える操作をしてみました。
        String#replaceメソッドを中間操作で使用しました。2行目を見ると、置き換え処理ができていることが確認できます。
        最後に呼び出しているtoArrayはStream<T>インターフェースに定義されているメソッドです。引数の書き方はAPI仕様書を
        参考にしました。toArrayの定義は「<A> A[] toArray(IntFunction<A[]> generator)」です。API仕様書によれば、
        このメソッドの引数はgenerator関数というそうです。そして、配列コンストラクタ参照という方式で表現できると記載されています。
         */

    }

}
