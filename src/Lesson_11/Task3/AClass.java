package Lesson_11.Task3;

import java.util.Objects;

public abstract class AClass {


    public abstract int getAge();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AClass aClass)) return false;
        return getAge() == aClass.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }
}
