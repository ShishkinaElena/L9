package p1;

public class People {
    private String name;
    private  int id;

    public People(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {   //Это метод
        return "People: " + name;
    }

    @Override
    public int hashCode() {
        return  5 + name.hashCode(); // например на основе имени число
    }

    @Override
    public boolean equals(Object o) {  // переоределение метода созданием конструктора на сравнение
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o; //приведение типов к объекту
        return id == people.id && name.equals(people.name);


    }
}
