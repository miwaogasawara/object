package basic.ex.file;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) {
        question2();
    }
    public static void question2() {
        String first = "./src/basic/ex/file";//テキストを作る場所
        String fileName = "temp.txt";//テキスト名
        Path path = Path.of(first,fileName);//pathを定義
        if (Files.exists(path)){//指定したパスが存在したら、
            List<String>list = Arrays.asList("あいうえお","かきくけこ");//リストを作って入力内容を作る
            try {
                Files.write(path,list);//存在したらリストに代入する


            }catch (java.io.IOException e){
                e.printStackTrace();//pathがなかったら表示　例外があった時の処理


            }
        }
    }
}
/*
問題2fileパッケージ ex.file("./src/ex/file")にtemp.txtファイルを呼び出し、
データを書き込む。例外処理は、記述する　記載内容は任意
 */