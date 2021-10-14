package basic.ex;

//学生クラス
class Student {
    //フィールド
    private String name;//名前
    private String gender;//性別
    private int jap;//国語の得点
    private int math;//数学の得点
    private int eng;//英語の得点

    //コンストラクタ
    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
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
    //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
    //https://java-code.jp/173
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f"
                ,name,gender,jap,math,eng,sum(),ave());
    }
}
/*

Stringコードを覚えましょう！！
 return sum() / 3.0;
 3.0と小数点第１位に表示することで、double型に自動変換されます。
 今回の設定では出力にgetterやsetterは不要なので入ってません。
 */