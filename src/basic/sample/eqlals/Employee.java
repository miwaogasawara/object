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

    @Override
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


 */
