package Collection.List_royhat;

/*
* Oltin qoidalari deganda Collection dagi ArrayList classining boshqa classlaridan ajratib turadigan farqlari/qoidalari nazarda tutiladi. Bu qoidalari juda muhim.

TODO
    - Java dasturlash tilida ArrayList classi AbstractList
    classidan meros oladi va List interfeysini implementatsiya qiladi, shuning uchun
    uning barcha metodlaridan foydalanishi mumkin.
    - ArrayList - elementlar saqlash uchun mo’ljallangan dinamik massivdir. Unda
    oldindan o’lcham belgilanmaydi, natijada biz xohlagan paytda element qo’shishimiz
    yoki o’chirishimiz mumkin. (Based on Resizable or Growable array)
    - U dublikat elementlardan iborat bo’lishi mumkin.(Duplicates are allowed)
    - U elementlar qo’shilish tartibini saqlaydi.(Insertion order is preserved)
    - U sinxronlashmagan.Not Thread Save Ya'ni bir nechta oqim ishlatsa ro'yhat bittasida o'zgarib , boshqa bittasida o'zgarmaydi.
    - U indekslarga asoslangan, shuning uchun xohlagan indeksga murojaat qilish mumkin.
    - Null insertion is possible - Ro'yhatga Null qiymat qo'shish mumkin.
    - ArrayListda, elementlar manipulyatsiyasi LinkedListga qaraganda sekinroq bo’ladi,
    chunki arraylistdan element o’chirganda ko’p elementlar o’z o’rnini o’zgartirishi
    mumkin.
    - Sodda turdagi ma’lumotlar yordamida arraylist yaratish imkonsiz, masalan, int, char,
     boolean bilan. Buning uchun ularning alternativi hisoblangan “wrapper” classlardan
     foydalanish mumkin.
    - ArrayList yaratilganda uning dastlabki o’lchamini belgilash mumkin. Lekin bu
     o’lcham dinamik bo’lib, element qo’shganda va o’chirganda o’zgaradi.
     * Ishlatish tavsiya etilmaydi agar ko'p ishlatiladigan amallar ro'yhatga qo'shish yoki ro'yhat o'rtasidan o'chirish bo'lsa.
    Sababi element qo'shganda ArrayList ichidagi array to'lsa u yangi array yaratib malumotlarni ko'chirib o'tqazishi kerak
    Agar o'rtasidan element o'chirilsa undan keyingi elementlarni bitta oldinga surib chiqishi kerak.

 */

//    TODO ArrayList classida 3 ta konstruktor mavjud:
//      - ArrayList() - bo’sh arraylist yaratadi.
//      - ArrayList(Collection<? extends E> c) - berilgan to’plam elementlaridan iborat arraylist yaratadi.
//      - ArrayList(int capacity) - dastlabki o’lchamga ega arraylist yaratadi.

//   TODO- capasity oshisi -> capasitiy = (capasitiy*3/2)+1; ko'rinishda oshadi!
//      ArrayList ob'ekti yaratilganda boshlang'ich hajmi 10 ga teng bo'ladi. Ya'ni ArrayList dagi array ning uzunligi 10 ga teng bo'ladi.


public class ArrayList {

}
