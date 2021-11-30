package basic.ex.inventry;
//PC情報
public class PersonalComputer {
    String userName;//使用者名
    int pcNo;//㍶番号
    int storageNo;//倉庫番号
    int price;//金額
    String bit;//Bit数
    String OS;//OS

    public PersonalComputer(String userName, int pcNo, int storageNo, int price, int bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.price = price;
        this.bit = String.valueOf(bit);
        this.OS = OS;
    }

    public String getUserName() {
        return userName;
    }

    public int getPcNo() {
        return pcNo;
    }

    public int getStorageNo() {
        return storageNo;
    }

    public int getPrice() {
        return price;
    }

    public String getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }

}
/*

 */
