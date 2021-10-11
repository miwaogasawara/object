package basic.human3;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
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