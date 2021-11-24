package basic.sample;

import javax.swing.text.html.parser.Entity;
import java.util.concurrent.atomic.AtomicInteger;

public class CallByValueSample {

    public static void main(String[] args) {
        //操作しても値が変わらないイミュータブルなクラス（ 教科書P394Integer,String,Date and Time APIなど）
        String text1 = "This is an apple.";
        String text2 = text1.replace("apple","orange");
        System.out.println("元のオブジェクト"+text1);//元のオブジェクトThis is an apple.
        System.out.println("戻り値        "+text2);//戻り値        This is an orange.

        //操作すると値が変わるミュータブルなクラス：StringBuilder 　教科書P296
        //呼び出して操作した場合呼び出し元の値も変化するので注意
        StringBuilder text = new StringBuilder("This is");
        System.out.println("操作前"+text);//操作前This is
        text.append(" an apple.");
        System.out.println(""+text);//This is an apple.

        //操作すると値が変わるミュータブルなクラス： AtomicInteger　教科書P296
        //呼び出して操作した場合呼び出し元の値も変化するので注意
        AtomicInteger number = new AtomicInteger(1);
        System.out.println("操作前："+number);//操作前：1
        number.incrementAndGet();
        System.out.println("操作後："+number);//操作後：2


        //プリミティブ型の値渡し：教科書P292
        int value = 1;
        callByValue(value);
        System.out.println("呼び出し元"+value);//呼び出し元1:呼び出し先でで値を変更しても呼び出し元の値に影響しない
    }
    public static void callByValue(int value){
        value++;
        System.out.println("呼び出し先"+value);//呼び出し先2
    }


    }


