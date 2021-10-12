package basic.human4;

class English extends Human{

    public English(String name) {
        super(name);

    }
    //共通のもの　必ず記載
    @Override//say入力で自動出力
    public void sayHello() {
        System.out.println("Hello" + name);
    }

    }


