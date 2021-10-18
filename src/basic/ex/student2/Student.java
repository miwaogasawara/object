package basic.ex.student2;

public class Student {
    private String name;
    private  String gender;
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jap=" + jap +
                ", math=" + math +
                ", eng=" + eng +
                '}';
    }
}



/*
練習問題　4
練習問題３で作成したプログラムを変更しなさい。
１．Student クラスにゲッターを作成しなさい。
２．性別のフィールドを列挙型 Gender に変更しなさい。（以前に作成した列挙型を使用する）
３．StudentSample を配列ではなく ArrayList を利用する形に変更しなさい。

    パッケージ
package ex.student2;

    フィールド
 private String name;//名前
 private Gender gender;//性別
 private int jap;//国語の得点
 private int math;//数学の得点
 private int eng;//英語の得点


 */
