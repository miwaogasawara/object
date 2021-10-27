package basic.ex.person3;

import basic.ex.person2.Birthplace;
import basic.sample.enumsample.Gender;

import javax.swing.*;
import java.util.*;

class ViewPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Map<String, List<Person>> stringListMap = new HashMap<>();

        personList.addAll(Arrays.asList(
                new Person("1-1", "A", Gender.WOMEN, Birthplace.AKITA, 25),
                new Person("1-1", "B", Gender.MEN, Birthplace.AKITA, 50),
                new Person("1-1", "C", Gender.WOMEN, Birthplace.AKITA, 25),
                new Person("1-1", "D", Gender.MEN, Birthplace.AKITA, 50),
                new Person("1-2", "E", Gender.WOMEN, Birthplace.OKINAWA, 25),
                new Person("1-2", "F", Gender.WOMEN, Birthplace.OKINAWA, 50),
                new Person("1-2", "G", Gender.MEN, Birthplace.OKINAWA, 25),
                new Person("1-2", "F", Gender.MEN, Birthplace.OKINAWA, 50)
        ));
        //group 分け1-1と1-2に分ける
        for (Person person : personList) {
            if (stringListMap.containsKey(person.getGroup())) {
                stringListMap.get(person.getGroup()).add(person);
            } else {
                List<Person> list = new ArrayList<>();
                list.add(person);
                stringListMap.put(person.getGroup(), list);
            }
        }
        //分類確認のチェック
        System.out.println("分類チェック");

        for (Map.Entry entry : stringListMap.entrySet()) {//Map.Entry:KyeとY（値）セットということ
            System.out.println(entry.getKey());
            for (Person person : (List<Person>) entry.getValue())
                System.out.println(person);
        }
        //平均年齢
        //1-1:
        //全体平均:37.5歳
        //男性平均:50.0歳
        //女性平均:25.0歳
        //1-2:
        //全体平均:37.5歳
        //男性平均:37.5歳
        //女性平均:37.5歳

//分類チェック
//1-1
//1-1 A 女 秋田県 25
//1-1 B 男 秋田県 50
//1-1 C 女 秋田県 25
//1-1 D 男 秋田県 50
//1-2
//1-2 E 女 沖縄県 25
//1-2 F 女 沖縄県 50
//1-2 G 男 沖縄県 25
//1-2 F 男 沖縄県 50

        //平均年齢の算出
        System.out.println("平均年齢");
        for (Map.Entry entry : stringListMap.entrySet()) {//entrySetで全要素を取得する
            double sum = 0, cnt = 0, sumMen = 0, sumWomen = 0, menCnt = 0, womenCnt = 0;
            for (Person person : (List<Person>) entry.getValue()) {//値の配列から
                sum += person.getAge();//年齢を取得して加算する
                cnt++;//cntを1加算
                if (person.getGender().equals((Gender.MEN))) {
                    sumMen += person.getAge();
                    menCnt++;
                } else {
                    sumWomen += person.getAge();
                    womenCnt++;
                }

            }
            System.out.println(String.format("%s:",entry.getKey()));
            System.out.println(String.format("全体平均:%.1f歳", sum / cnt));
            System.out.println(String.format("男性平均:%.1f歳", (sumMen / womenCnt)));
            System.out.println(String.format("女性平均:%.1f歳", (sumWomen / womenCnt)));


        }
    }
}

/*
      entrySetメソッドは、Mapのクラスメソッド
    連想配列キーとバリューの組み合わせをエントリーといい、Mapのコレクションを返す。
    Mapの配列ループのようなもので、動作が速い。
    Map.Entryは、getKeyメソッドで、key。getValueメソッドで、valueの値を取得する。
    .entrySet( ); を使うことでentry全要素を取得することが可能。
    .keySet( ); を使うことでkey全要素を取得することが可能。
    .valueSet( ); を使うことでvalue全要素を取得することが可能。
 */



