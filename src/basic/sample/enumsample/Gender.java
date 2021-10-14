package basic.sample.enumsample;

public enum Gender {
    MEN("男"),
    WOMEN("女");

    private String jpName;//フィールドを追加

    Gender(String jpName) {
        this.jpName = jpName;
    }//jpNameのコンストラクトを生成

    public String getJpName() {
        return jpName;
    }//フィールド追加したので、出力のためにgetterを追加
}
