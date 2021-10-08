package basic.human1;
//参照型のサンプル
public class ReferenceSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",28);
        Human human2 = human1;
        Human human3 = new Human((human1));

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        human1.setName("john");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

    }

}
/*
Cp上のデータのデータ入力なので、この場合ｈ1もｈ2も同一人物になってしまう。
シャローコピーと言います。
 Human human2 = human1;
 同じになった
  System.out.println(human1);
        System.out.println(human2);
どちらもTOMになりました。

 Human human3 = new Human((human1));
    新しい器を作る
    ｈ3はTOMになった

 */
