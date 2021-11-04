package basic.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalSample {
    public static void main(String[] args) {

        //Dateクラス..ある特定の日時を表す、日時の計算はできない
        //現在時刻でDateクラス生成
        Date now = new Date();
        System.out.println(now);//Thu Nov 04 09:21:21 JST 2021..現在時刻
        //時刻を指定してDATEクラスのインスタンス生成
        //　1970年１月１日から5,000ミリ秒経過した時刻
        Date date = new Date(5000);
        System.out.println(date);//Thu Jan 01 09:00:05 JST 1970
        //setTimeメソッドは使用非推奨？？：Year,Month,Hours,Minutes,Second

        //Calenderクラス： 抽象クラス、日時の計算はできるが文字列の相互交換は出来ない
        Calendar calendar = Calendar.getInstance();

        //分だけを指定する
        calendar.set(Calendar.MINUTE,18);
        System.out.println("分の指定：" + calendar.getTime());//分の指定：Thu Nov 04 09:18:28 JST 2021

        //全部指定する（月は0～11で指定する）
        calendar.set(2021,0,5,18,36,42);//1月は0から始まる
        System.out.println("全部指定：" + calendar.getTime());//全部指定：Tue Jan 05 18:36:42 JST 2021 ※


        //日を表示する
        System.out.println("日を表示:" + calendar.get(Calendar.DATE));//日を表示:5　※の結果の日

        //秒を表示する
        System.out.println("秒を表示:" +calendar.get(Calendar.SECOND));//秒を表示:42　※の結果の秒

        //年を2追加する
        calendar.add(Calendar.YEAR,2);
        System.out.println("年の加算:" +calendar.getTime());//年の加算:Thu Jan 05 18:36:42 JST 2023　※の設定から2年後になった

        //月を2減らす（2か月前の日時に変更する）
        calendar.add(Calendar.MONTH,-2);
        System.out.println("月の減算:" +calendar.getTime());
        //月の減算:Sat Nov 05 18:36:42 JST 2022 (Thu Jan 05 18:36:42 JST 2023から2か月減った）

        //月の指定をする際に変換ミスをしないために以下のカレンダークラスを利用する、単独使用すると数値に変換
        System.out.println(Calendar.JANUARY);//0
        System.out.println(Calendar.FEBRUARY);//1
        System.out.println(Calendar.MARCH);//2
        System.out.println(Calendar.APRIL);//3 以下省略

        calendar.set(2021,Calendar.JANUARY,18,15,42,15);//1月は0から始まる
        System.out.println("全部指定：" + calendar.getTime());//全部指定：Mon Jan 18 15:42:15 JST 2021

        // 年月日をまとめて設定する...時刻まで表示するのを回避できないので次の項にフォーマットを作成
        calendar.set(2020,3,7);
        System.out.println("2020年4月7日に設定：" + calendar.getTime());//2020年4月7日に設定：Tue Apr 07 15:42:15 JST 2020

        calendar.set(2020,Calendar.APRIL,7);
        System.out.println("2020年4月7日に設定：" + calendar.getTime());//2020年4月7日に設定：Tue Apr 07 15:42:15 JST 2020

        // SimpleDateFormatクラスを使用して、パターンを設定する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf.format(calendar.getTime()));//2020年04月07日

    }

}
/*
【Dateクラスと Calenderクラスの相互交換】
 変換構文　 Calendar →　Date
  CalenderクラスのgetメソッドはCalenderインスタンスが保持する時刻を持つDateクラスのインスタンスに返します
            Calendar calendar = Calendar.getInstance();
            Date date1 = calendar.getTime();

 変換構文　Date  →　Calendar
 DateクラスのgetTimeメソッドはDateインスタンスが保持する時刻を持つCalendarクラスのインスタンスに返します
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calender.setTime(date)

 */

