package basic.student;

 class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("小川","女",20);
        Student student2 = new Student("小森","男",30);
        Student student3 = new Student("大森","女",40);


        System.out.println(student1.getName());//ogawa
        System.out.println(student3.getAge());//40
        System.out.println(student2.getJender());//男
    }
}
