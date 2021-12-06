package basic.ex.file;


import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Temp1 {
    public static void main(String[] args){
        question1();
    }
    public static void question1() {
        String first = "./src/basic/ex/file";//テキストを作る場所
        String fileName = "temp.txt";//テキスト名
        if (Files.notExists(Path.of(first, fileName))) {
            try {
                Files.createFile(Path.of(first, fileName));

            } catch (java.io.IOException e) {
                e.printStackTrace();

            }
        }
    }


}
/*
問題1fileパッケージ ex.file("./src/ex/file")に空のtemp.txtファイルを作成しなさい

 */