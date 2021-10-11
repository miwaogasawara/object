package basic.human3;
//継承
class Human {
    //フィールド
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello.I'm " + name);
    }
}
