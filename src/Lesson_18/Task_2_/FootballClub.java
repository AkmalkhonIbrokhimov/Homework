package Lesson_18.Task_2_;

import java.util.LinkedList;
import java.util.Objects;

public abstract class FootballClub  {

    LinkedList<Students> groupOfFootballer = new LinkedList<>();



    public LinkedList getgroupOfFootballer(LinkedList<Students> students) {
        for (Students student : students) {
            if (student.getClub_1().equals("Footballer") || student.getClub_2().equals("Footballer")) {
                groupOfFootballer.add(student);
            }
        }
        return groupOfFootballer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballClub that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(groupOfFootballer, that.groupOfFootballer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), groupOfFootballer);
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "groupOfFootballer=" + groupOfFootballer +
                '}';
    }
}
