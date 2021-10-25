package basic.sample.eqlals;

import java.util.Objects;

//従業員
 class Employee {
     private int id;
     private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override//サブクラスを許容しない
    public boolean equals(Object o) {
        if (this == o) return true;//同じオブジェクトなので確実に同一
        if (o == null || getClass() != o.getClass()) return false;//nullあるいはクラスが等しくない時はfalse
        Employee employee = (Employee) o;//オブジェクトが異なる、
        return id == employee.id && Objects.equals(name, employee.name);//
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
/*
教科書P86
オブジェクトの等価性
参照先
https://pointsandlines.jp/server-side/java/equals

（定義）
同一である
　同じインスタンスである。（参照が同じ）
同値(等価)である
　異なるインスタンスだが同じ値を持っている。

「同一である」を判定するには == 演算子を用いて比較する。
一方、「同値(等価)である」つまりオブジェクトが持つ値が等しいかどうかの判定には
equalsメソッドを用いて比較をする。
自作したオブジェクトクラスの同値性を判定したい場合、
equalsメソッドをそのクラスでオーバーライドする必要がある。

※equalsメソッドをオーバーライド実装した場合、合わせて
hashCodeメソッドも定義しなければいけません。

構文例
public class Person {
	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
    //Objectクラスのequalsメソッドをこのクラス内で再定義する。
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person other = (Person) obj;
			//変数ageと変数nameが等しければtrueを返す。(同じ値を持っているとみなす)
			return other.name.equals(this.name) && other.age == this.age;
		}
		return false;
	}
　　（解説）
    12行目
    instanceof演算子でObject型で渡ってきたオブジェクトと
    このクラスとの互換性をチェックする。
    ※同じクラス型、もしくはサブクラスかどうか。
    13行目
    互換性が確認出来たら、値をチェックするオブジェクトをこのクラスの型にキャストする。
    15行目
    同値である事の条件を定義する。
    それぞれのオブジェクトの変数ageと変数nameを比較している。
 */
