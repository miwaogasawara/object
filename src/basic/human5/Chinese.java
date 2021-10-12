package basic.human5;

//中国人クラス
class Chinese implements IfSayHello{
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字是" + name + "。");
    }
}

