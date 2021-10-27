package basic.ex.person2;

public enum  Birthplace {
    HOKKAIDO("北海道"),
    TOKYO("東京都"),
    OSAKA("大阪府"),
    FUKUOKA("福岡県"),
    AOMORI("青森県"),
    AKITA("秋田県"),
    IWATE("岩手県"),
    OKINAWA("沖縄県");



    private String name;

    Birthplace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
/*

 */
