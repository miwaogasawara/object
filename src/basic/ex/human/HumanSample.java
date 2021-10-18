package basic.ex.human;

import basic.human5.IfSayHello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HumanSample {
    public static void main(String[] args) {


    List<IfSayHello> humans = new ArrayList<>();
    humans.addAll(Arrays.asList(
            new English("Tom"),
            new Japanese("ひろし"),
            new Chinese("王")
            ));

    for (IfSayHello human:humans ){
        human.sayHello();
    }

    }

    }


/*



 */