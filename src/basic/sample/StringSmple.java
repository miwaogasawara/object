package basic.sample;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

class StringSmple {
    public static void main(String[] args) {
        String word1 = "aaa";
        //文字列の結合 concat
        System.out.println(word1.concat("bbb"));//concatメソッド　aaabbb

        //文字列の分割 splitメソッド
        /*
        splitメソッドは、正規表現（引数regex）にマッチした位置で文字列を分割し、分割した結果を
        文字列配列として返します。引数regexに単なる文字（列）を指定した場合には、一致した位置で
        文字列を分割します。引数limitは、分割の最大数を指定します。デフォルトではすべての区切り
        文字位置で分割しますが、引数limitを指定した場合には、その値を上限に分割します。分割され
        なかった文字列は、最後の文字列にすべて含まれることになります。
        regex：区切り文字（正規表現）
        limit：最大の分割数
         */
        String sentence = "1-1,いのうえ,女,80,70,50";//例：6個のセンテンスを作る
        String[] data = sentence.split(",", 6);//split メソッドを作る、regexは区切り文字、limitは必要な要素が6個という意味
        System.out.println(Arrays.toString(data));//[1-1,いのうえ,女,80,70,50]６個のセンテンスが分割された

        //文字列の結合　joinメソッド
        /*
        joinメソッドは、指定された区切り文字で、文字列群を結合するためのメソッドです。
        引数deliが空文字列の場合、文字列はそのまま連結されます。
        deli：区切り文字
elems：連結する文字列
         */
        String joinWord = String.join("", data);//joinメソッド　delimiter(区切り）必要な時に付ける、最後に空白が付かないので便利
        System.out.println(joinWord);//1-1いのうえ女807050 dataがカンマがなくなり結合された

        //文字列の置換. replaceメソッド
        /*
         old：置換対象の文字（列）
        new：置換後の文字（列）
         */
        String original = "This + is a pen.";
        String replace = original.replace("is", "at");
        System.out.println(replace);//That + at a pen. 2箇所のisが置換された

        //文字字列の検索 indexOfメソッド 検索できない場合は（-1）が返ります
        sentence = "this is a pen.";
        int index = sentence.indexOf("is");
        System.out.println(index);//2(2列目にあります）

        //n番目の文字列を抜き出す　charAtメソッド　：先頭文字は0文字、最後の文字はlength()-1で表示。
        String str = "こんにちは、世界！";
        System.out.println(str.charAt(3));//ち （インデックス3）

        //文字が空かどうか判定する　isEmptyメソッド
        String str2 = "";
        if (str2.isEmpty()) {
            System.out.println("空です。");
        } else {
            System.out.println(str2);//空です。
        }
        //文字列が等しいかを確認する　equals/equalsIgnoreCaseメソッド
        //大文字小文字を区別せずに比較したい場合には、equalsIgnoreCaseメソッドを利用することもできます。
        String msg = "Hello!";
        System.out.println(msg.equals("hello!"));//false..小文字大文字を判別している
        System.out.println(msg.equalsIgnoreCase("hello!"));//true..小文字大文字を区別しない

        //特定範囲の文字列を比較する　regionMatchesメソッド
        /*
        文字列同士を指定された文字範囲に限定して比較します。比較開始位置をそれぞれ引数toff／ooffで、
        比較する文字数を引数lenで指定します。
        equalsメソッドと同じく、対象の文字範囲が等しい場合にはtrue、さもなければfalseを返します。
            ignore：大文字小文字を無視するか
            toff：比較される文字列の開始位置
            other：比較する文字列
            ooff：比較する文字列の開始位置
            len：比較する文字数
         */
        String str3 = "Hello World!";
        String str4= "Hi world!";
        System.out.println(str3.regionMatches(false, 6, str4, 3, 5));
        // 結果：false..大文字を無視しない、str3は6文字目のWから比較開始、str4は3文字目wから比較開始、比較文字数5文字
        System.out.println(str3.regionMatches(true, 6, str4, 3, 5));
        // 結果：true..大文字を無視する、str3は6文字目のWから比較開始、str4は3文字目wから比較開始、比較文字数5文字

        //文字列の大小を比較する  compareTo／compareToIgnoreCaseメソッド
         /*
         文字列の大小を”辞書順に比較する”には、compareToメソッドを利用します。現在の文字列オブジェクトよりも引数で指定
         した文字列があとになる場合は正数を、等しい場合は0を、前に来る場合には負数を、それぞれ返します。
         compareToメソッドは大文字／小文字を区別しますが、区別しない比較をしたい場合には、
         compareToIgnoreCaseメソッドを利用してください。
         */

        String str5 = "MNO";
        System.out.println(str5.compareTo("ABC"));   // 結果：12...ABCはMNOの前になる
        System.out.println(str5.compareTo("MNO"));   // 結果：0...同じ
        System.out.println(str5.compareTo("XYZ"));   // 結果：-11...XYZはMNOの後ろになる
        System.out.println(str5.compareToIgnoreCase("mno")); // 結果：0..大文字小文字を区別しないので同じ

        //文字列から前後の空白を除去する　　 trimメソッド
        /*
        ここで言う空白には、半角スペースだけでなく、改行文字やタブ文字も含まれます（ただし、全角スペースは含まれません）。
         */
        String str6 = "  あなた わたし かれ ";
        System.out.println(str6.trim()); //あなた わたし かれ

        //文字列が指定の接頭辞／接尾辞を持つかを判定する – startsWith／endsWithメソッド
        /*
        文字列が指定された部分文字列で始まるかどうかを判定するには、startsWithメソッドを利用します。
        指定の部分文字列で終わるかどうかを判定するならば、endsWithメソッドを使用してください。
        startsWithメソッドでは、引数offsetを指定することで、文字列の検索開始位置を指定することも可能です。
         */
        String url = "http://www.examples.com/index.php";
        System.out.println(url.startsWith("http://")); // 結果：true
        System.out.println(url.endsWith(".html")); // 結果：false

        //文字列の大文字⇔小文字を変換する – toLowerCase／toUpperCaseメソッド
        /*
        toLowerCaseメソッドは文字列に含まれる大文字を小文字に、toUpperCaseメソッドは
        小文字を大文字に変換します。シングルバイト文字だけでなく、マルチバイト文字でも変換
        の対象となります。引数localeは、変換に利用するロケール（地域情報）を表します。
        ロケールによっては大文字小文字のマッピングは異なる可能性があります。指定がない場合には、
        システムデフォルトのロケールを利用します。
         */
        String str7 = "Hello!";
        System.out.println(str7.toUpperCase());  // 結果：HELLO!..すべて大文字に！
        // デフォルトロケールを明示した場合
        System.out.println(str7.toLowerCase(Locale.getDefault()));   // 結果：hello!...すべて小文字に！

        //部分文字列を取得する – substringメソッド
        /*
        substringメソッドを利用することで、文字列のbegin+1～end文字目を抜き出すことができます。引数endを省略した場合には、
        begin+1文字目から最後の文字列の末尾までを抜き出します。
         */
        String str8 = "Good Morning Everyone.";
        System.out.println(str8.substring(5));   // 結果：Morning Everyone.**５文字から最後まで
        System.out.println(str8.substring(5, 12));   // 結果：Morning**5文字～12文字まで

        //文字列を整形する – formatメソッド
        /*
        formatメソッドを利用することで、文字列を指定された書式文字列で整形できます（※）。
        書式文字列は「%[インデックス$][フラグ][幅][.精度]型」の形式で指定します。※整形され
        た文字列をそのまま出力するならば、System.out.printfメソッドも利用できます。
        format：書式文字列
        args：書式に割り当てる値
        値は「samples」です。
        値は「samples   」です。
        値は「sa」です。
         */
        //String型　「%7s」で出力される最大文字数、「%.4s」で最小文字数を指定できます。
        String str9 = "samples";
        System.out.println(String.format("値は「%10s」です。", str9));//前空白３文字+str9=10文字
        // 結果：値は「   samples」です。
        System.out.println(String.format("値は「%-10s」です。", str9));//後ろ空白３文字+str9=10文字
        // 結果：値は「samples   」です。
        System.out.println(String.format("値は「%.2s」です。", str9));//２文字のみ表記
        // 結果：値は「sa」です。

        //浮動小数点
        double num = 1.23456;
        System.out.println(String.format("値は「%e」です。", num));//浮動小数点数形式の10進数
        // 結果：値は「1.234560e+00」です。
        System.out.println(String.format("値は「%E」です。", num));//浮動小数点数形式の10進数
        // 結果：値は「1.234560E+00」です。
        System.out.println(String.format("値は「%f」です。", num));//	10進小数点数
        // 結果：値は「1.234560」です。
        System.out.println(String.format("値は「%.3f」です。", num));//10進小数点数,小数点以下３桁
        // 結果：値は「1.235」です。

        //日付／時刻:日付／時刻を整形する「t」はそれ単体では意味がありませんので、後方に日付／時刻書式を指定
        // しなければなりません。
        Date c = new Date();
        System.out.println(String.format("%tY年 %tm月 %td日", c, c, c));
        // 結果：2021年 11月 09日
        System.out.println(String.format("%tH時 %tM分 %tS秒", c, c, c));
        // 結果：13時 49分 30秒

        //文字列を連結する – appendメソッド（StringBuffer／StringBuilderオブジェクト）
        /*
        繰り返しの文字列連結では、StringBuilder／StringBufferを優先して利用してください。
        連結された文字列は、最後にtoStringメソッドを呼び出すことで取り出せます。
        str：追加する文字列
        start：追加する文字列の開始位置
        end：追加する文字列の終了位置
         */

        StringBuilder strA = new StringBuilder("あいうえお");
        strA.append("かきくけこ");
        strA.append("さしすせそ");
        System.out.println(strA.toString());
        // 結果：あいうえおかきくけこさしすせそ


    }
}
/*
(concatメソッド)
concatメソッドとは、Javaにおける文字列のための変数型であるString型で定義されたメソッドであり、
文字列を結合したいときに使用します。
concatメソッドの他にも文字列を結合するメソッドがあるものの、インスタンスを新たに生成するのは
concatメソッドのみです。

 */
