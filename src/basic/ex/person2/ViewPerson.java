package basic.ex.person2;

import basic.sample.enumsample.Gender;
import basic.student.Student;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewPerson {
  public static void main(String[] args) {
   Map<String, List<Person>> personGroupMap = new HashMap<>(45) ;
   //リスト
   List<Person>personList = new ArrayList<>(45);
   personList.add(new Person("あおき",Birthplace.HOKKAIDO, Gender.MEN,50));
   personList.add(new Person("いしだ",Birthplace.HOKKAIDO, Gender.WOMEN,50));
   personList.add(new Person("うえの",Birthplace.HOKKAIDO, Gender.MEN,50));
   personList.add(new Person("えんどう",Birthplace.TOKYO, Gender.WOMEN,50));
   personList.add(new Person("おかだ",Birthplace.TOKYO, Gender.MEN,50));
   personList.add(new Person("かまだ",Birthplace.TOKYO, Gender.WOMEN,50));
   personList.add(new Person("きむら",Birthplace.OSAKA, Gender.MEN,50));
   personList.add(new Person("くどう",Birthplace.OSAKA, Gender.WOMEN,50));
   personList.add(new Person("こんどう",Birthplace.OSAKA, Gender.MEN,50));
   personList.add(new Person("ささき",Birthplace.FUKUOKA, Gender.WOMEN,50));
   personList.add(new Person("しみず",Birthplace.FUKUOKA, Gender.MEN,50));
   personList.add(new Person("すどう",Birthplace.FUKUOKA, Gender.WOMEN,50));

    //県別にリストを再構成する
   for (Person person:personList){
    if (personGroupMap.containsKey((person.getBirthplace()))){
       personGroupMap.get(person.getBirthplace()).add(person);
    }else {
     List<Person> list = new ArrayList<>();
     list.add(person);
     personGroupMap.put(person.getBirthplace(), list);
     System.out.println(list);
   }
  }

   //県別の年齢合計
   for (Map.Entry entry : personGroupMap.entrySet()) {
    double sumAge = 0;
    for (Person person:(List<Person>)entry.getValue()) {
     sumAge += person.getAge();
    }
    //県ごとの平均年齢
    double aveAge = sumAge /((List<?>) entry.getValue()).size();
    System.out.println(String.format("%.2F",aveAge));
   }
    //  男女別の県別平均年齢




}
}

/*
                for ( student:studentList) {
               //マップに存在するクラスの生徒出現
               if (studentGroupMap.containsKey(student.getGroup())) {
                   //リストに追加
                   studentGroupMap.get(student.getGroup()).add(student);
               } else {
                   //新しいキーを作成
                   //空のリストをセット
                   List<Student> list = new ArrayList<>();
                   list.add(student);
                   studentGroupMap.put(student.getGroup(), list);
               }
           }
               for (Map.Entry entry : studentGroupMap.entrySet()) {
                   double sumJap = 0,sumMath = 0,sumEng = 0;
                   for (Student student:(List<Student>)entry.getValue()) {
                       sumJap += student.getJap();
                       sumMath += student.getMath();
                       sumEng += student.getEng();
                   }
                   double aveJap = sumJap /((List<?>) entry.getValue()).size();
                   double aveMath = sumMath /((List<?>) entry.getValue()).size();
                   double aveEng = sumEng / ((List<?>) entry.getValue()).size();

                   System.out.println(String.format("%s %.2f %.2f %.2f",entry.getKey(),aveJap,aveMath,aveEng));
               }
                   String str = "100";
        int num = Integer.parseInt(str);
        System.out.println("num : " + num);
    }
 */