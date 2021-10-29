package basic.sample;
// これから学びます！！

// 消費税のインターフェースクラス
public interface IfTax {
    double TAX = 0.1;
    long getTaxIncludedPrice();
}

// 　クラス作成　interface IfTaxを継承しているので、 implementsを付ける
class Item implements IfTax {
    //フィールド
    private String name;
    private int price;
    //コンストラクタ
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // 消費税込み料金のメソッド
    @Override
    public long getTaxIncludedPrice() {
        return Math.round(price * (1 + TAX));
    }
    // toStoring
    @Override
    public String toString() {
        return String.format("%s %d円（税込み） %d円（税抜き）",
                name,getTaxIncludedPrice(),price);
    }
}

//サンプル
class InterfaceSample {
    public static void main(String[] args) {
        Item item1 = new Item("とうふ",48);
        System.out.println(item1);//とうふ 53円（税込み） 48円（税抜き）
    }
}
/*
とうふ 53円（税込み） 48円（税抜き）
 */
