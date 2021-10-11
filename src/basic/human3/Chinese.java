package basic.human3;

 class Chinese extends Human {
     public Chinese(String name) {
         super(name);//Human(name)と同じ
     }

     @Override
     public void sayHello() {
         System.out.println("你好" + name + "さん");


     }
 }

