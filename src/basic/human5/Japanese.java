package basic.human5;

//日本人クラス
class Japanese implements IfSayHello {
    private String name;

    public Japanese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}