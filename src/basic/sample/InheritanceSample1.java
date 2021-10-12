package basic.sample;

//スーパークラスのサンプル
class SuperSample {
    protected int number;
//コンストラクタの生成
    public SuperSample(int number) {
        this.number = number;
    }
//toStringの生成　自動生成のままです
    @Override
    public String toString() {
        return "SuperSample{" +
                "number=" + number +
                '}';
    }
}

//継承のみのサブクラス①
class SubSample1 extends SuperSample {
    public SubSample1(int number) {
        super(number);
    }
}

//フィールドとメソッドの追加とオーバーライドをしたサブクラス②
class SubSample2 extends SuperSample {
    //追加したフィールド
    private String string;

    public SubSample2(int number, String string) {
        super(number);
        this.string = string;
    }

    //追加したメソッド　スーパークラスは存在しないのでこのクラスでしか使えない
    public String getString() {
        return string;
    }

    //オーバーライドしたメソッド
    @Override
    public String toString() {
        return "SubSample2{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}
//結果出力　○○Sampleと同じ　ここはスーパークラスで定義した内容のものしか出力できない
// つまり、サブサンプル②のgetStringは呼べない
class InheritanceSample1 {
    public static void main(String[] args) {
        //スパークラスの型での宣言
        SuperSample superSample = new SuperSample(10);
        SuperSample subSample1 = new SubSample1(10);
        SuperSample subSample2 = new SubSample2(10,"abc");

        //各インスタンスの振る舞い
        //振る舞いはどのクラスのインスタンスによるかで決まる
        System.out.println(superSample);
        System.out.println(subSample1);
        System.out.println(subSample2);

        //型による制約
        //型のクラスに存在しないメソッドは利用できない
        SubSample2 subSample3 = (SubSample2) subSample2;
        //SubSample2型でないと追加されたメソッドは使用できない
        System.out.println(subSample3.getString());
    }
}
/*
このサンプルは、スーパークラスとサブクラス2つ出力サンプルを1つの構文に書かれています。
１枚に書かれていますが、今までは４つのjava classとして書かれていたものです。

スーパークラスに宣言していないメソッドは使用できません。
そのため、サブクラス②に記載されているget String　はスーパークラスから出力できません。

結果
SuperSample{number=10}
SuperSample{number=10}
SubSample2{number=10, string='abc'}
abc


 */