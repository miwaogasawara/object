package basic.ex.person2;

import basic.sample.enumsample.Gender;

import java.util.*;

class ViewPerson {
 public static void main(String[] args) {
  List<Person> personList = new ArrayList<>(15);
  Map<Birthplace,List<Person>> birthplacePersonMap = new HashMap<>();

  //人物追加
  personList.addAll(Arrays.asList(
          new Person("やまだ",Birthplace.HOKKAIDO, Gender.MEN,35),
          new Person("いけだ",Birthplace.HOKKAIDO,Gender.WOMEN,26),
          new Person("いのうえ",Birthplace.FUKUOKA,Gender.MEN,32),
          new Person("たむら",Birthplace.FUKUOKA,Gender.WOMEN,22),
          new Person("わだ",Birthplace.TOKYO,Gender.MEN,42),
          new Person("くどう",Birthplace.TOKYO,Gender.WOMEN,55),
          new Person("さらど",Birthplace.OSAKA,Gender.MEN,31),
          new Person("あいざわ",Birthplace.OSAKA,Gender.WOMEN,44)
  ));

  //出身地ごとの分類してマップにする
  for (Person person:personList) {
   if (birthplacePersonMap.containsKey(person.getBirthplace())) {
    birthplacePersonMap.get(person.getBirthplace()).add(person);
   } else {
    List<Person> list = new ArrayList<>();
    list.add(person);
    birthplacePersonMap.put(person.getBirthplace(),list);
   }
  }

  //分類できたか表示
  System.out.println("分類チェック");
  for (Map.Entry entry:birthplacePersonMap.entrySet()) {
   System.out.println(entry.getKey());
   for (Person person:(List<Person>)entry.getValue())
    System.out.println(person);
  }
  //分類チェック
  //TOKYO
  //わだ 東京 男 42
  //くどう 東京 女 55
  //FUKUOKA
  //いのうえ 福岡 男 32
  //たむら 福岡 女 22
  //OSAKA
  //さらど 大阪 男 31
  //あいざわ 大阪 女 44
  //HOKKAIDO
  //やまだ 北海道 男 35
  //いけだ 北海道 女 26

  //平均年齢の算出
  System.out.println("平均年齢");
  for (Map.Entry entry:birthplacePersonMap.entrySet()) {
   double sum= 0,cnt = 0,sumMen = 0,sumWomen = 0,menCnt = 0,womenCnt = 0;
   for (Person person:(List<Person>)entry.getValue()) {
    sum += person.getAge();
    cnt++;
    if (person.getGender().equals(Gender.MEN)) {
     sumMen += person.getAge();
     menCnt++;
    } else {
     sumWomen += person.getAge();
     womenCnt++;
    }
   }
   System.out.println(String.format("地域:%s",((Birthplace) entry.getKey()).getName()));
   System.out.println(String.format("全体平均:%.1f歳", sum/ cnt));
   System.out.println(String.format("男性平均:%.1f歳",(sumMen / menCnt)));
   System.out.println(String.format("女性平均:%.1f歳",(sumWomen / womenCnt)));
  }

 }
}

//平均年齢
//地域:東京
//全体平均:48.5歳
//男性平均:42.0歳
//女性平均:55.0歳
//地域:福岡
//全体平均:27.0歳
//男性平均:32.0歳
//女性平均:22.0歳
//地域:大阪
//全体平均:37.5歳
//男性平均:31.0歳
//女性平均:44.0歳
//地域:北海道
//全体平均:30.5歳
//男性平均:35.0歳
//女性平均:26.0歳


/*

 */