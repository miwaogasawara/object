package basic.ex.person;

import basic.sample.enumsample.Gender;


//
class Person {
    private String name;
    private Gender gender;
    private int age;

    //
    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    //男性の平均
    // public double ave() {
    //return sum() / 2.0;
    //}

    //女性の平均
    //public double ave() {

    // return sum() / 3.0;
    // }

    //toString
    @Override
    public String toString() {
        return String.format("%s %s %d", name, gender.getJpName(), age);
    }

   // @Override//implements Comparable<Student>をクラスに追加しないとオーバーライドしません、
   // public int compareTo(Person o) {
    //    return age - o.age;//


   // }
}
/*
implements Comparable<Person>
 */