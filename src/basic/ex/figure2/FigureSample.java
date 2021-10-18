package basic.ex.figure2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureSample {
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
