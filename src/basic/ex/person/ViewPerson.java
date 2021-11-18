package basic.ex.person;

import basic.sample.enumsample.Gender;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ViewPerson {
    //arrayList作成
  public static void main(String[] args) {
   List<Person> personArrayList= new ArrayList<>();
   personArrayList.addAll(Arrays.asList(
           new Person("しむら", Gender.MEN,28),
           new Person("すどう", Gender.WOMEN,34),
           new Person("そのだ", Gender.WOMEN,21),
           new Person("さの", Gender.MEN,42),
           new Person("せがわ", Gender.WOMEN,55)
           ));


      //並び変え
      Comparator<Person> getAgeReverseOrder = Comparator.comparing(Person::getAge,Comparator.reverseOrder());//年齢降順

      //課題：1５名の Person クラスのインスタンスを ArrayList に作成し一覧表示しなさい
      System.out.println("課題1");
      for (Person person:personArrayList){
          System.out.println(person);
      }

      //課題2　年齢の降順に並べ替えて表示しなさい。
      System.out.println("課題2");
      personArrayList.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));//リバースオーダーで降順
      for (Person person:personArrayList) {
          System.out.println(person);
      }
     //課題3　 男性のみ名前の昇順で並べ替えて表示しなさい。
          System.out.println("課題3");
          personArrayList.sort(Comparator.comparing(Person::getName));//最初に名前を昇順にします
          for (Person person:personArrayList) {
              if (person.getGender().equals(Gender.MEN)){//昇順にしたものからequalsメソッドで男性を抽出する
                  System.out.println(person);
              }
          }

      //課題4　　男性と女性の平均年齢を求め表示しなさい。
      System.out.println("課題4");
      int sumMen = 0,sumWomen = 0;//合計を性別に宣言
      double countMen = 0,countWomen = 0;//結果が小数点になるので、性別にdoubleでcount（男性・女性の個数をカウント）設定する
      for (Person person:personArrayList) {
          if (person.getGender().equals(Gender.MEN)){// もし男性だったら、
              countMen++;//男性人数を1増やす
              sumMen += person.getAge();//年齢合計を加算していく
          } else {//女性の場合
              countWomen++;
              sumWomen += person.getAge();
          }
      }
      System.out.println(String.format("男性の平均年齢:%.1f",sumMen/countMen));//合計をカウント数で割る
      System.out.println(String.format("女性の平均年齢:%.1f",sumWomen/countWomen));//合計をカウント数で割る


      //課題5　男性・女性の最年長をそれぞれ表示しなさい
      List<Person> menList = new ArrayList<>();//男性と女性に分けるため、定義する
      List<Person> womenList = new ArrayList<>();//

      for (Person person:personArrayList) {
          if (person.getGender().equals(Gender.MEN)){//equalsメソッドで男性と女性を分ける
              menList.add(person);
          } else {
              womenList.add(person);
          }
      }

      System.out.println("課題５");//
      menList.sort(Comparator.comparing(Person::getAge));//男性を昇順に並び変える
      womenList.sort(Comparator.comparing(Person::getAge));//女性を昇順に並び変える
      System.out.println("男性の最年長:" + menList.get(menList.size()-1));//リストのナンバー”0-1”で-1になり昇順の最終列になる
      System.out.println("女性の最年長:" + womenList.get(womenList.size()-1));//リストのナンバー”0-1”で-1になり昇順の最終列になる

      }
  }

/*
練習課題7
人物情報のクラス「Person」を次の仕様で作成しなさい。

パッケージ
package ex.person;
クラス図
~Person
- name String
- gender Gender
- age int
+ getName() String
+ getGender() Gender
+ getAge() int
+ toString() String
実行クラス「ViewPerson」を作成して、次の機能を作成しなさい。

課題１ ５名の Person クラスのインスタンスを ArrayList に作成し一覧表示しなさい。
課題1
しむら男　28
すどう　女　34
そのだ　女　21
さの　男　42
せがわ　女　55

課題２ 年齢の降順に並べ替えて表示しなさい。
課題　2
せがわ　女　55
さの　男　42
すどう　女　34
しむら　男　28
そのだ　女　21

課題３ 男性のみ名前の昇順で並べ替えて表示しなさい。
さの　男４２
しむら　男　28

課題４ 男性と女性の平均年齢を求め表示しなさい。
課題４
男性の平均年齢：35.0
女性の平均年齢：36.7


課題５ 男性・女性の最年長をそれぞれ表示しなさい。
課題５
男性の最年長：さの　男　42
女性の最年長：せがわ　女　55

。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。
出力結果
課題1
しむら 男 28
すどう 女 34
そのだ 女 21
さの 男 42
せがわ 女 55

課題2
せがわ 女 55
さの 男 42
すどう 女 34
しむら 男 28
そのだ 女 21

課題3
課題３
さの 男 42
しむら 男 28

課題4
男性の平均年齢:35.0
女性の平均年齢:36.7
課題５
男性の最年長:さの 男 42
女性の最年長:せがわ 女 55



結果
課題1
しむら 男 28
すどう 女 34
そのだ 女 21
さの 男 42
せがわ 女 55

課題2
せがわ 女 55
さの 男 42
すどう 女 34
しむら 男 28
そのだ 女 21

課題3
さの 男 42
しむら 男 28

課題4
男性の平均年齢:35.0
女性の平均年齢:36.7
課題５
男性の最年長:さの 男 42
女性の最年長:せがわ 女 55

 */
