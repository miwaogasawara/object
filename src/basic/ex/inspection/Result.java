package basic.ex.inspection;
//フィールドの宣言
 class Result {
     private String id;//検査を受けた人のID
     private String name;//検査を受けた人の名前
     private String dateTime;//検査日時
     private double bt;//体温
     private int pulse;//脈拍
     private int sBp;//収縮期血圧
     private int dBp;//拡張期血圧
//コンストラクタの生成
     public Result(String id, String name, String dateTime, double bt, int pulse, int sBp, int dBp) {
         this.id = id;
         this.name = name;
         this.dateTime = dateTime;
         this.bt = bt;
         this.pulse = pulse;
         this.sBp = sBp;
         this.dBp = dBp;
     }
     // 平均血圧を求める
     public double getMBP(){
         return dBp+ (sBp-dBp)/3.0;
     }

     //表示：ID 名前 検査日時 体温 脈拍 血圧（上） 血圧（下） 平均血圧
     //202010110910 山田太郎 2021-10-19T13:45:30 36.4 85 122 84 96.7


     @Override
     public String toString() {
         return String.format("%s %s　%s %.1f %d %d %d %.1f"
                 ,id,name,dateTime,bt,pulse,sBp,dBp,getMBP());
     }
 }

 /*
表示
小数点1位までの場合の表示は”％.1f”
小数点2位までの場合の表示は”％.2f”
Stringは％ｓ
整数は％ｄ

練習問題　5

検査結果を保存するクラス「Result」をパッケージプライベートで作成する。
結果を表示するクラス「ViewResult」をパッケージプライベートで作成しなさい。

パッケージ
package basic.inspection;
クラス図
~Result　　　　　　　　//クラス名
- id String　　　　　//フィールド宣言
- name String       //フィールド宣言
- dateTime String   //フィールド宣言
- bT double         //フィールド宣言
- pulse int         //フィールド宣言
- sBP int           //フィールド宣言
- dBP int           //フィールド宣言
+ toString() String　//メソッド
+ getMBP() double    //メソッド

（クラス図の見方）

可視性	意味
 +	 public ： 全てにおいて参照可能
 -	 private ： 自クラスでのみ参照可能
 #	 protected ： 自クラス及びその派生クラスにおいて参照可能
 ~	 package ： 同パッケージ内で参照可能


フィールドの説明
private String id;//検査を受けた人のID
private String name;//検査を受けた人の名前
private String dateTime;//検査日時
private double bT;//体温
private int pulse;//脈拍
private int sBP;//収縮期血圧
private int dBP;//拡張期血圧

検査を受けた人のID
初診日＋生年月日（月日のみ） 例 202010110910
検査日時 日付T 時刻 例 2021-10-19T13:45:30
メソッドの説明
平均血圧を求めるメソッドint getMBP()
求める式 拡張期血圧＋（収縮期血圧-拡張期血圧）÷3
小数点第二位を四捨五入

表示例
ID 名前 検査日時 体温 脈拍 血圧（上） 血圧（下） 平均血圧
202010110910 山田太郎 2021-10-19T13:45:30 36.4 85 122 84 96.7
実行クラス
~ViewResult
- resultList List<Result>
+ main()
  */
