package basic.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Group {
    private List<Student>students = new ArrayList<>();

    private class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }


        public void add(Student student){
            students.add(student);
        }

        public int getScoe() {
            return score;
        }

        public String getName() {
            return name;
        }
    }
    private String getName() {
        return null;
    }

    private int getScore() {
        return 0;
    }

    private void add(Student student) {
        student.add((student));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void  main(String[] args) {
        List<Group>groups = new ArrayList<>();

        Group group1 = new Group();
        group1.add(new Student("Murata",100));
        group1.add(new Student("Tanimoto",100));
        group1.add(new Student("Okada",100));
        groups.add(group1);

        Group group2 = new Group();
        group2.add(new Student("Akiba",75));
        group2.add(new Student("Hayakawa",85));
        group2.add(new Student("Sakamoto",90));
        groups.add(group2);

        Group group3 = new Group();
        group3.add(new Student("Kimura",90));
        group3.add(new Student("Hashimoto",90));
        group3.add(new Student("Ueda",90));
        groups.add(group3);

        Stream<List<Student>>mappedStream = groups.stream().map(group-> group.getStudents());
        Stream<Student>flatMapStream = groups.stream().flatMap(group -> group.getStudents().stream());

        groups.stream()
                .flatMap(group -> group.getStudents().stream())
                .sorted((s1,s2)->s2.getScoe()-s1.getScoe())
                .forEach(s -> System.out.println(s.getName() + "" + s.getScoe()));


    }


}
