package basic.figure2;
//図形の面積
class FigureSample {
    public static void main(String[] args) {
    // インスタンスの作成
        Figure[] figures = {

            new Rectangle(10, 20),
            new Triangle(5, 10),
            new Circle(5)
        };
//出力
        for (Figure figure : figures) {
            System.out.println(figure);
//System.out.pｒint(

        }
    }
}
/*
Figure.javaで抽象クラスを作成

長方形 高さ:10.00 幅:20.00 面積:200.00
三角形　底辺10.00×高さ5.00÷2　面積:25.00
円　半径5.00×半径5.00×3.14 面積:78.50

 */
