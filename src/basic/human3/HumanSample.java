package basic.human3;
//実行プログラム
class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成　サブクラスの変数を格納することができる
        Human[] humans = {
                new Human("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),

        };

        for (Human human:humans) {
            human.sayHello();
        }

    }
}
/*
new French("Andrée")
 */