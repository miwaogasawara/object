package basic.sample;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正規表現サンプル
 class RegexSample {
    public static void main(String[] args) {
        //郵便番号の正規表現を定義　matches　;^[0-9]{3}-[0-9]{4}$ が郵便番号の正規表現です
        String regex = "^[0-9]{3}-[0-9]{4}$";//^(始まりという意味）　各正規表現は検索したほうがよい

        //正しい郵便番号の場合
        String zip1 = "064-0809";
        System.out.println(zip1.matches(regex));//true

        //誤った郵便番号のチェック
        String zip2 = "0000-888";
        System.out.println(zip2.matches(regex));//false
        //正規表現の定義
        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");//newは必要ない　コンストラクタがないので
        Matcher matcher = null;

        List<String>zipList = List.of("064-0809","0000-999");//List.of １０個まで作成できる

        for (String zip:zipList){
            matcher = pattern.matcher(zip);
            if(matcher.matches()) {
                System.out.println(zip+":ok");
            }else {
                System.out.println(zip+":ng");//064-0809:ok   0000-999:ng
            }
        }
    }
}
/*
結果
true
false
064-0809:ok
0000-999:ng

 */