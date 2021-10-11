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
