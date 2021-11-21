package basic.sample;
//  教科書　P173　
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ListやMAPに対して効率よく処理を行う：ArrayList Map Stream
public class StreamBasic4 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Murata");
        list.add("Okada");
        list.add("Tanimoto");
        list.add("Nakagawa");

        Map<Integer,List<String>>map = new HashMap<>();//ArrayListをMapに変換（文字数・名前）
        list.forEach(name->{                //名前を出力する条件
            Integer namelen = name.length();//MApのInteger（KEY）namelen（名前文字数）と定義
            List<String>valueList = map.get(namelen);//Map List<String>は名前

            //長さに対応するListがなければ、空のListを与える（文字数が違ったら、新たなリストを作り更新する）
            if (valueList == null){
                valueList = new ArrayList<>();
                map.put(namelen,valueList);
            }
            valueList.add(name);//valueListには名前を入れる
        });
        System.out.println(map);//{5=[Okada], 6=[Murata], 8=[Tanimoto, Nakagawa]}

    }
}

/*
後で追加する予定
  list.removeIf(s -> s.length() <= 5);//removeIf~ trueを返す要素を削除..5文字以下は削除
        list.forEach(System.out::println);//Murata  Tanimoto
        参照先：https://java-beginner.com/stream-api-map/

 */
