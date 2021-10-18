package basic.ex.figure2;
//三角形クラス
class Triangle extends Figure {
    //フィールド
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
    /**
     * 面積を求める getArea()
     * @return double 図形の面積
     */
    public  double getArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {

        return String.format("三角形　底辺%.2f×高さ%.2f÷2　面積:%.2f",
                base,height,getArea());
    }
}
