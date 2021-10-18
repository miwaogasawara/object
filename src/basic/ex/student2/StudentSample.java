package basic.ex.student2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StudentSample {
    public static void main(String[] args) {
        List<Student>students  = new ArrayList<>();
        students.addAll(Arrays.asList(

         new Student("小川","女",70,60,80),
         new Student("小森","男",100,85,90),
         new Student("大森","女",65,55,70)

          ));

    }
}
