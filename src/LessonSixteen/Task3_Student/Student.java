package LessonSixteen.Task3_Student;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age ;
    private final int course;


   private Student(String firstName, String lastName, int age, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public static Student getInstance(String firstName, String lastName, int age, int course){
       return new Student(firstName,lastName, age, course);
    }
    public final Student showinfo(){
       return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
