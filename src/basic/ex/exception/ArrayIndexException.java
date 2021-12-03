package basic.ex.exception;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[]num = {1,2,3};
        try{
        for (int i =0;i<=4;i++){
            System.out.println(num[i]);
        }

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("エラーが発生しました");
        }finally {
            System.out.println("終了");

        }
        //結果
        //1
        //2
        //3
        //エラーが発生しました
        //終了
        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at basic.ex.exception.ArrayIndexException.main(ArrayIndexException.java:8)

    }
}
/*
①例外処理の構文[例]
    try {
    // 例外が発生するかもしれない処理をくくる
    throw new Exception();} catch(例外タイプA) {
    // try 中で例外が発生した時に処理される} finally {
   // 例外が発生してもしなくても実行される}

問題1 一次元配列に、3つの値:1,2,3を格納する。
    for分にて、インデックスの値を0から、3まで指定して
    一次元配列のデータ値をprintlnする。
    「ArrayIndexOutOfBoundsException」が発生しないように例外処理する

 */