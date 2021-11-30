package basic.ex.person2;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//sortはプログラミングではめったにありません
public class StreamPerson2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(15);
        personList.addAll(Arrays.asList(
                new Person("やまだ",Birthplace.HOKKAIDO, Gender.MEN,35),
                new Person("いけだ",Birthplace.HOKKAIDO, Gender.WOMEN,26),
                new Person("いのうえ",Birthplace.FUKUOKA, Gender.MEN,32),
                new Person("たむら",Birthplace.FUKUOKA, Gender.WOMEN,22),
                new Person("わだ",Birthplace.TOKYO, Gender.MEN,42),
                new Person("くどう",Birthplace.TOKYO, Gender.WOMEN,55),
                new Person("さらど",Birthplace.OSAKA, Gender.MEN,31),
                new Person("あいざわ",Birthplace.OSAKA, Gender.WOMEN,44)
        ));
        //課題1:全リスト出力
        System.out.println("課題1");
        personList.stream()
                .forEach(System.out::println);

        //課題2：名前のみ出力：
        System.out.println("課題2");
        personList.stream()
               // .forEach(p->System.out.println(p.getName()));//これでも出力可
                .map(Person::getName)
                .forEach(System.out::println);

        //課題3　男性を出力
        System.out.println("課題3");
        personList.stream()
                .filter(p->p.getGender().equals(Gender.MEN))//.equals(Gender.MEN)を使う
                .forEach(System.out::println);

        //課題3-1女性のみ表示
        System.out.println("課題3-1");
        personList.stream()
                .filter(p->p.getGender().equals(Gender.WOMEN))
                .forEach(System.out::println);


        //課題4　年齢降順に替えて出力
        System.out.println("課題4");
        personList.stream()
                .sorted((p1,p2)-> p2.getAge()-p1.getAge())
                .forEach(System.out::println);

        //課題4-1　年齢降順
        System.out.println("課題4-1");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);

        //課題4-2　年齢昇順
        System.out.println("課題4-2");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))//.reversed()を外す
                .forEach(System.out::println);


        //課題5　男性のみ名前昇順に出力
        System.out.println("課題5");
        personList.stream()
                .filter(p->p.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getAge))
                //.sorted((p1,p2)-> p2.getName()-p1.getName())
                .forEach(System.out::println);

    }
}

/*
結果
課題1
やまだ 北海道 男 35
いけだ 北海道 女 26
いのうえ 福岡県 男 32
たむら 福岡県 女 22
わだ 東京都 男 42
くどう 東京都 女 55
さらど 大阪府 男 31
あいざわ 大阪府 女 44

課題2
やまだ
いけだ
いのうえ
たむら
わだ
くどう
さらど
あいざわ


課題3
やまだ 北海道 男 35
いのうえ 福岡県 男 32
わだ 東京都 男 42
さらど 大阪府 男 31

課題3-1
いけだ 北海道 女 26
たむら 福岡県 女 22
くどう 東京都 女 55
あいざわ 大阪府 女 44

課題4,4-1
くどう 東京都 女 55
あいざわ 大阪府 女 44
わだ 東京都 男 42
やまだ 北海道 男 35
いのうえ 福岡県 男 32
さらど 大阪府 男 31
いけだ 北海道 女 26
たむら 福岡県 女 22

課題4-2
たむら 福岡県 女 22
いけだ 北海道 女 26
さらど 大阪府 男 31
いのうえ 福岡県 男 32
やまだ 北海道 男 35
わだ 東京都 男 42
あいざわ 大阪府 女 44
くどう 東京都 女 55

課題5
さらど 大阪府 男 31
いのうえ 福岡県 男 32
やまだ 北海道 男 35
わだ 東京都 男 42


 */
