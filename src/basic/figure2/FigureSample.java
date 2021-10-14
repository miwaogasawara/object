package basic.figure2;

//図形の面積
class FigureSample {
    public static void main(String[] args) {
        // インスタンスの作成
        basic.ex.figure2.Figure[] figures = {

                new basic.ex.figure2.Rectangle(10, 20),
                new basic.ex.figure2.Triangle(5, 10),
                new basic.ex.figure2.Circle(5)
        };
//出力
        for (basic.ex.figure2.Figure figure : figures) {
            System.out.println(figure);
//System.out.pｒint(

        }
    }


}
/*
長方形 高さ:10.00 幅:20.00 面積:200.00
三角形　底辺15.00×高さ20.00÷2　面積:150.00
円　半径10.00×半径10.00×3.14 面積:314.00

 */
