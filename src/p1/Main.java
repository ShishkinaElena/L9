package p1;

public class Main {
    public static void main(String[] args) {

     People people = new People(1, "Alex");
     People people1 = new People(1, "Alex");  // сравнить два объкта на равенство
        System.out.println(people.toString());  // метод toString() переопределяется от класса Object
        System.out.println(people.hashCode());
        System.out.println(people.equals(people1)); // сравнить два объкта одного класса
    Object o1 = new Object();
        System.out.println(people.getClass()); // вернет тип данного объекта class p1.People



    }




}
