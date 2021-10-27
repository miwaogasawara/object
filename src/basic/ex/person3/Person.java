package basic.ex.person3;

import basic.ex.person2.Birthplace;
import basic.sample.enumsample.Gender;

class Person {
    private String group;//　1-1
     private String name;
     private Gender gender;
     private Birthplace birthplace;
     private int age;
//コンストラクタ


    public Person(String group, String name, Gender gender, Birthplace birthplace, int age) {
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.birthplace = birthplace;
        this.age = age;
    }

    //getter
    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Birthplace getBirthplace() {
        return birthplace;
    }

    public int getAge() {
        return age;
    }
    //toString

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d",group,name,gender.getJpName(),birthplace.getName(),age);
    }

}




