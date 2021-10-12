package basic.human4;

//実行プログラム
class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成　サブクラスの変数を格納することができる
        Human[] humans = {
                new Japanese("ひろし"),
                new Chinese("王"),
                new English("john"),

        };

        for (Human human:humans) {
            human.sayHello();
        }

    }
}
/*
結果
こんにちはひろし
你好王
Hellojohn
 */