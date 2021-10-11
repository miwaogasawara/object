package basic.human3;

//日本人クラス
class Japanese extends Human {

    public Japanese(String name) {
        super(name);//Human(name)と同じ
    }

    @Override//say入力で自動出力
    public void sayHello() {
        System.out.println("こんにちは" + name);
    }
}

/*
class Japanese extends Human {
extends 継承する
Human　クラス名
 */