package basic.human5;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        IfSayHello[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),

        };

        for (IfSayHello human:humans) {
            human.sayHello();
        }
    }
}
/*
    インターフェース練習問題
    Human 4をインターフェースに変更する
    ポイント
    抽象クラスが不要になる
    IfSayHelloの作成と定型構文の実装
    サブクラスに"implements IfSayHello"とクラス属性に追加する
    出力は配（列の形を作り定義に”IfSayHello[] humans = {”インターフェース属性とする
    for (IfSayHello human:humans) {
            human.sayHello();で最終結果を出力する


    結果
    Hello.I'm Tom.
    こんにちは、私の名前はひろしです。
    我的名字是王。
 */