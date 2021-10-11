package basic.human2;

public class Human {
    //フィールドの設定
    String name;
    int age;

    //コンストラクタ　オーバーロード　（同じ戻り値とメソッド名でシグネチャが異なるメソッドを定義）
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
