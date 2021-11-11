package basic.sample;
//ラムダ式構文
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSample1 {
    //フィールドの作成
    private String name;
    private int score;

    public LambdaSample1(String name, int score) {
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
        return "LambdaSample{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        List<LambdaSample1> lambdaSample1s = new ArrayList<>() ;
        lambdaSample1s.add(new LambdaSample1("Ken",100));
        lambdaSample1s.add(new LambdaSample1("Shin",60));
        lambdaSample1s.add(new LambdaSample1("Takuya",80));

        System.out.println(lambdaSample1s);//現状で表示
        //[StreamApiSample{name='Ken', score=100}, StreamApiSample{name='Shin', score=60},StreamApiSample{name='Takuya', score=80}]


        //ラムダ式でコレクションを得点昇順にソート
        Collections.sort(lambdaSample1s,(lambdaSamples11, lambdaSamples21) -> Integer.compare(lambdaSamples11.getScore(), lambdaSamples21.getScore()));
        System.out.println(lambdaSample1s);
        }
        //[LambdaSample{name='Shin', score=60}, LambdaSample{name='Takuya', score=80}, LambdaSample{name='Ken', score=100}]

    }
    /*
    省略部分	条件(ラムダ式）

    引数の型	全引数の型を省略すること
    引数の()	1単語の時のみ
    メソッドの{}	1ステートメントの時のみ
    戻り値がある場合、returnの省略とセット
    return	メソッドの{}の省略とセット

     */

