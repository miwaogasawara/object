package basic.sample;

import basic.student.Student;
//
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//中間操作で成績を出力
public class StudentStream {
    private String name;
    private int score;

    public StudentStream(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentStream{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        List<StudentStream>studentStreams = new ArrayList<>();
        studentStreams.add(new StudentStream("Ken",100));
        studentStreams.add(new StudentStream("Shin",60));
        studentStreams.add(new StudentStream("Takuya",80));

        Stream<Integer>stream = studentStreams.stream()
                .map(s -> s.getScore());
        stream.forEach(System.out::println);


    }
}
/*

結果
100
60
80

 */
