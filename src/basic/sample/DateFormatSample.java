package basic.sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatSample {
    public static void main(String[] args) {
        //日付クラスを任意の形式で文字列出力する
        Date date = new Date();
        //DateFormat生成　
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        System.out.println(format.format(date));//2021年11月04日13時44分01秒

        //文字列で表現された日付をDateクラスに変換する

    }
}




