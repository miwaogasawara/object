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
        if(file.exists()){//existsメソッド：存在を見る
            System.out.println("ファイルが存在します。");
        }else{
            System.out.println("ファイルが存在しません。");
        } //ファイルが存在します。

        //事例2：ファイル書き込み操作：FileWriterクラス
        FileWriter filewriter = null;
        try {
            filewriter = new FileWriter("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample.txt");
        } catch (IOException e) {
            e.printStackTrace();//printStackTrace:実行したメソッドの時系列の一覧
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(filewriter));//※参照
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
            inCh = new FileInputStream(fileIn).getChannel();//※2参照
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
       // Path p = Paths.get("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt");..削除できないようにコメントアウトしてます

       // try{
           // Files.delete(p);
       // }catch(IOException e){
           // System.out.println(e);
        //}//サンプル作成した"/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt"が削除されました

        //事例6：ファイルを作成する...教科書242..再度作成できないのでコメントアウトしています
        //Path path = Paths.get("/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt");
        //try {
          //  Files.createFile(path);

     //   }catch (FileAlreadyExistsException ex){　　//※3
        //    System.out.println(ex);
      //  }catch (IOException ex){
        //    System.out.println(ex);
        }//"java.nio.file.NoSuchFileException: \Users\user.DESKTOP-B1EO9TJ\Desktop\javasample3.txt"できた！！

    }




/*
C:/Users/user.DESKTOP-B1EO9TJ/Desktop（サンプルデスクトップファイル）

C:/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample.txt（サンプルメモテキスト1）コピー元
C:/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample2.txt（サンプルメモテキスト2）コピー先
C:/Users/user.DESKTOP-B1EO9TJ/Desktop/javasample3.txt（サンプルメモテキスト3）..削除と作成

「バイナリファイル」って単語が出てきたら「メモ帳で編集できないファイル」ってこと
※1
バッファリング処理とは、書き込み時であればデータを一旦メモリー（バッファ）に蓄積し、いっぱいになったところで
ファイルに出力することを言います。読み込み時であればバッファにまとめてデータを読み込み、いっぱいになったところで
データを処理します。いずれの場合もデータをまとめて処理できるので、読み書きを効率化できます。

※2
FileInputStreamクラスはファイルを読み込み、ファイルの内容を元にした処理や、新しいファイルの作成などを行うために
使います。FileInputStreamクラスを使うと、ファイルはバイトストリームで読み込まれます。文字ストリームで読み込み
たい場合はFileReaderクラスを使用してください。

※3　　FileAlreadyExistsException
ファイルまたはディレクトリの作成を試みたときにその名前のファイルがすでに存在している場合にスローされるチェック例外です。

 */