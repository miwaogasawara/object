package basic.ex.exception;

import java.io.IOException;

public class ThrowsException {
//検査例外を投げるメソッド（下に書いてもいいです）
    static void readFile(String filepath)throws IOException{
        throw new IOException("ファイル："+ filepath+"がありません");
    }
    //呼び出し側
    public static void main(String[] args) {
        try {
            readFile("c:\\text.text");
        }catch (IOException e){
            System.out.println("ファイルの読み込むに失敗しました");
            e.printStackTrace();
        }finally {
            System.out.println("終了しました");
        }

    }

}
/*
ファイルの読み込むに失敗しました
終了しました
java.io.IOException: ファイル：c:\text.textがありません
	at basic.ex.exception.ThrowsException.readFile(ThrowsException.java:8)
	at basic.ex.exception.ThrowsException.main(ThrowsException.java:13)

	＜課題＞
	②例外をthrowする構文[例]
//検査例外を投げるメソッドvoid methodName() throws Exception {  //何らかのExceptionが発生する処理}
//呼び出し側public static void main(String[] args) {
    try{    //上記メソッド宣言時にthrows節が付いているので、呼び出し側で例外処理をする必要がある
    methodName();
    } catch (Exception e) {
       //何らかの処理;  }}
問題2-1"throw new IOException()"を実行し、必ず例外をthrowするメソッド
"readFile(String filepath)"を作成しなさい（※実際にはファイルを読み込む
必要はなく、例外を投げるだけで良い）

問題2-2"readFile(String filepath)"をメイン処理から実行し、例外発生時に
"ファイルの読み込みに失敗しました"とコンソールに表示しな
 */