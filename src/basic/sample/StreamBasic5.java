package basic.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//StreamBasic4をmap.computeIfAbsentを使用して書いた構文
public class StreamBasic5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sasaki");
        list.add("KImura");
        list.add("Oka");
        list.add("Nakamura");

        Map<Integer, List<String>> map = new HashMap<>();
        list.forEach(name -> {
            Integer namelen = name.length();
            List<String> valueList = map.computeIfAbsent(namelen, key -> new ArrayList<>());
            valueList.add(name);
        });
        System.out.println(map);//{3=[Oka], 6=[Sasaki, KImura], 8=[Nakamura]}


    }

    }
    /*
      ～computeIfAbsentの動き(keyがない時だけ引数を与えた関数の結果をMapに設定する）～
      List<String> valueList = map.computeIfAbsent(namelen, key -> new ArrayList<>());

      Mapに指定のKey(namelen)が存在するかを確認する
        1.存在する場合は値要素(List)を取得する
        2.存在しない場合は新規にArrayListインスタンスを作成し、取得する
        3.取得したList要素に対して、引数で渡されたオブジェクト(name)を追加する
          2番のListをMapにputする

          //map.computeIfPresent(keyがあるときだけ引数に与えた結果をMAPに設定する
       　　 Map<String,String>map ;
       　　 String[]keys = new String[]{"a","c","d"};
       　　 for (String key :keys){
       　　　　//存在する要素の先頭に★を付ける
            map.computeIfPresent(key,(k,s)->"★"+s);
            System.out.println(map1);
        }

     */

