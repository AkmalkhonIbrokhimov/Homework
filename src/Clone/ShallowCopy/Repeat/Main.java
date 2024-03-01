package Clone.ShallowCopy.Repeat;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Sanjar",21);
        Person person1 = person; //Reference copy;
        Person person2 = new Person(person);//Constructor copy
        Person person3 = (Person) person.clone();// Shellow copy

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}
