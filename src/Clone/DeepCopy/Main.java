package Clone.DeepCopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person("Aklmal",22,(new Car("Car")));
        Person person1 = (Person) person.clone();
        person.getCar().setName("newCAr");
        System.out.println(person);
        System.out.println(person1);
        Person person2 = person;
    }
}
