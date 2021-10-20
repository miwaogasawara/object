package basic.ex.item;

import java.util.*;

class ItemSearch {
    public static void main(String[] args) {

       Map<Integer,Item>itemMap = new HashMap<>();

        itemMap.put(1,new Item(1,"消しゴム",100));
        itemMap.put(2,new Item(2,"ボールペン",120));
        itemMap.put(3,new Item(3,"コンパス",400));
        itemMap.put(4,new Item(4,"定規",200));
        itemMap.put(5,new Item(5,"ノート",140));
        itemMap.put(6,new Item(6,"付箋",480));
        itemMap.put(7,new Item(7,"えんぴつ",500));

        //一覧表示
        for (Item item:itemMap.values()) {
            System.out.println(item);
        }

        //検索処理
        int searchNo = 1;
        if (itemMap.containsKey(searchNo)) {
            System.out.println(String.format("\n商品ID%dによる検索",searchNo));
            System.out.println(itemMap.get(searchNo));
        } else {
            System.out.println(String.format("商品ID%dによる検索",searchNo));
            System.out.println("該当商品はありません");
        }
    }
}
/*
1 消しゴム 100
2 ボールペン 120
3 コンパス 400
4 定規 200
5 ノート 140
6 付箋 480
7 えんぴつ 500

商品ID1による検索
1 消しゴム 100

商品ID10による検索
該当商品がありません

Map<Integer,Item>itemMap = new HashMap<>();

　※itemとputを加えて”itemMap.put”と表示ができる

 */