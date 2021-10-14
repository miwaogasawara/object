package basic.sample.enumsample;
//列挙型サンプル
public class Human {
    private String name;
    private Gender gender;
    private  int age;

    public Human(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender.getJpName() +
                ", age=" + age +
                '}';
    }//Genderに追加したgetNameを追加しました、
}
/*
パッケージの中にインタフェースクラスを作成して、
public enum Gender {
    MEN,
    WOMEN
  と設定。
 humanクラスに private Gender gender;インターフェースクラスのGenderを設定する。



 */