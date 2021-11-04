package basic.sample;

import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.chrono.JapaneseEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class TimeCreateSample2 {
    public static void main(String[] args) {
        //日付/時間クラスを任意の形式で文字列を出力する
        LocalDateTime date = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss.SSS").format(date));
                                                        //2021/11/04 14:26:21.527
        //文字列で表現された日付を日付/時間クラスに変換する:parseメソッド　戻り値の型がTemporalAccessorインタフェースなり扱いづらいため
        //LocalDateTimeクラスなどに変換します。
        TemporalAccessor parsed = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").parse("2017/02/25 19:09:59");
        LocalDateTime dateTime = LocalDateTime.from((parsed));
        System.out.println(dateTime);//2017-02-25T19:09:59

        //西暦を和暦に変換する
        JapaneseDate date1 = JapaneseDate.of(2017,2,4);
        System.out.println(date1);//Japanese Heisei 29-02-04
        JapaneseDate date2 = JapaneseDate.of(2021,11,4);
        System.out.println(date2);//Japanese Reiwa 3-11-04

        //和暦を指定して、日付インスタンスを作成　：java.time.chrono.JapaneseEraクラス
        JapaneseDate date3 = JapaneseDate.of(JapaneseEra.HEISEI,29,2,4);
        System.out.println(date3);//Japanese Heisei 29-02-04...令和には対応していないかも！！

        //和暦を利用した日付の文字列表現と日付クラスの相互交換
        JapaneseDate date4 = JapaneseDate.of(2017,2,4);
        System.out.println(DateTimeFormatter.ofPattern("GGGGy年M月d日").format(date4));//平成29年2月4日 ※令和は別途！！
    }
}
