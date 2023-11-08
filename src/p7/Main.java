package p7;



public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("ss676nj", 50000);
        System.out.println(client1.getId());
        Client client2 = new Client(1234, 50000 );
        String clId = client2.getId();
        System.out.println(clId);
    }
}
