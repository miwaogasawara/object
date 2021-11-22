package basic.sample;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

//参照先（テキストの有無の確認・テキストへの書き込み）：https://www.sejuku.net/blog/20527
//参照先（テキスト内容のコピーと貼り付け）：https://www.sejuku.net/blog/20689
public class FileSample {
    public static void main(String[] args) {
        // 事例1：ファイルを指定する..デスクトップのPDFファイルでテスト：ファイルの存在確認
        File file = new File("/Users/user.DESKTOP-B1EO9TJ/Desktop");

        // ファイルの存在確認
        if(file.exists()){
            System.out.println("ファイルが存在します。");
        }else{
            System.out.println("ファイルが存在しません。");
        } //ファイルが存在します。

        //事例2：ファイル書き込み操作
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(filewriter));
        //ファイルに書き込む
        pw.println("apple");
        pw.println("orange");
        pw.println("melon");

        //ファイルを閉じる
        pw.close();
        //apple orange melon とUsers/user.DESKTOP-B1EO9TJ/Desktop/javasample.txtに書き込まれた


        //事例3：ファイルの更新日時を取得する
        File file1 = new File("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample.txt");

        //フォーマットを指定する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        //ファイルの更新日時を取得する
        Long update = file1.lastModified();

        //指定したフォーマットで書式を整形する
        String updateStr = sdf.format(update);

        System.out.println("更新日：" + updateStr);//更新日：2021/11/22 12:40:36

        //事例4：ファイルの内容を読み取り他のファイルにコピーする：java.nio.FileChannelクラスを使用してコピーする
        File fileIn = new File("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample.txt");
        File fileOut = new File("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample2.txt");

        // FileChannelクラスのオブジェクトを生成する
        @SuppressWarnings("resource")
        FileChannel inCh = null;
        try {
            inCh = new FileInputStream(fileIn).getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        @SuppressWarnings("resource")
        FileChannel outCh = null;
        try {
            outCh = new FileOutputStream(fileOut).getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //transferToメソッドを使用してファイルをコピーする
        try {
            inCh.transferTo(0, inCh.size(), outCh);
        } catch (IOException e) {
            e.printStackTrace();
        }//apple  orange melon  :サンプルメモテキスト1の内容がサンプルメモテキスト2へコピーされました。

        //事例5：ファイルの削除:参照先：https://www.javadrive.jp/start/file/index6.html
        Path p = Paths.get("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt");

        try{
            Files.delete(p);
        }catch(IOException e){
            System.out.println(e);
        }//サンプル作成した"/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt"が削除されました

        //事例6：ファイルを作成する...教科書242
        Path path = Paths.get("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt");
        try {
            Files.createFile(path);

        }catch (FileAlreadyExistsException ex){
            System.out.println(ex);
        }catch (IOException ex){
            System.out.println(ex);
        }//"java.nio.file.NoSuchFileException: \Users\user.DESKTOP-B1EO9TJ\Desktop\javasample3.txt"できた！！

    }

    }


/*
C:/Users/user.DESKTOP-B1EO9TJ/Desktop（サンプルデスクトップファイル）

C:/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample.txt（サンプルメモテキスト1）コピー元
C:/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample2.txt（サンプルメモテキスト2）コピー先
C:/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt（サンプルメモテキスト3）..削除と作成

 */