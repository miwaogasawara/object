package basic.ex;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ViewYears3 {
    private static void question3(){
    for (int year =2000;year<2101;year++) {
        //2000年～2100年まで
        if (year %4== 0 ){
            //年号を4で割った余りが0の時
            if (year % 100 != 0) {
                System.out.println(year + "年は「うるう年｝です");
                continue;
            }
            // 年号を400で割り切れる時
            if (year%400==0){
                System.out.println(year+"年は「うるう年」です。");
            } else {
                System.out.println(year + "年は「うるう年」ではありません。");
            }

        } else {
            System.out.println(year + "年は「うるう年」ではありません。");
        }
        }
    }
    }




/*
問題3 2000年～2100年までを閏年(うるう年）かどうか判定し表示すること。
ただし、ロジックは、下記のとおりとする。
西暦年が4で割り切れる年はうるう年ただし、西暦年が100で割り切れる
年は平年（うるう年ではない）ただし、西暦年が400で割り切れる年はうるう年
 */