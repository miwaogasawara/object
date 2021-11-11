package basic.sample;

 class ErrorSample {
    //例外処理（try-catch構文）:コンパイルの時点では分からなかったが、実行してから気づくエラーを例外（Exception）と呼ぶ。
    public static void main(String[] args) {
    String[]fruits = {"りんご","バナナ","みかん"};
    try {
        //例外が発生しそうな処理
        for (int i = 0; i < 4; i++) {
            System.out.println(fruits[i]);
        }
        // ArrayIndexOutOfBoundsException:  配列のインデックスが範囲外
    }catch (ArrayIndexOutOfBoundsException e){
        //例外が発生した時の処理
        System.out.println("例外が発生しました");
    }
        System.out.println("フルーツを全部表示した");

    }

}
/*
出力結果2：4回目のループで例外が発生し、catchブロック内の処理が実行されています。
          そして、プログラムが途中で終了することなく、最後の「フルーツ全部を表示した」まで出力されています。

    りんご
    バナナ
    みかん
    例外が発生しました
    フルーツを全部表示した
 */


/*　
    (Error 構文)（出力結果1）リンゴ、バナナ、みかんまで出力後エラーになった。→→→上記try-catch構文へ
　　　public static void main(String[] args) {
    String[]fruits = {"りんご","バナナ","みかん"};
            for(int i = 0; i < 4; i++) {
        System.out.println(fruits[i]);//fruits配列を一つずつ取り出すが、配列の要素外もアクセスしてみる 出力結果1

        }
        System.out.println("フルーツを全部表示した");
    　　}

(出力結果1)

りんご
バナナ
みかん
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at basic.sample.ErrorSample.main(ErrorSample.java:8)
 */
