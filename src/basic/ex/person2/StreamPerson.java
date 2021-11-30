package basic.ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPerson {
    public static void main(String[] args) {
        //ArrayListを作る
        List<Person> personList = new ArrayList<>(15);
        personList.addAll(Arrays.asList(
                //人物追加
                new Person("やまだ",Birthplace.HOKKAIDO, Gender.MEN,35),
                new Person("いけだ",Birthplace.HOKKAIDO,Gender.WOMEN,26),
                new Person("いのうえ",Birthplace.FUKUOKA,Gender.MEN,32),
                new Person("たむら",Birthplace.FUKUOKA,Gender.WOMEN,22),
                new Person("わだ",Birthplace.TOKYO,Gender.MEN,42),
                new Person("くどう",Birthplace.TOKYO,Gender.WOMEN,55),
                new Person("さらど",Birthplace.OSAKA,Gender.MEN,31),
                new Person("あいざわ",Birthplace.OSAKA,Gender.WOMEN,44)
        ));
        //Streamの練習
        //年齢が３５歳以上人の名前を抽出
        System.out.println("練習1");
        personList.stream()//stream()の生成
                .filter(p->p.getAge()>=35)//３５歳以上
                .forEach(p->System.out.println(p.getName()));//名前だけを表示：練習1 やまだ わだ  くどう あいざわ

        //35歳未満の人の情報をすべて表示
        System.out.println("練習2");
        personList.stream()
                .filter(p->p.getAge()<35)
                .forEach(System.out::println);//リストをすべて抽出
        // 結果：練習2 いけだ 北海道 女 26 いのうえ 福岡県 男 32 たむら 福岡県 女 22   さらど 大阪府 男 31









    }

}
