package basic.sample.eqlals;

import java.util.Objects;
//従業員
class Employee2 {
    private int id;
    private String name;

    public Employee2(int id, String name) {
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

    @Override//サブクラスを許容する
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//　←が違うクラスが同値であるかどうか
        Employee2 employee = (Employee2) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override//P87参照　オブジェクトの保存場所はハッシュ値で決まる
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

/*


 */
