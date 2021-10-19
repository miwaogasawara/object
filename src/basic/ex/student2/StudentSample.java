package basic.ex.student2;


import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Studentクラスを表示する処理
class StudentSample {
    public static void main(String[] args) {
        //3名のインスタンスをArrayListで作成
        List<Student>students  = new ArrayList<>();
        students.addAll(Arrays.asList(

         new Student("小川", Gender.WOMEN,70,60,80),
         new Student("小森",Gender.MEN,85,90,100),
         new Student("大森",Gender.WOMEN,65,55,70)

          ));
        //表示処理
        for (Student student:students) {
            System.out.println(student);
        }
    }
}

/*

結果
小川 女 70 60 80 210 70.00
小森 男 85 90 100 275 91.67
大森 女 65 55 70 190 63.33


 */
