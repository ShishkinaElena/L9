package p8;

public class Ariph <T extends Number>{  //создаем обобщённый метод, класс Number верхнеуровневый класс, работает с числами
    public static <T extends Number> void del(T a){  // метод работает только с числами
        System.out.println(a);
    }
}
