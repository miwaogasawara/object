package basic.figure1;

//図形の面積
class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        Rectangle r1 = new Rectangle(10,20);
        Triangle t1 = new Triangle(20,15);
        Circle c1 = new Circle(10);

        //出力
        System.out.println(r1);
        System.out.println(t1);
        System.out.println(c1);
    }
}
/*
長方形 高さ:10.00 幅:20.00 面積:200.00
三角形　底辺15.00×高さ20.00÷2　面積:150.00
円　半径10.00×半径10.00×3.14 面積:314.00

 */
