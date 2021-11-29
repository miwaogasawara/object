package basic.ex.inventry;
//PC情報
public class PersonalComputer {
    String userName;
    int pcNo;
    int storageNo;
    int memory;
    String bit;
    String OS;

    public PersonalComputer(String userName, int pcNo, int storageNo, int memory, String bit, String OS) {
        this.userName = userName;
        this.pcNo = pcNo;
        this.storageNo = storageNo;
        this.memory = memory;
        this.bit = bit;
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

    public int getMemory() {
        return memory;
    }

    public String getBit() {
        return bit;
    }

    public String getOS() {
        return OS;
    }

}
