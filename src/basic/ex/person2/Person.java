package basic.ex.person2;

import basic.sample.enumsample.Gender;

class Person {
     private String name;
     private Birthplace birthplace;
     private Gender gender;
     private int age;

    public Person(String name, Birthplace birthplace, Gender gender, int age) {
        this.name = name;
        this.birthplace = birthplace;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //sum
    public int sum() {
        return age;
    }

    //ave
    public double ave() {
        return sum()/3.0;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d"
                , name,birthplace.getJpBirthPlace(), gender.getJpName(),age);
    }
}

