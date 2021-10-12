package basic.figure3;

public class Circle implements  IfGetArea{
    private double radius;//半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public  double getArea() {
        return (Math.pow(radius,2)) * 3.14;
//        return Math.PI*Math.pow(radius,2);//PIは円周率3.14のことです
    }

    @Override
    public String toString() {
        return String.format("円　半径%.2f×半径%.2f×3.14 面積:%.2f",
                radius,radius,getArea());
    }
}
