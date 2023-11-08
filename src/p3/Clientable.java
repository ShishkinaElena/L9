package p3;

public interface Clientable<T> {  // с помощью джинерика делаем обобщённым
    T getId();
    int getSum();
    void setSum(int sum);


}
