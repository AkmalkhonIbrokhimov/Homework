package Lesson_25;

import java.util.Collection;

public interface MyList<E>  {
    boolean add(int index, E element);
     boolean add(E e);
     boolean addAll(Collection<? extends E> c);
     boolean addAll(int index, Collection<? extends E> c);
     void clear();
     boolean contains(E e);
     boolean containsAll(Collection<?> c);
     E get(int index);
     int indexOf(E e);
     boolean isEmpty();

     boolean remove(E e);
     boolean removeAll(Collection<?> c);
     boolean retainAll(Collection<?> c);
     E set(int index, E element);
     int size();

     E[] toArray();
     <T> T[] toArray(T[] a);
}
