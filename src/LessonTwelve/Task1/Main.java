package LessonTwelve.Task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(10,15);
        client.addSum(50);
        System.out.println(client.isActive());
        System.out.println(client.call(3));
        System.out.println(client.sms(5));
    }


}
