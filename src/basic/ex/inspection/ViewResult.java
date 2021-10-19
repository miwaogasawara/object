package basic.ex.inspection;

import basic.student.Student;

import java.util.ArrayList;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {

        List<Result> resultList = new ArrayList<>();
        resultList.add(new Result(
                "202010110910",
                "山田太郎",
                "2021-10-19T13:45:30",
                36.4,
                85,
                122,
                84
        ));

        for (Result result : resultList) {
            System.out.println(result);

        }
    }
}

/*

結果
202010110910 山田太郎　2021-10-19T13:45:30 36.4 85 122 84 96.7

 */

