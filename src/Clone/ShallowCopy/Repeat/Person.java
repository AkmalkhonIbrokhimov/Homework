package Clone.ShallowCopy.Repeat;

public class Person implements Cloneable{
    private String name;
    private int age;
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person (Person person){
        this.age = getAge();
        this.name = getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person)super.clone();
        person.car.clone();
        return person;
    }
}
