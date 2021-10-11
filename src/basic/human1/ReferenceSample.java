package basic.human1;
//参照型のサンプル
public class ReferenceSample {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",28);//器の場所が保存されました。
        Human human2 = human1;//出力すると必ずhuman1と同じになります。
        Human human3 = new Human((human1));//複製で器を作りました

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
 Human human2 = human1;
この場合ｈ1もｈ2も同一人物になる。
シャローコピーと言います。

  System.out.println(human1);
        System.out.println(human2);
どちらもTOMになりました。

 Human human3 = new Human((human1));
    新しい器を作る
    ｈ3はTOMになった

    下記の８つがプリミティブ型で、それ以外は全て参照型になります。
    プリミティブ型と違い参照型には、具体的な値ではなくnewして生成
    したオブジェクトへのポインタ（メモリ上のアドレス）を参照値とし
    て代入します。ここで言うオブジェクトはインスタンスと同意です。
　　　名	分類	サイズ（bit）
　　long	整数	64
　　int	整数	32
　　short	整数	16
　　byte	整数	8
　　double	小数	64
　　float	小数	32
　　boolean	真偽	?
　　char	文字	16


　【プリミティブ型と参照型の例】

参考例1
    // プリミティブ型
　　　int i = 1;
　　　　// 参照型　アドレスを送る、現物を渡すイメージ、番地のみを指し示す
　　　int[] array = {1, 2, 3};
　　　String string = "りんご";

参考例　2
    //【A】プリミティブ型
    int intA = 1;
    int intB = intA;
    intB = 2;
    System.out.println(intA); // 1
    System.out.println(intB); // 2

    //【B】参照型
    char[] arrayA = {'A', 'B', 'C'};
    char[] arrayB = arrayA;
    arrayB[0] = 'D';
    System.out.println(arrayA[0]); // D
    System.out.println(arrayB[0]); // D

    //【C】参照型（イミュータブル）
    String stringA = "文字列";
    String stringB = stringA;
    stringB = "もじれつ";
    System.out.println(stringA); // 文字列
    System.out.println(stringB); // もじれつ


 */
