package dz8;

public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("999-999-999","Samsung S55", 100.123);
        phone.receiveCall("Misha");
        phone.info();
        //phone.receiveCall();
        phone.infoD();
    }
}