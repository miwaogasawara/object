package basic.ex.figure2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//図形の面積
class FigureSample {
    public static void main(String[] args) {
        List<basic.figure2.Figure>figures = new ArrayList<>();
        figures.addAll(Arrays.asList(
                new Rectangle(10,20),
                new Triangle(20,15),
                new basic.figure2.Circle(10)
        ));

        for (basic.figure2.Figure figure:figures){
            System.out.println(figure);
        }
    }


}
/*
Figure.javaで抽象クラスを作成

長方形 高さ:10.00 幅:20.00 面積:200.00
三角形　底辺10.00×高さ5.00÷2　面積:25.00
円　半径5.00×半径5.00×3.14 面積:78.50

 */
