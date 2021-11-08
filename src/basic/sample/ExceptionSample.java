package basic.sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

//例外処理
//public class ExceptionSample {
    //ファイル読み込み処理　throwsがあると必ず例外に対して何らかの処理を行うという意味です
    //try-catchなどの例外処理構文がないとコンパイルエラーになります。
    //public List<String>readFile()throws IOException{
       // try {

          //  is = Files.newInputStream(path);
          //  is.red(contents)

       // }catch (SomException ex){

        //}finally {

      //  }
  //  };


    /*
       1. 例外処理（複数を同時に処理する
        try {
        ...任意の処理...
        } catch (HogeException |
        FooBarException |
        PicoException e) {
        e.printStackTrace();
        }

        2.例外の有無にかかわらす、処理する　finally
        try {
        tstatements
        } catch(exclazz ex) {
        cstatements
        } finally {
        fstatements
        }

            例文
            package com.example.mynavi.exception;

                import java.io.FileNotFoundException;
                import java.io.FileReader;
                    import java.io.IOException;

                    public class ExFinally {
                    public static void main(String[] args) {
                     FileReader reader = null;
                    try {
                     reader = new FileReader("C:/data.txt");
                     } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                    try {
                    if (reader != null) {
                     reader.close();
                     }
                     } catch (IOException e) {
                     e.printStackTrace();
                  }
                }
            }
            }
            3.例外をスローする – throw命令

                public void sample() throws HogeException {
                    throw new HogeException();
                }
                try {
                 TrySample t = new TrySample();
                t.sample();
                 } catch (HogeException e) {
                 e.printStackTrace();
                 }
                    例外	概要
                    NullPointerException	        オブジェクトがnullである
                    IndexOutOfBoundsException	    インデックスが範囲外
                    UnsupportedOperationException	要求された操作が未サポート
                    IllegalArgumentException	    メソッドに渡されたパラメーターが不正である
                    ArithmeticException	            計算で例外的な条件が発生





     */



