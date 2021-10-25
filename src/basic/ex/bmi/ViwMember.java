package basic.ex.bmi;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViwMember {
     public static void main(String[] args) {
         List<Member>memberList = new ArrayList<>();
         memberList.addAll(Arrays.asList(
               new Member("あいざわ", Gender.MEN,25,1.70,70.0),
               new Member("あいざわ", Gender.WOMEN,20,1.60,50.5),
               new Member("あいざわ", Gender.MEN,29,1.80,88.0),
               new Member("あいざわ", Gender.WOMEN,19,1.72,66.5),
               new Member("あいざわ", Gender.MEN,30,1.66,65.0),
               new Member("あいざわ", Gender.WOMEN,32,1.55,42.5)
         ));
         for (Member member:memberList){
             System.out.println(member);
         }
     }
}

/*
結果
あいざわ 男 25 1.70m 70.00kg BMI:24.22 標準:63.58kg,判定：普通
あいざわ 女 20 1.60m 50.50kg BMI:19.73 標準:56.32kg,判定：普通
あいざわ 男 29 1.80m 88.00kg BMI:27.16 標準:71.28kg,判定：肥満(1度)
あいざわ 女 19 1.72m 66.50kg BMI:22.48 標準:65.08kg,判定：普通
あいざわ 男 30 1.66m 65.00kg BMI:23.59 標準:60.62kg,判定：普通
あいざわ 女 32 1.55m 42.50kg BMI:17.69 標準:52.86kg,判定：低体重

 */
