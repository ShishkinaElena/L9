package p2;

public class Client <T>{ //определяем класс Client обобщённо  <T> - универсальный параметр
  //  private  int id;
    private T id; // задали id как Object
    private  int sum;

    public Client(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

   /* public void setId(int id) {
        this.id = id;
    }*/

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
