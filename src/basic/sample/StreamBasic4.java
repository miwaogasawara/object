package basic.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ListやMAPに対して効率よく処理を行う
public class StreamBasic4 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Murata");
        list.add("Okada");
        list.add("Tanimoto");
        list.add("Nakagawa");

        Map<Integer,List<String>>map = new HashMap<>();
        list.forEach(name->{
            Integer namelen = name.length();

            List<String>valueList = map.get(namelen);

            if (valueList == null){
                valueList = new ArrayList<>();
                map.put(namelen,valueList);
            }
            valueList.add(name);
        });
        System.out.println(map);//{5=[Okada], 6=[Murata], 8=[Tanimoto, Nakagawa]}

    }
}

/*
後で追加する予定
  list.removeIf(s -> s.length() <= 5);//removeIf~ trueを返す要素を削除..5文字以下は削除
        list.forEach(System.out::println);//Murata  Tanimoto

 */
