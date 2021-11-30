package basic.ex.person4;
import basic.sample.enumsample.Gender;
import java.util.*;

class ViewPerson {
  public static void main(String[] args) {
   List<Person>personList = new ArrayList<>();//Arrayリスト
   Map<Gender,List<Person>>genderListMap = new HashMap<>(6);//Mapリスト
   personList.addAll(Arrays.asList(
           new Person("A", Gender.MEN,20),
           new Person("B", Gender.MEN,20),
           new Person("C", Gender.MEN,20),
           new Person("D", Gender.WOMEN,20),
           new Person("E", Gender.WOMEN,20),
           new Person("F", Gender.WOMEN,20)
   ));
   System.out.println(personList);
   //[名前：A 性別:男 年齢：20, 名前：B 性別:男 年齢：20, 名前：C 性別:男 年齢：20, 名前：D 性別:女 年齢：20, 名前：E 性別:女 年齢：20, 名前：F 性別:女 年齢：20]

   //Mapを性別に分類
   for (Person person:personList){
    if (genderListMap.containsKey(person.getGender())) { //MAPにperson.getGender()が存在しているかみる
     genderListMap.get(person.getGender()).add(person);//存在していたら、personに追加する
    }else {
     List<Person>list = new ArrayList<>();//listになければ新しいリストを作成し追加する
     list.add(person);
     genderListMap.put(person.getGender(),list);
    }
   }
   //
   System.out.println("分類チェック");
   for (Map.Entry entry:genderListMap.entrySet()){
    System.out.println(entry.getKey());
    for (Person person:(List<Person>)entry.getValue())
     System.out.println(person);
   }
   //分類チェック
   //MEN
   //名前：A 性別:男 年齢：20
   //名前：B 性別:男 年齢：20
   //名前：C 性別:男 年齢：20
   //WOMEN
   //名前：D 性別:女 年齢：20
   //名前：E 性別:女 年齢：20
   //名前：F 性別:女 年齢：20

   //各平均年齢(Arrayリストから抽出したほうがシンプルにできる）
   System.out.println("平均年齢");
   double sumMen = 0,cntMen =0,sumWomen = 0,cntWomen =0;
    for (Person person:personList){
      if (person.getGender().equals(Gender.MEN)) {
       sumMen += person.getAge();
       cntMen++;
      }else {
       sumWomen += person.getAge();
       cntWomen ++;
      }
     }
     System.out.println(String.format("平均年齢男性:%.1f",(sumMen/cntMen)));
     System.out.println(String.format("平均年齢女性:%.1f",(sumWomen/cntWomen)));
    }
  }

/*

 */

















