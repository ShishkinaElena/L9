package p6;

public class Client<T, S>{ //определяем класс Client обобщённо  <T, S> - два универсальных параметра

    private T id;
    private  S sum;

    public Client(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

   /* public void setId(int id) {
        this.id = id;
    }*/

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
