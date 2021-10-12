package basic.human4;

class Chinese extends Human {
     public Chinese(String name) {
         super(name);//Human(name)と同じ、スーパークラスのコンストラクタを呼び出す
     }
    //共通のもの　必ず記載
     @Override
     public void sayHello() {
         System.out.println("你好" + name);


     }
 }

