package p2;

public class Main {
    public static  void main(String[] args){
  //  Client client = new Client(1, 50000); // создаем клиента
        Client<Integer> client = new Client<>(1, 5000);
    int clientId = (int)client.getId(); // приведение типов
        System.out.println(clientId);

   //     Client client1 = new Client("ss676nj", 50000);
        Client<String> client1 = new Client("ss676nj", 50000);
        System.out.println(client1.getId());

      /*  Client client2 = new Client("1234", 50000 );
        int clId = (int)client2.getId(); //будет ошибка Exception in thread "main" java.lang нельзя к примитивным типам приводить
        System.out.println(clId); // надо использовать джинерики */
        Client<String> client2 = new Client("1234", 50000 );
        String clId = client2.getId();
        System.out.println(clId);
    }
}
