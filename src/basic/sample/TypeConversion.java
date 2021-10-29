package basic.sample;
//型変換の見本
public class TypeConversion {
    public static void main(String[] args) {
        //数値→文字に変更する
        double d1 = 20.0;
        String str = String.valueOf(d1);
        System.out.println(d1);//20.0

        //文字→数値 に変更する
        String number ="12.34";
        double d2 = Double.parseDouble(number);//
        Double d3 = Double.valueOf(number);
        System.out.println(d2);//12.34
        System.out.println(d3);//12.34
    }
    }
/*
重要
  //文字→数値 に変更する！！
        String number ="12.34";
        double d2 = Double.parseDouble(number);
        Double d3 = Double.valueOf(number);
   結果
   　20.0
    12.34
    12.34
 */
