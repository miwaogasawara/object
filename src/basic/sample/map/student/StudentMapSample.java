package basic.sample.map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {
     public static void main(String[] args) {
         //クラス毎のMAP
         Map<String, List<Student>> studentGroupMap = new HashMap<>(40) ;
         //学生のリスト
         List<Student>studentList = new ArrayList<>(100);
           studentList.add(new Student("1-1","やまだ", Gender.MEN,50,70,80));
           studentList.add(new Student("1-1","たけだ", Gender.WOMEN,100,40,80));
           studentList.add(new Student("1-1","いけだ", Gender.MEN,50,60,20));
           studentList.add(new Student("1-2","かまだ", Gender.WOMEN,80,90,80));
           studentList.add(new Student("1-2","わしだ", Gender.MEN,60,70,80));
           studentList.add(new Student("1-2","すずき", Gender.WOMEN,85,70,80));
           studentList.add(new Student("1-3","さいとう", Gender.MEN,90,70,40));
           studentList.add(new Student("1-3","さとう", Gender.WOMEN,60,90,80));
           studentList.add(new Student("1-3","ささき", Gender.MEN,60,70,100));
           studentList.add(new Student("1-4","おおた", Gender.WOMEN,80,50,90));
           studentList.add(new Student("1-4","こもり", Gender.MEN,70,70,80));
           studentList.add(new Student("1-4","かねだ", Gender.WOMEN,60,90,80));
           studentList.add(new Student("1-5","あいもり", Gender.MEN,100,95,100));
           studentList.add(new Student("1-5","たがみ", Gender.WOMEN,30,40,80));
           studentList.add(new Student("1-5","たかはし", Gender.MEN,75,50,100));



           for (Student student:studentList) {
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

                   }


               }
/*
 //キーによる検索
        String searchWord = "orange";
        if (map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        } else {
            System.out.println("Not find:" + searchWord);

結果
1-1 66.67 56.67 60.00
1-2 75.00 76.67 80.00
1-3 70.00 76.67 73.33
1-4 70.00 70.00 83.33
1-5 68.33 61.67 93.33

 */