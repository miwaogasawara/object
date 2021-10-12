package basic.human4;
//  抽象クラス
abstract class Human {
    protected  String name;
//コンストラクト フィールドやメソッドの記述（抽象メソッドを含む）
    public Human(String name) {
        this.name = name;
    }
//   アクセス修飾子abstract 戻り値の型 メソッド名（引数）；
//    }
    public abstract void sayHello();
    //publicなしでもOK
}

/*
Humanを抽象クラスに変更します
abstract class Human {
abstract 先頭に抽象クラスを定義
protected  String name;
protectedを先頭にString　nameを宣言
public abstract void sayHello()

　（抽象クラスの流れ）
    抽象クラスの宣言
    アクセス修飾子 abstract class クラス名 {
    フィールドやメソッドの記述（抽象メソッドを含む）
    アクセス修飾子abstract 戻り値の型 メソッド名（引数）；
    }
    例
    abstract class Figure {
    //抽象メソッド
    //戻り値とメソッド名と引数を定義
    abstract double getArea();
    }
    これにより継承したサブクラスは抽象メソッドのオーバーライドをしなければいけません。
    class Rectangle extends Figure {
    中略
    /**
    * 面積を求める getArea()
    * @return double 図形の面積
    public double getArea() {
    return height * width;
    }
    }
 */



