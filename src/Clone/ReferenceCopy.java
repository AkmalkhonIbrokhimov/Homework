package Clone;

import Clone.ShallowCopy.Person;

public class ReferenceCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person("Akmal", 22);
        Person person1 = (Person) person.clone();
        Person person2 = person; //Todo referenceCopy
    }
}
