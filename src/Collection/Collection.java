package Collection;

/*
 *TODO Javada collection bu obyektlar guruhini saqlash va boshqarishni ta’minlovchi java
 *  frameworki bo’lib. U List, Set, Map va Queue kabi har xil turdagi maʼlumotlar
 * tuzilmalarini boshqarish uchun yagona interfeys.
 * Collection ozidan 19 method taqdim etilgan
 *
 *
 *
 * */


import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        collection.add(55); // Bu metod collection ga (to'plamga) element(ob'ekt) qo'shish uchun ishlatiladi. Agar element collection ga (to'plamga) qo'shilsa true bo'lmasa false return bo'ladi.
//        collection.addAll();//Bu metod collection ga (to'plamga) boshqa bir collection ni (to'plamni) qo'shish uchun ishlatiladi. Agar elementlar collection ga (to'plamga) qo'shilsa true bo'lmasa false return bo'ladi.
//        collection.remove();//Bu metod collection dan element ni (ob'ektni) o'chirib yuborish uchun ishlatiladi. Agar element o'chirilsa true bo'lmasa false return bo'ladi.
//        collection.removeAll();//Bu metod collection dan boshqa bir collection ni (ob'ektlar to'plamini) o'chirib yuborish uchun ishlatiladi. Agar elementlarning kamida bittasi o'chirilsa true bo'lmasa false return qiladi.
//        collection.removeIf();//Bu metod berilgan Predicate (shart) ga mos keladigan elementlarni collection dan o'chirib yuborish uchun ishlatiladi. Agar collection dan elementlardan kamida bittasi o'chirilsa true bo'lmasa false return qiladi.
//        collection.retainAll();//retain - saqlab qolish deb tarjima qilinadi. Bu metod Collection (to'plam) dagi elementlar orasida c to'plamida bor bo'lganiga tegmaydi va bo'lmaganini o'chirib tashlaydi. Ya'ni c to'plamida yo'q bo'lgan elementlanri o'chirib tashlaydi.
//        collection.size();//Collection (to'plam) dagi bor bo'lgan elementlar sonini return qiladi.
//        collection.clear();//Collection (to'plam) dagi barcha elemetnlanri o'chirib yuboradi.
//        collection.contains();//Berilgan element Collection (to'plam) da bormi yo'qmi shuni aniqlaydi. Agar bo'lsa true bo'lmasa false return qiladi.
//        collection.containsAll();//Berilgan c to'plami, Collection (to'plam) da bormi yo'qmi shuni aniqlaydi. Agar c dagi barcha lementlar collection (to'plam) da bo'lsa true bo'lmasa false return qiladi.
//        collection.iterator();//Collection (to'plam) ni Iterator ob'ektiga o'rab return qiladi. Bu Iterator collection ni for-each loop da aylantirish uchun ishlatiladi.
//        collection.toArray();//Collection (to'plam) ni array ga o'girib return qiladi. Ya'ni collection dagi elementlarni arrayga joylab shu arrayni return qiladi. return qilinayotgan array ning tipi Object tipda bo'ladi.
//        collection.isEmpty();//Collection (to'plam) bo'shmi yoki bo'sh emasligini tekshiradi. Agar bo'sh bo'lsa true bo'lmasa false return qiladi.
//        collection.stream();//Collection (to'plam) ni sequential (ketma-ket) Stream ko'rinishini return qiladi.
//        collection.parallelStream();//Collection (to'plam) ni parallel Stream ko'rinishini return qiladi.



    }
}
