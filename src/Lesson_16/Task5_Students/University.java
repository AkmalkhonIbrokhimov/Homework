package Lesson_16.Task5_Students;

public class University {
    private String name;
    private  String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

     class  Student{
        private String firstname;
        private  String lastName;

        public Student(String firstname, String lastName, int course) {
            this.firstname = firstname;
            this.lastName = lastName;
            this.course = course;
        }

        private  int course;
        public  void  showInfo(){
            System.out.println("Student " + firstname + "  " +
                    lastName+ " Study in " + name + " and  he is " +
                    course + "st course." + name +  " is located in " + location);
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastName() {
            return lastName;
        }

        public int getCourse() {
            return course;
        }
    }


    Student student = new Student("Azizbek", "Rahimjanov",1);

}
