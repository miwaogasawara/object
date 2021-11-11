package basic.sample;
//stream API
import java.util.ArrayList;
import java.util.List;

public class StreamApiSample {
    //フィールドの作成
    private String name;
    private  int score;
//コンストラクタの生成
    public StreamApiSample(String name, int score) {
        this.name = name;
        this.score = score;
    }
//getメソッド
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
//toStoring
    @Override
    public String toString() {
        return "StreamApiSample{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
//Arraylistの作成
        List<StreamApiSample>streamApiSamples = new ArrayList<>();
        streamApiSamples.add(new StreamApiSample("Ken",100));
        streamApiSamples.add(new StreamApiSample("Shin",60));
        streamApiSamples.add(new StreamApiSample("Takuya",80));
//streamApi
        streamApiSamples.stream()//作成：streamインスタンスを作成する
                //Stream filter(Predicate<T>):Predicateを引数に取り、条件に合致しないものを除いたStreamを返します。
                //返ってくるのもStreamなのでそのままForEachメソッドを呼び出すことができます。
                .filter(streamApiSample -> streamApiSample.getScore()>= 70)//中間操作：scoreが７０点以上人を抽出
                //void forEach(Consumer<T>):Consumerを引数に取り、要素の数だけ処理を繰り返します
                .forEach(streamApiSample -> System.out.println(streamApiSample.getName()));//終端操作：該当者の名前を表示
    }
}


/*
操作の流れ
1．作成（最初に１つ）コレクションや配列などからstreamを作る
2.中間操作（複数）StreamからStreamを作成する
3.終端操作（最後に一つ）Steamからコレクションや配列を変換したり、要素毎の処理をしたり、要素を集計したりする。

結果
Ken
Takuya

 */