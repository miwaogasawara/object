package basic.ex.inventry;
import java.util.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        //listの作成
        List<PersonalComputer> pcList = new ArrayList<>(8);//

//BIt,OSはConstants2を参照させている、Constants参照でも同じ動きでOK
        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 40000, Constants2.BIT_64, Constants2.WINDOWS_10),
                new PersonalComputer("いけだ", 2, 1, 90000, Constants2.BIT_64, Constants2.WINDOWS_11),
                new PersonalComputer("いのうえ", 3, 1, 80000, Constants2.BIT_64, Constants2.WINDOWS_11),
                new PersonalComputer("たむら", 4, 2, 120000, Constants2.BIT_32, Constants2.MAC),
                new PersonalComputer("わだ", 5, 2, 30000, Constants2.BIT_32, Constants2.WINDOWS_10),
                new PersonalComputer("くどう", 6, 2, 150000, Constants2.BIT_64, Constants2.MAC),
                new PersonalComputer("さらど", 7, 3, 40000, Constants2.BIT_32, Constants2.WINDOWS_10),
                new PersonalComputer("あいざわ", 8, 3, 70000, Constants2.BIT_32, Constants2.MAC)
        ));
        //Map
        //保管倉庫毎の在庫金額を抽出するマップを作成
        //StoragePriceMap 初期化する
        Map<Integer, ArrayList<Integer>> storagePriceMap = new HashMap<>();//ArrayListよりListで設定した方が汎用性がある
        //Key:storageNo
        //value:Price
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo();//倉庫番号を定義する
            //倉庫ナンバーが重複しないようにcontainsKey（指定したキーが Dictionary<TKey,TValue> に格納されているかどうかを判断）で抽出
            if (!storagePriceMap.containsKey(storageNo)) {//Mapの中に倉庫番号がKyeとしてはいっているいなければ①、倉庫番号があれば②へ
                storagePriceMap.put(storageNo, new ArrayList<>());//①新し倉庫番号を作る、
            }
            storagePriceMap.get(p.storageNo).add(p.getPrice());//②庫番号に金額を登録する、
        }
        //表示
        System.out.println("// storagePriceMapの中身のチェック");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("PC金額" + entry.getValue());
        }

        /*
        結果
        // storagePriceMapの中身のチェック
        倉庫番号1:
        PC金額[40000, 90000, 80000]
        倉庫番号2:
        PC金額[120000, 30000, 150000]
        倉庫番号3:
        PC金額[40000, 70000]
         */
        //storagePriceMapからさらに計算をする
        //倉庫毎のPC合計金額
        System.out.println("//倉庫ごとの合計金額");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            double sum = 0;//合計の初期化
            for (Integer i : (List<Integer>) entry.getValue()) {
                sum += i;
            }
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("合計金額" + sum + "円");
            /*
            //倉庫ごとの合計金額
                倉庫番号1:
                合計金額210000.0円
                倉庫番号2:
                合計金額300000.0円
                倉庫番号3:
                合計金額110000.0円
             */
        }
        //倉庫ごとの合計台数
        System.out.println("//倉庫ごとの合計台数");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            int cnt = ((List) entry.getValue()).size();//合計台数
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("合計台数" + cnt + "台");
            /*
            //倉庫ごとの合計台数
                倉庫番号1:
                合計台数3台
                倉庫番号2:
                合計台数3台
                倉庫番号3:
                合計台数2台
             */
        }
        //倉庫別の1台毎の平均金額
        System.out.println("//倉庫内の1台ごとの平均金額");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            int cnt = ((List) entry.getValue()).size();
            double sum = 0;//合計の初期化
            for (Integer i : (List<Integer>) entry.getValue()) {
                sum += i;
            }
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("倉庫ごとの平均金額" + sum / cnt + "円/台");
            /*
            //倉庫内の1台ごとの平均金額
            倉庫番号1:
            倉庫ごとの平均金額70000.0円/台
            倉庫番号2:
            倉庫ごとの平均金額100000.0円/台
            倉庫番号3:
            倉庫ごとの平均金額55000.0円/台
             */

        }
    }
}



/*
設定
userName	pcNo	storageNo	price	bit	    OS
やまだ	    1	    1	        40000 	64	    Windows10
いけだ	    2	    1	        90000	64  	Windows11
いのうえ      3	    1	        80000   64	    Windows11
たむら	    4	    2	        120000   32  	Mac
わだ 	    5	    2	        30000　  32	    Windows10
くどう	    6	    2	        150000	64	    Mac
さらど	    7	    3	        40000    32	    Windows10
あいざわ    	8	    3	        70000	32	    Mac

 */

