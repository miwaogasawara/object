package basic.ex.student2;

import basic.sample.enumsample.Gender;

//学生クラス
 class Student {
    //フィールド
    private String name;
    private Gender gender;
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    //コンストラクタ
    public Student(String name, Gender gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
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
    /**
     * テストの個人合計を求める
     * @return int 国語・数学・英語の合計点
     */
    public int sum() {
        return jap + math + eng;
    }

    /**
     * テストの個人平均を求める
     * @return double 国語・数学・英語の平均点
     */
    public double ave() {
        return sum() / 3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f"
                ,name,gender.getJpName(),jap,math,eng,sum(),ave());
    }

    }




/*
練習問題　4
練習問題３で作成したプログラムを変更しなさい。
１．Student クラスにゲッターを作成しなさい。
２．性別のフィールドを列挙型 Gender に変更しなさい。（以前に作成した列挙型を使用する）
３．StudentSample を配列ではなく ArrayList を利用する形に変更しなさい。
4.個人の名前、性別、取得点数、合計、平均を表示する

    パッケージ
package ex.student2;

    フィールド
 private String name;//名前
 private Gender gender;//性別
 private int jap;//国語の得点
 private int math;//数学の得点
 private int eng;//英語の得点

    【２．性別のフィールドを列挙型 Gender に変更しなさい。（以前に作成した列挙型を使用する）】
    　この部分はsample-enumSampleに"public-Gender" 列挙型を作成したので、
      インポートされ参照されます。なので改めて作成しなくても大丈夫。インスタンス作成時に
      Gender genderで記載すること。
 */
