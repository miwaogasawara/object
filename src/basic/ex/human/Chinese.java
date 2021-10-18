package basic.ex.human;

import basic.human5.IfSayHello;

//中国人クラス
class Chinese implements IfSayHello {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("我的名字是" + name + "。");
    }
}

