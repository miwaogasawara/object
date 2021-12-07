package basic.ex;
//ViewYearsをDayTimeApiで作成

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ViewYears2 {
    public static void main(String[] args) {
        //現時刻
        LocalDateTime now = LocalDateTime.now();
        //1年後
        LocalDateTime date1 = now.plusYears(1);
        //2か月後
        LocalDateTime date2 = now.plusMonths(2);
        //3週間前
        LocalDateTime date3 = now.minusWeeks(3);
        //4日前
        LocalDateTime date4 = now.minusDays(4);
        //5時間後
        LocalDateTime date5 = now.plusHours(5);
        //6分前
        LocalDateTime date6 = now.minusMinutes(6);
        //7秒前
        LocalDateTime date7 = now.minusSeconds(7);

        //表示
        //出力フォーマット
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        System.out.println("問題2");
        System.out.println("現在日時:" + dtf.format(now));
        System.out.println("1年後:" + dtf.format(date1));
        System.out.println("2ヶ月後:" + dtf.format(date2));
        System.out.println("3週間前:" + dtf.format(date3));
        System.out.println("4日前:" + dtf.format(date4));
        System.out.println("5時間後:" + dtf.format(date5));
        System.out.println("6分前:" + dtf.format(date6));
        System.out.println("7秒前:" + dtf.format(date7));

    }

}
/*
問題2
現在日時:2021年12月07日 13時12分25秒
1年後:2022年12月07日 13時12分25秒
2ヶ月後:2022年02月07日 13時12分25秒
3週間前:2021年11月16日 13時12分25秒
4日前:2021年12月03日 13時12分25秒
5時間後:2021年12月07日 18時12分25秒
6分前:2021年12月07日 13時06分25秒
7秒前:2021年12月07日 13時12分18秒

 */
