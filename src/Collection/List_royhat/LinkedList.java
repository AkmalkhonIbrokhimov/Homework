package Collection.List_royhat;

/*TODO
    -Linked (bog'langan) va List (ro'yhat). Ya'ni bog'langan ro'yhat deb tarjima qilinadi. Bir
        biriga bog'langan ro'yhat deb tushunib olsak ham bo'ladi.
    -Bundan tashqari LinkedList classi o'zi qo'shimcha methodlarni taqdim etgan. Bu
        methodlar LinkedList (bir-biriga bog'langan ro'yhat) bilan ishlash uchun dir.
    -LinkedList asosida DoubleLinkedList (ikki tomonlama bir biriga bog'langan ro'yhat)
        yotibdi. Yaniy LinkedList classi malumotlarni saqlash uchun DoubleLinkedList dan foydalanadi.
     - Dublikat (o'xshash) elementlar qo'shish mumkin
     - Ro'yhatga qo'shish tartibi saqlanib qoladi. Ya'ni 1chi qo'shilgan ob'ekt har doim ro'yhatda 1chi bo'ladi. Agar uni o'zimiz o'zgartirmasak albatta.
     - Ro'yhatga Null qiymat qo'shish mumkin.
     - Oqimlar uchun havsiz emas. Ya'ni bir nechta oqim ishlatsa ro'yhat bittasida o'zgarib, boshqa bittasida o'zgarmaydi.
     - Ishlatish tavsiya etiladi agar ko'p ishlatiladigan amallar ro'yhatga qo'shish yoki ro'yhat dan o'chirish bo'lsa.
    -  Ishlatish tavsiya etilmaydi agar tez-tez qilinadigan operatsiya (amali) list (ro'yhat) dan malumotni olish bo'lsa

    TODO linkedlistda ikkihil construktor elonkilsk bo'ladi:
        birinchisi - default constructor - LinkedList();
        ikkichisi -  collection obektini kabul kiladi va  shu collection bor elementlar bilan yaratadi - LinkedList(Collection c);
        LinkedList Capasitysi 1 ga osgib boradi u yaralganda 0 teng boladi.
        LinkedList  ozidan 6 tita method qoshgan.
*/
public class LinkedList {
    public static void main(String[] args) throws InterruptedException {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(1);
        System.out.println(linkedList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        linkedList.addFirst(55);
        System.out.println(linkedList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(linkedList);
        linkedList.addLast(11);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        linkedList.getLast();
        System.out.println(linkedList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        linkedList.getFirst();
        System.out.println(linkedList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(linkedList);

    }


}
