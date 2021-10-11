package basic.human1;

//データとしてのクラス宣言
public class Human {
    //フィールドの宣言
    private String name;
    private int age;

    //コンストラクタ　オーバーロード：同じ戻り値とメソッド名でシグネチャが異なるメソッドを定義
    // 逆のデクストラクタはあるが、自動破棄（保持はものによる）されるので、設定することはない。
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human (Human human){
        this.name = human.name;
        this.age = human.age;
    }

    //アクセサ（ゲッター）
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //アクセサ（セッター）必須ではない
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toStringメソッド　出力の型
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
package basic.human1;
classが書かれてないのは、他から参照できる、同一のパッケージからしかアクセスできない。
publicを付けると参照できなくなる。他から干渉されない。カプセル化。
フィールド、メソッド（処理の単位）、修飾子、戻り値の型、

String name, int age：この部分をシグネチャと言います。

getName()：名前をリターンするメソッド
get:読み書きするメソッド,ゲッター、（）は引数はないということ

public void setName(String name) {
        this.name = name;
        必須ではありません、この名前は○○と返るという意味
 void：戻り値なしという意味

 参照型にするために、　下記追加しています。

 public Human (Human human){
        this.name = human.name;
        this.age = human.age;
    }
    もとの要素が優先されますよ、参照にしても変化しない





 */
