package basic.sample;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Arrays;
//参照先　https://www.sejuku.net/blog/19673
//文字列のフォーマット出力
public class StringSample2 {
    public static void main(String[] args)throws InterruptedException, UnsupportedEncodingException {
        //デフォルトの文字コードを調べる
        System.out.println(System.getProperty("file.encoding"));//UTF-8

      int number = 13;
      String parameter = "apples";
      //MessageFormatについて
      String message = MessageFormat.format("I have{1} {0}.",parameter,number);
        System.out.println(message);//I have13 apples.
        String message2 = MessageFormat.format("I have{0} {1}.",number,parameter);
        System.out.println(message2);//I have13 apples.//I have13 apples.

        //文字コードを変換する
        char c = 'あ';
        System.out.println((int) c);//12354

        //javaの文字コードから任意の文字コードへ変換する　Stringクラス-getByte
        String str = "あいうえお";
        byte[]def = str.getBytes();//デフォルト
        byte[] utf8 = str.getBytes("UTF-8");
        byte[] utf16 = str.getBytes("UTF-16");
        byte[] uft32 = str.getBytes("UtF-32");
        byte[]  ms932 = str.getBytes("MS932");

        System.out.println(Arrays.toString(def));
        System.out.println(Arrays.toString(utf8));
        System.out.println(Arrays.toString(utf16));
        System.out.println(Arrays.toString(uft32));
        System.out.println(Arrays.toString(ms932));//結果下記参照


        //文字を文字コードに変換後再び文字に変換する 例外対応：try-catch
        try {
            String str1 = "あ";

            byte[] bytes1 = str1.getBytes("UTF-16");
            byte[] bytes2 = str1.getBytes("UTF-8");
            byte[] bytes3 = str1.getBytes("SJIS");

            System.out.println(Arrays.toString(bytes1));//[-2, -1, 48, 66]
            System.out.println(Arrays.toString(bytes2));//[-29, -127, -126]
            System.out.println(Arrays.toString(bytes3));//[-126, -96]

            String newStr1 = new String(bytes1, "UTF-16");//
            String newStr2 = new String(bytes2, "UTF-8");//
            String newStr3 = new String(bytes3, "SJIS");//

            System.out.println(newStr1);//あ
            System.out.println(newStr2);//あ
            System.out.println(newStr3);//あ

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


    }

    /*
  結果
I have13 apples.
I have13 apples.
12354
[-29, -127, -126, -29, -127, -124, -29, -127, -122, -29, -127, -120, -29, -127, -118]
[-29, -127, -126, -29, -127, -124, -29, -127, -122, -29, -127, -120, -29, -127, -118]
[-2, -1, 48, 66, 48, 68, 48, 70, 48, 72, 48, 74]
[0, 0, 48, 66, 0, 0, 48, 68, 0, 0, 48, 70, 0, 0, 48, 72, 0, 0, 48, 74]
[-126, -96, -126, -94, -126, -92, -126, -90, -126, -88]
[-2, -1, 48, 66]
[-29, -127, -126]
[-126, -96]
あ
あ
あ











     */


