package basic.ex.person2;

import basic.sample.enumsample.Gender;

import java.util.*;
import java.util.stream.Collectors;


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
        System.out.println("課題1");//
        personList.stream()// personList.stream()の生成
                .forEach(System.out::println);//終端処理：アクションの実行

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
                .sorted(Comparator.comparing(Person::getAge).reversed())//sortedのみでは昇順になる
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
                .sorted(Comparator.comparing(Person::getName))
                //.sorted((p1,p2)-> p2.getName()-p1.getName())
                .forEach(System.out::println);


        //練習問題10
        //課題6　PersonList空名前リストを作成
        System.out.println("課題6");
        List<String>nameList = personList.stream()//格納するListを作成する
                .map(Person::getName)//Personから名前を抽出
                .collect(Collectors.toList());//nameListにListの形で渡す
        nameList.forEach(System.out::println);//作成したListを出力

        //課題7　性別でグルーピングしたMAP＜Gender,List(Person)>を生成し内容を示す
        System.out.println("課題7");
        Map<Gender,List<Person>>map = personList.stream()//personList.stream()からMap作成
                .collect(Collectors.groupingBy(Person::getGender));//MapのKyeはGenderにする
        map.entrySet().stream()//mapにデータを入れる、前行で終端操作collectを使っているので改めて.stream()を作る
                .map(s-> s.getKey().getJpName() +":"+s.getValue())//map出力表示Kyeとvalueの間に”：”を入れる
                .forEach (System.out::println);//結果出力


        //課題8　男性で年長の人を表示　max 戻り値がない場合があるのでOptionalを使う
        System.out.println("課題8");
        Optional<Person>person = personList.stream()//先頭にOptionalを付けるとnullが返ったら終了
                .filter((p->p.getGender().equals(Gender.MEN)))
                .max(Comparator.comparing(Person::getAge));
                person.ifPresent(System.out::println);//.ifPresent


        //課題9　女性で最年少の人を表示 min
        System.out.println("課題9");
        Optional<Person>person1 = personList.stream()
                .filter(p->p.getGender().equals(Gender.WOMEN))
                .min(Comparator.comparing(Person::getAge));
                person1.ifPresent(System.out::println);


        //課題10女性の平均年齢を表示
        System.out.println("課題10");
        OptionalDouble womenAverage = personList.stream()//averageは” OptionalDouble ”
                .filter(p->p.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)//mapToIntでnullが入らなくなる
                .average();//平均を出す
        womenAverage.ifPresent(a-> System.out.println("女性の平均年齢:"+a));


        //課題11男性の平均年齢を表示
        System.out.println("課題11");
        OptionalDouble menAverage = personList.stream()//averageは” OptionalDouble ”
                .filter(p->p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)//mapToIntでnullが入らなくなる
                .average();//平均を出す
        menAverage.ifPresent(a-> System.out.println("男性の平均年齢:"+a));

        }
    }


/*
※Comparator.comparing
オブジェクトのコレクションで全体順序付けを行う比較関数

※groupingByメソッド
要素を集約したMapを返す



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
いのうえ 福岡県 男 32
さらど 大阪府 男 31
やまだ 北海道 男 35
わだ 東京都 男 42

課題6
やまだ
いけだ
いのうえ
たむら
わだ
くどう
さらど
あいざわ

課題7
女:[いけだ 北海道 女 26, たむら 福岡県 女 22, くどう 東京都 女 55, あいざわ 大阪府 女 44]
男:[やまだ 北海道 男 35, いのうえ 福岡県 男 32, わだ 東京都 男 42, さらど 大阪府 男 31]

課題8
わだ 東京都 男 42


課題10
女性の平均年齢:36.75

課題11
男性の平均年齢:35.0

 */
