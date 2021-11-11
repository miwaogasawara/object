package basic.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
//例外処理②　try-catch
//参照先：https://qiita.com/morioheisei/items/d25d2b67e7530c1aab9d
class ErrorSample2 {
    public static void main(String[] args) {

        //try-catchの例外処理を記述した場合
        try {
            //ファイルのパスを指定する
            File file = new File("aaaaaaaa.text");//存在しないテキストファイル

            //ファイルへの中身を１行取得する
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();

            //ループを回して１行ずつ表示していく
            while (str != null) {
                System.out.println(str);
            }
            //最後にファイルを閉じてリソースを開始する
            bufferedReader.close();
        //IOException:なんらかの入出力例外の発生を通知するシグナルを発生させます。
            // このクラスは、入出力処理の失敗、または割り込みの発生によって生成される例外の汎用クラスです。
        }catch (IOException e){
            System.out.println("例外が発生しました");
        }
    }
}
  /*
    結果：catch文内の処理が実行され、存在しないファイルを検索したため下記結果になりました。

    例外が発生しました

     */
/*
（メモ）
    // os は以下のブロックを抜ける時に必ず閉じられる
    try (OutputStream os = Files.newOutputStream(Paths.get("foo.txt"))) {
    // ...
    }

　　（標準的な例外）
    NullPointerException　　　　　　　参照がない値にアクセスしようとした際に発生　オブジェクトがnullである
    IllegalArgumentException：　　　　不正な引数、または不適切な引数をメソッドに渡したことを示す
    IllegalStateException：　　　　　　不正または不適切なときにメソッドが呼び出され時に発生
    AssertionError：　　　　　　　　　　プログラムが予期しない動作を実行していることを示しています。


    IndexOutOfBoundsException	    インデックスが範囲外
    UnsupportedOperationException	要求された操作が未サポート
    ArithmeticException	            計算で例外的な条件が発生


 */