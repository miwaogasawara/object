package basic.ex;

class StudentSample {
     //Studentクラスを表示する処理

         public static void main(String[] args) {
             //5名のインスタンスを配列で作成
             Student[] students = {
                     new Student("あいざわ","男",60,50,70),
                     new Student("いのうえ","女",90,80,100),
                     new Student("うえの","男",40,50,60),
                     new Student("えんどう","女",80,20,60),
                     new Student("おおた","男",70,100,40),
             };

             //表示処理
             for (Student student:students) {
                 System.out.println(student);
             }
         }
     }

/*

    結果
    あいざわ 男 60 50 70 180 60.00
    いのうえ 女 90 80 100 270 90.00
    うえの 男 40 50 60 150 50.00
    えんどう 女 80 20 60 160 53.33
    おおた 男 70 100 40 210 70.00

 */