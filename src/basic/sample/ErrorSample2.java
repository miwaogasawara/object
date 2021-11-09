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

        }catch (IOException e){
            System.out.println("例外が発生しました");
        }
    }
}
  /*
    結果：catch文内の処理が実行されています

    例外が発生しました

     */