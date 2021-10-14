package basic.ex.figure2;

class Rectangle extends Figure {
   //フィールド
    private  double height;
    private  double widht;
//コンストラクタ
    public Rectangle(double height, double widht) {
        this.height = height;
        this.widht = widht;
    }
//ゲッター
  public double getHeight() {
        return height;
    }


    public double getWidht() {
        return widht;
    }


    /**
     * 面積を求める getArea()
     * @return double 図形の面積
     */
    public  double getArea() {
        return height * widht;
    }

    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format("長方形 高さ:%.2f 幅:%.2f 面積:%.2f",
                height,widht,getArea());

    }
}
 /*
 "長方形 高さ:%.2f 幅:%.2f 面積:%.2f"
 ％.2ｆ　変数を小数点第２位で出力　フォーマット指定です

 文字列...s
 整数・・ｄ
 小数点。・・ｆ


  */
