package basic.student;

public class Student {
    private String name;
    private  String gender;
    private int age;

    public Student(String name, String jender, int age) {
        this.name = name;
        this.gender = jender;
        this.age = age;
    }

    public Student(String いのうえ, String 女, int age, int i, int i1) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJender() {
        return gender;
    }

    public void setJender(String jender) {
        this.gender = jender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", jender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
