package Lesson_8.Task1;

public class Student {
    private String name;
    private int age;

   public Student(String name, int age){
       this.age = age;
       this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void  setAge(int age){
       this.age = age;
    }
}
