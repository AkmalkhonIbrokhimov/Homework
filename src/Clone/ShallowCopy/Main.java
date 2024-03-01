package Clone.ShallowCopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person("Akmal", 22);
        Person person1 = (Person) person.clone();


    }
}
