package p5;

public class Main {
    public static void main(String[] args){
    Client client = new Client();
    String[] goods = {"TV", "Phone", "Oven", "Nout"};
    Integer[] integers = {1,2,3,4,5};
    client.<String>saleItem(goods); // при вызове метода надо указать тип данных, например, <String>
    client.<Integer>saleItem(integers);

    }

}
class Client{
    public <T> void  saleItem(T[] items){
        for (T item: items) {
            System.out.println(item);
        }
    }
}