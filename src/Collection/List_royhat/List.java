package Collection.List_royhat;
/*TODO
*  List  bu interfacedir. U Collection interface dan extends ( nasil olgan).
*  List interface si Collection interface dan kelgan metodlardan tashqari o'zida yana bir nechta metodlarni taqdim etadi.
*  List  interface ning oltin qoidalari :
*  Dublicates allowed - ro'yhatga dublikat (dublicate) elementlar kiritish mumkin.
*  Ya'ni List ga bir xil elementlarni qayta qo'shish mumkin.
*  Insertion order preserved - ro'yhatga elementlarni qo'shish tartibi saqlanib qoladi. Ya'ni ro'yhatga birinchi qo'shilgan
*  element har doim ro'yhatda birinchi turadi.
*/

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*public class List extends Collection {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }
}*/



public class List {
    public static void main(String[] args) {
//        List interface da Collection interface dan olgan metodlardan tashqari o'zi yangi metodlarni taqdim etgan.
//        Quyida metodlarni ro'yhati va nima ish bajarishi yozilgan.

        java.util.List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//1)
        list.add(0,2);
        System.out.println(list);
        //add(index,element) -> bu collectiondan kelgan metod emas bu o'zinig metodi, etibor bering bu void hechnarssaqaytarmaydi!
        // Berilgan element ni berilgan index ga joylashtiradi. Ya'ni element ni berilgan indeksga joylashtiradi.
 //2)

        list.addAll(1,list);
        // bu ham collsectonki emas berilgan index dan boshlab qo'sadi!
        //boolean addAll(int index, Collection c);	Berilgan index dan boshlangan c to'plamni ro'yhatga qo'shadi. Ya'ni c to'plamni berilgan indeksdan boshlab ro'yhatga qo'shadi.
//3)
//        System.out.println(list.remove(1));// o'zinig metodi
//        System.out.println(list.remove(list.get(0)));// collection metodi!
//        System.out.println(list);


//4)
//        System.out.println(list.get(1));// listdan berilgan index ni return qiladi!

// 5)
//        System.out.println(list.set(1, 5));//  berilgan inddexga set qiladi elementni va ochadiganini qaytaradi!
//        System.out.println(list);

// 6)
//        System.out.println(list.indexOf(5));// berilgan element ni turgan o'rnini qaytaradi! bo'lmasa -1 qaytadi!

//7)
//        System.out.println(list.lastIndexOf(3));// berilgan elementni oxirgi uchraganini qaytaradi indexini!

//8)
//        list.addAll(list1);
//
//        java.util.List<Integer> list2 = list.subList(2,5); //  berilgan from index dan index gacha bo'lgan elementlarni qaytaradi list ko'rinishiuda!.
//        System.out.println(list2);

        /**
         * List bu interface u metodlarni realizatsiya qilmagan.
         * List interface dan implements olgan classlar bu metodlarni realizatsiya qilgan.
         * Xulosa biz List interfasei Collectiondan voris olgan shunig uchun o'zi taqdim etgan va voris olgan metodlar
         * bor! adashmang add(index,element) -> bu listning metodi collectionda yoq!, remove(index) ham shunaqa
         */
    }
}