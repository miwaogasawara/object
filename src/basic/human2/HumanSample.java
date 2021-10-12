package basic.human2;

//フィールドがプライベートではないときの違い
public class HumanSample {
    public static void main(String[] args) {
        Human human21 = new Human("Tom",28);

        //フィールドに直接アクセスできてしまう
        System.out.println(human21.name);
        System.out.println(human21.age);
        human21.name = "Jack";//Tom がJackに上書きされる感じ
        human21.age = 35;//28歳が35歳に上書きされる感じ
        System.out.println(human21.name);
        System.out.println(human21.age);

        //Human2クラスはカプセル化できていない
    }
}
/*
結果
Tom
28
Jack
35



 */