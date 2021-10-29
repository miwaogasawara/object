package basic.ex.person4;

import basic.sample.enumsample.Gender;

class Person {
  private String name;
  private Gender gender;
  private int age;

 public Person(String name, Gender gender, int age) {
  this.name = name;
  this.gender = gender;
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public Gender getGender() {
  return gender;
 }

 public int getAge() {
  return age;
 }

 @Override
 public String toString() {
  return String.format("名前：%s 性別:%s 年齢：%d",name,gender.getJpName(),age);
 }
}
