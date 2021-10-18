package basic.figure2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//図形の面積
class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        //ArrayListで宣言
        List<Figure> figures = new ArrayList<>();
        figures.addAll(Arrays.asList(
                new Rectangle(10,20),
                new Triangle(20,15),
                new Circle(10)
        ));

        //出力
        for (Figure figure:figures) {
            System.out.println(figure);
        }
    }
}

/*
長方形 高さ:10.00 幅:20.00 面積:200.00
三角形　底辺15.00×高さ20.00÷2　面積:150.00
円　半径10.00×半径10.00×3.14 面積:314.00

 */
