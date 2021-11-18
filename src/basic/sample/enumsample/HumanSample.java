package basic.sample.enumsample;



public class HumanSample {
    public static void main(String[] args) {
        Human[] humans = {//インスタンスを追加したので、列挙型に変更しました。
                new Human("Tom", Gender.MEN, 28),
                new Human("Ai", Gender.WOMEN, 20),//インスタンスを追加
        };
        for (Human human : humans) {
            System.out.println(human);//列挙型に変更したので　For型に変更しました。
        }
    }
}

/*
結果
Human{name='Tom', gender=MEN, age=28}

結果2
Human{name='Tom', gender=男, age=28}
Genderクラスに男性・女性の日本語表記を追加しました。

結果3　インスタンスを追加後
Human{name='Tom', gender=男, age=28}
Human{name='Ai', gender=女, age=20}

 */
