package basic.ex.file;


import java.nio.file.Files;
import java.nio.file.Path;

public class Temp3 {
        public static void main(String[] args) {
            question3();
        }
        public static void question3() {
            String first = "./src/basic/ex/file";//テキストを作る場所
            String fileName = "temp.txt";//テキスト名
            Path path = Path.of(first,fileName);//pathを定義
           if (Files.notExists(path)) {
               System.out.println("読み込み" + path + "が見つかりませんでした");
           }
               try {
                   Files.lines(path)
                           .forEach(System.out::println);

               }catch (java.io.IOException e){
                   e.printStackTrace();

               }
               }
           }
           /*
           問題3fileパッケージ ex.file("./src/ex/file")にtemp.txtファイルを読み込み内容を
           コンソールに出力しなさい。例外処理は、記述する
            */

