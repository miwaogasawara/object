package basic.ex.inventry;
import java.util.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> pcList = new ArrayList<>(8);//
        Map<PersonalComputer, List<PersonalComputer>> pcMap = new HashMap<>();

        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 128, "BIT_64", "WINDOWS_10"),
                new PersonalComputer("いけだ", 2, 1, 128, "BIT_64", "WINDOWS_11"),
                new PersonalComputer("いのうえ", 3, 1, 500, "BIT_64", "WINDOWS_11"),
                new PersonalComputer("たむら", 4, 2, 128, "BIT_32", "MAC"),
                new PersonalComputer("わだ", 5, 2, 500, "BIT_32", "WINDOWS_10"),
                new PersonalComputer("くどう", 6, 2, 256, "BIT_64", "MAC"),
                new PersonalComputer("さらど", 7, 3, 256, "BIT_32", "WINDOWS_10"),
                new PersonalComputer("あいざわ", 8, 3, 500, "BIT_32", "MAC")
        ));


    }
}
/*
userName	pcNo	storageNo	memory	bit	OS
やまだ	1	1	128	64	Windows10
いけだ	2	1	128	64	Windows11
いのうえ	3	1	500	64	Windows11
たむら	4	2	128	32	Mac
わだ 	5	2	500	32	Windows10
くどう	6	2	256	64	Mac
さらど	7	3	256	32	Windows10
あいざわ	8	3	500	32	Mac





 */

