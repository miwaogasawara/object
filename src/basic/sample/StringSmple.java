package basic.sample;

import java.util.Arrays;

class StringSmple {
     public static void main(String[] args) {
         String word1 = "aaa";
         //文字列の結合 concat
         System.out.println(word1.concat("bbb"));//concatメソッド　aaabbb

         //文字列の分割 split
         String sentence ="1-1,いのうえ,女,80,70,50";//例：6個のセンテンスを作る
         String[]data = sentence.split(",",6);//split メソッドを作る、regexは区切り文字、limitは必要な要素が6個という意味
         System.out.println(Arrays.toString(data));//[1-1,いのうえ,女,80,70,50]６個のセンテンスが分割された

         //文字列の結合　join
         String joinWord = String.join("",data);//joinメソッド　delimiter(区切り）必要な時に付ける、最後に空白が付かないので便利
         System.out.println(joinWord);//1-1いのうえ女807050 dataがカンマがなくなり結合された

         //文字列の置換. replace
         String original = "This + is a pen." ;
         String replace = original.replace("is","at");
         System.out.println(replace);//That + at a pen. 2箇所のisが置換された

         //文字字列の検索 indexOf 検索できない場合は（-1）が返ります
         sentence = "this is a pen.";
         int index = sentence.indexOf("is");
         System.out.println(index);//2(2列目にあります）




     }
}
/*
(concatメソッド)
concatメソッドとは、Javaにおける文字列のための変数型であるString型で定義されたメソッドであり、
文字列を結合したいときに使用します。
concatメソッドの他にも文字列を結合するメソッドがあるものの、インスタンスを新たに生成するのは
concatメソッドのみです。

 */
