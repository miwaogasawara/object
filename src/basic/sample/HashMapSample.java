package basic.sample;

import java.util.HashMap;
import java.util.Map;

class HashMapSample {
    public static void main(String[] args) {
        //宣言
        Map<String,String>map = new HashMap<>(32);//初期値16で使用状況で増やす
        //要素の追加
        map.put("apple","りんご");
        map.put("pineapple","パイナップル");
        map.put("orange","オレンジ");

        //表示
        System.out.println(map);//{orange=オレンジ, apple=りんご, pineapple=パイナップル}順番が不同です
        //要素の取得
        System.out.println( map.get("apple"));//りんご
        //キーの集合の取得
        System.out.println(map.keySet());//[orange, apple, pineapple]順番が不同です
        //値の集合の取得
        System.out.println(map.values());//[オレンジ, りんご, パイナップル]順番が不同です
        //キーと値の取得.entrySet
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":"  + entry.getValue());
        }
        //要素の削除
        System.out.println(map.remove("orange"));
        //要素の変更
        System.out.println(map.put("apple", "リンゴ"));
        //表示
        System.out.println(map);
        //キーによる検索
        String searchWord = "orange";
        if (map.containsKey(searchWord)) {
            System.out.println(map.get(searchWord));
        } else {
            System.out.println("Not find:" + searchWord);
        }
    }
}
/*
教科書にはサンプルがありません
P134
 */
