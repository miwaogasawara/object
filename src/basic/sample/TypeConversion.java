package basic.sample;

public class TypeConversion {
    public static void main(String[] args) {
        //数値→文字に変更する
        double d1 = 20.0;
        String str = String.valueOf(d1);

        //文字→数値 に変更する
        String number ="12.34";
        double d2 = Double.parseDouble(number);
        Double d3 = Double.valueOf(number);
    }
    }
/*
重要
  //文字→数値 に変更する！！
        String number ="12.34";
        double d2 = Double.parseDouble(number);
        Double d3 = Double.valueOf(number);


 */
