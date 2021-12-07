package basic.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ViewYears {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
      //1年後
        calendar.setTime(now);
        calendar.add(Calendar.YEAR,1);
        Date date1 = calendar.getTime();
        //2か月後
        calendar.setTime(now);
        calendar.add(Calendar.MONTH,2);
        Date date2 = calendar.getTime();
        //3週間前
        calendar.setTime(now);
        calendar.add(Calendar.WEEK_OF_MONTH,-3);
        Date date3 = calendar.getTime();
        //4日前
        calendar.setTime(now);
        calendar.add(Calendar.DATE,-4);
        Date date4 = calendar.getTime();
        //5時間後
        calendar.setTime(now);
        calendar.add(Calendar.HOUR,5);
        Date date5 = calendar.getTime();
        //6分前
        calendar.setTime(now);
        calendar.add(Calendar.MINUTE,-6);
        Date date6 = calendar.getTime();
        //7秒前
        calendar.setTime(now);
        calendar.add(Calendar.SECOND,7);
        Date date7 = calendar.getTime();
        // 表示
        // 出力フォーマットを指定：、表示フォーマットは"yyyy年MM時dd日 hh時　MM分dd　ss秒”
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.println("現在日時:" + format.format(now));
        System.out.println("1年後:" + format.format(date1));
        System.out.println("2ヶ月後:" + format.format(date2));
        System.out.println("3週間前:" + format.format(date3));
        System.out.println("4日前:" + format.format(date4));
        System.out.println("5時間後:" + format.format(date5));
        System.out.println("6分前:" + format.format(date6));
        System.out.println("7秒前:" + format.format(date7));

    }
}
/*
Calender クラスで作る

現在日時:2021年12月07日 11時59分34秒
1年後:2022年12月07日 11時59分34秒
2ヶ月後:2022年02月07日 11時59分34秒
3週間前:2021年11月16日 11時59分34秒
4日前:2021年12月03日 11時59分34秒
5時間後:2021年12月07日 16時59分34秒
6分前:2021年12月07日 11時53分34秒
7秒前:2021年12月07日 11時59分41秒

 */