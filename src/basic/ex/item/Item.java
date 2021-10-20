package basic.ex.item;

 class Item {
     //フィールド作成
     private int id;//商品ID
     private String name;//商品名
     private int price;//価格

     public Item(int id, String name, int price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }


     @Override
     public String toString() {
         return String.format("%d %s %d",id,name,price);

     }
 }
/*
    練習問題6
     商品情報のクラス「Item」を次の仕様で作成しなさい。
パッケージ
package ex.item;
クラス図
~Item
- id int
- name String
- price int
+ toString() String
フィールドの説明
private int id;//商品ID
private String name;//商品名
private int price;//価格
商品情報を検索できるクラス「ItemSearch」を作成しなさい。この時のデータ構造は「HashMap」を使用
すること。
課題１
　表示例のように一覧表示をしなさい。（ヒント マップの値のみを使用する）

表示例
1　消しゴム　100
2　ボールペン　120
3コンパス　400
4　定規　200
5　ノート　140
6　付箋　480
７　えんぴつ　500

課題２
　変数searchNo を作成して検索したい商品ID を設定する。
　その値でマップを検索して結果を表示しなさい。

変数searchNo の値が1 の場合の実行結果
商品ID1による検索
1　消しゴム　100

変数searchNo の値が10 の場合の実行結果
商品ID10による検索
該当商品はありません

 */