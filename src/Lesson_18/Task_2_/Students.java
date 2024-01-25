package Lesson_18.Task_2_;

public  class Students {
    private String name;
    private String surName;
    private int age;
    private String club_1;
    private String club_2;

    public Students(String name, String surName, int age, String club_1, String club_2) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.club_1 = club_1;
        this.club_2 = club_2;
    }

    public Students(String name, String surName, int age, String club_1) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.club_1 = club_1;
    }

    public Students(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getClub_1() {
        return club_1;
    }

    public String getClub_2() {
        return club_2;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", club_1='" + club_1 + '\'' +
                ", club_2='" + club_2 + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
