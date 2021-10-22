package basic.sample.sort;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Studentクラスを表示する処理
class StudentSample {
    public static void main(String[] args) {
        //5名のインスタンスをArrayListで作成
        List<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(
                new Student("あいざわ", Gender.MEN,60,50,70),
                new Student("いのうえ",Gender.WOMEN,80,80,100),
                new Student("うえの",Gender.MEN,40,50,60),
                new Student("えんどう",Gender.WOMEN,80,80,60),
                new Student("おおた",Gender.MEN,80,100,40)
        ));

        //配列の初期値を表示
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/ArrayList.html#forEach(java.util.function.Consumer)
        System.out.println("初期の並び順");
        students.forEach(System.out::println);//forEachは後ほど再度勉強します

        //比較関数の作成
        //public interface Comparator<T>
        //オブジェクトのコレクションで全体順序付けを行う比較関数です。 コンパレータ(Comparator)をソート・メソ
        // ッド(Collections.sortやArrays.sortなど)に渡すと、ソート順を正確に制御できます。 また、コンパレ
        // ータを使用すると、sorted sets (ソート・セット)やsorted maps (ソート・マップ)などの特定のデータ
        // 付けを提供したりすることもできます。
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Comparator.html
        Comparator<Student> japNaturalOrder = Comparator.comparing(Student::getJap);//Comparator.naturalOrder()は省略される、国語昇順
        Comparator<Student> japReverseOrder = Comparator.comparing(Student::getJap,Comparator.reverseOrder());//国語降順
        Comparator<Student> mathReverseOrder = Comparator.comparing(Student::getMath,Comparator.reverseOrder());//数学降順
        Comparator<Student> engReverseOrder = Comparator.comparing(Student::getEng,Comparator.reverseOrder());//英語降順


        //出力
        students.sort(japNaturalOrder);
        System.out.println("\n国語の昇順");
        students.forEach(System.out::println);

        students.sort(japReverseOrder);
        System.out.println("\n国語の降順");
        students.forEach(System.out::println);

        students.sort(japReverseOrder.thenComparing(mathReverseOrder).thenComparing(engReverseOrder));
        System.out.println("\n国語の降順→数学の降順→英語の降順");
        students.forEach(System.out::println);

        students.sort(Comparator.naturalOrder());
        System.out.println("\n合計点の昇順");
        students.forEach(System.out::println);

        students.sort(Comparator.reverseOrder());
        System.out.println("\n合計点の降順");
        students.forEach(System.out::println);
    }
}
/*
結果
初期の並び順
あいざわ 男 60 50 70 180 60.00
いのうえ 女 80 80 100 260 86.67
うえの 男 40 50 60 150 50.00
えんどう 女 80 80 60 220 73.33
おおた 男 80 100 40 220 73.33

国語の昇順
うえの 男 40 50 60 150 50.00
あいざわ 男 60 50 70 180 60.00
いのうえ 女 80 80 100 260 86.67
えんどう 女 80 80 60 220 73.33
おおた 男 80 100 40 220 73.33

国語の降順
いのうえ 女 80 80 100 260 86.67
えんどう 女 80 80 60 220 73.33
おおた 男 80 100 40 220 73.33
あいざわ 男 60 50 70 180 60.00
うえの 男 40 50 60 150 50.00

国語の降順→数学の降順→英語の降順
おおた 男 80 100 40 220 73.33
いのうえ 女 80 80 100 260 86.67
えんどう 女 80 80 60 220 73.33
あいざわ 男 60 50 70 180 60.00
うえの 男 40 50 60 150 50.00

合計点の昇順
うえの 男 40 50 60 150 50.00
あいざわ 男 60 50 70 180 60.00
おおた 男 80 100 40 220 73.33
えんどう 女 80 80 60 220 73.33
いのうえ 女 80 80 100 260 86.67

合計点の降順
いのうえ 女 80 80 100 260 86.67
おおた 男 80 100 40 220 73.33
えんどう 女 80 80 60 220 73.33
あいざわ 男 60 50 70 180 60.00
うえの 男 40 50 60 150 50.00


 */
