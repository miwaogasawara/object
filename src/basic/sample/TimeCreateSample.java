package basic.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

public class TimeCreateSample {
    public static void main(String[] args) {
        //現在の日付
        LocalDate date = LocalDate.now();
        System.out.println(date);//2021-11-04
       // System.out.println(LocalDateTime.now()); //上記2行を１行で記述する方法
        //現在の時間
        LocalTime time = LocalTime.now();
        System.out.println(time);//12:38:22.154126
        //現座の日付と時刻
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);//2021-11-04T12:40:23.689796

        //年月日時分秒を指定する：月指定は1～12を使用する
        System.out.println(LocalDateTime.of(2017, Month.JANUARY,1,1,23,45));
                                                        //2017-01-01T01:23:45
        System.out.println(LocalDateTime.of(2017, 1,1,1,23,45));
                                                        //2017-01-01T01:23:45
        System.out.println(date.of(2017, 1,1));//2017-01-01

        //parseメソッド；日付文字列を指定して取得する
        System.out.println(LocalDateTime.parse("2017-01-01T01:23"));//2017-01-01T01:23　ミリ秒は省略
        System.out.println(LocalDate.parse("2017-01-01"));//2017-01-01　日付のみ
        System.out.println(LocalTime.parse("13:07:30"));//13:07:30

        //年月日の各フィールドの値を個別に取得できる 設定：2017年1月2日3時45分6秒（890000000ナノ秒）
        LocalDateTime dateTime1 = LocalDateTime.of(2017,Month.JANUARY,2,3,45,6,890_000_000);
        System.out.println("年:" + dateTime1.getYear());//年:2017
        System.out.println("月（enum):" + dateTime1.getMonth());//月（enum):JANUARY
        System.out.println("月（数字）:" + dateTime1.getMonthValue());//月（数字）:1
        System.out.println("日:" + dateTime1.getDayOfMonth());//日:2
        System.out.println("時:" + dateTime1.getHour());//時:3
        System.out.println("分:" + dateTime1.getMinute());//分:45
        System.out.println("秒:" + dateTime1.getSecond());//秒:6
        System.out.println("ナノ秒:" + dateTime1.getNano());//ナノ秒:890000000

        //年月日の計算ができる 設定：2017年1月2日3時45分6秒（890000000ナノ秒）
        System.out.println("3日後:"+ dateTime1.plusDays(3));//3日後:2017-01-05T03:45:06.890
        System.out.println("100日前:"+ dateTime1.minusDays(100));//100日前:2016-09-24T03:45:06.890
        System.out.println("30秒前:"+ dateTime1.minusSeconds(30));//30秒前:2017-01-02T03:44:36.890
        System.out.println("元の値:"+ dateTime1);//元の値:2017-01-02T03:45:06.890


    }

}
/*
Date and Time API　のメリット
1.日付、時間、時刻をそれぞれ別のクラスで扱うため、必要に応じて使い分けができる（不要な情報を保持しなくてよい）
2.年月日など指定してインスタンスを生成できる
3.年月日の各フィールドの値を個別に取得できる
4.年月日の計算ができる
5.イミュータブルである（作成後変化させることができないオブジェクト）


 */
