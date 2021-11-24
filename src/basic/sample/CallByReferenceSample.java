package basic.sample;
//参照型値渡し：教科書P293
public class CallByReferenceSample {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.value = 1;
        callByReference(entity);
        System.out.println("呼び出し元"+entity.value);//呼び出し元2
    }
    public static  void callByReference(Entity entity){
        entity.value++;
        System.out.println("呼び出し先"+entity.value);//呼び出し先2
}

    }


/*
参照型の場合は、オブジェクトそのものではなく、オブジェクトの「参照」を表す値を渡す。
そのため、呼び出し先のメソッドで行った変更が、呼び出し元に反映される。
参照型の値渡しであっても、呼び出し元の値が変わるのは引数のオブジェクトに対する操作を
した場合です。引数に別の値（参照）を代入した場合は、元の値は変わりません。

引数に別の値（参照）を代入した構文
 public static void callByReference(Entity entity){
        entity = new Entity();
        entity.value =2;
        System.out.println("呼び出し先2"+entity.value);
        }
 */
