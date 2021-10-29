package basic.sample;
class SuperClass {}

interface InterFace1 {}

class SubClass1 extends SuperClass {}

class SubClass2 extends SuperClass implements InterFace1 {}

//instanceOf演算子
class InstanceOfSample {
    public static void main(String[] args) {
        //各インスタンスの作成
        SuperClass superClass = new SuperClass();
        SubClass1 subClass1 = new SubClass1();
        SubClass2 subClass2 = new SubClass2();

        System.out.println(superClass instanceof SuperClass);//true
        System.out.println(superClass instanceof SubClass1);//false
        System.out.println(superClass instanceof SubClass2);//false

        System.out.println(subClass1 instanceof SuperClass);//true
        System.out.println(subClass1 instanceof SubClass1);//true

        System.out.println(subClass2 instanceof SuperClass);//true
        System.out.println(subClass2 instanceof SubClass2);//true

        System.out.println(subClass1 instanceof InterFace1);//false
        System.out.println(subClass2 instanceof InterFace1);//true


    }
}
/*
true
false
false
true
true
true
true
false
true

 */
