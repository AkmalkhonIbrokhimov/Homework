package Lesson_30;

public class Exception extends Throwable {
    /*Exception bu dastur ishlash jaroyonida kutilmagan hodisa bunda Exception(istisno) royberdi.
     * Biror bir methodda hatolik yuzbersa u bizga Exeption beradi, yani exeptiondan obyect yaratiladi va
     * u ozida Exception-turi,uni tafsiloti, xatolik yuzbergan class va qatorni va u xatolok yana qayerda
     * kelishini o'zidda saqlaydi.
     * */
    /*
     * Exception lar ikkiga bolinadi Errors va exceptions. Ular Throwable dan extends kilgan, throwable esa
     * Objectdan ular hammsi java.lang packages saqlanadi/
     * Throwable - otish(допустимо,бросаемыйц) mumkin deb tarjima qilinadi. Yani Istisno sifatida
     * ishlatish mumkin degani.
     *
     * Error - xatolik deb tarjima qilinadi.
     * Exception - istisno deb tarjima qilinadi.
     * Error
     *
     * Error - bu JVM ishlab turgan sistemaga aloqador  bo'lgan xatoliklar xisoblanadi.
     *
     * Sodir bo'lgan Error larni code orqali tuzatib bo'lmaydi.
     * Yani Error lar tuzatilmaydigan xatoliklar. (Error is irrecoverable).
     * Shu sababdan code orqali umuman Error lar ushlanmaydi.
     * Xarqanday Error ni JVM o'zi ushlab olib u haqida malumotlarni konsolga chiqaradi.
     * Error larga namuna :
     * OutOfMemoryError - JVM ishlashi uchun yetarlicha xotira (RAM) bo'lmaganida sodir bo'ladi. Yani Java Heap
     *  da joy (xotira) qolmaganida shunday xatolik bo'ladi.
     * VirtualMachineError - JVM ni ishlatadigan qaysidir resource lari topilmaganda shunday xatolik bo'ladi.
     * AssertionError - Javada taqqoslash jarayonida sodir bo'ladigan xatolik.
     * StackOverflowError - Stack da yetarlicha xotira bo'lmagan xollarda sodir bo'ladi. Stack RAM dagi xotida
     * bo'lib u xar bir Thread uchun aloxida yaratailadi. Stack xotirasida chaqirilgan metodlar, metodlarda
     * yaratilgan local primitive o'zgaruvchilar va ob'ekt tipdagi o'zgaruvchilar bo'ladi.
     * Bu ro'yhatni uzoq davom ettirish mumkin. Error larni yod olaman deb kalla qo'ymang. Tepadagi 4tasini
     * nima uchun sodir bo'lishini bilangzi bo'ldi. Maboda ishlash jarayonida Error bo'lib qolsa Google amakidan
     * so'rab bilib olasiz. Hozir sizning vazifangiz Error nima ekanligini bilish
     *
     *Exception
     *
    * Exception - bu yozilgan kodlar (dastur) ishga tushganidan keyin sodir bo'ladigan istisno.
    *
    * Exception larni kodlar yordamida ushlab olib to'girlash (tuzatish) mumkin.
    * Yani Exception lar bular tuzatiladigan istisnolar dir.
    * Dehqonchasiga aytsam Exception sodir bo'lsa uni ushlab olib tuzatish yoki uni o'rniga boshqa kodlarni ishlatish mumkin.
    * Exception lar asosan dasturchi yozgan kodlar dan kelib chiqadi.
    * Demak Exception sodir bo'lishi asosan dasturchi kalla qo'yishi ekan.
    * Kod yozish davomida faqat Exception larni ushlash lozim. Yani dasturchilar kod davomida Exception class
    * larini ishlatishadi. Error lar bilan ishlanmaydi.
    * Exception classidan nasil olgan class lar juda ko'p. Ular Checked va Unchecked turlariga (kategoriyaga, toifaga) bo'linadi.
    * Bular haqida keyingi maqolada gaplashamiz. Hozircha it is enough.
     *
     */

    public static void main(String[] args) {
       /* System.out.println("message exception:"+ Runtime.getRuntime().maxMemory()); // error
        int[] arr = new int[1000*1000*1000*1000];*/
        /*int b=1;
        int a=0;            //exception
        System.out.println(b/a);*/
        ba();
        try{
            ab();
        } catch ( ArithmeticException arithmeticException){
            System.out.println(arithmeticException);
        }finally {
            System.out.println("finish");
        }

    }
       static void ab(){
        int c = 1;
        int b = 0;
            System.out.println(c/b);
        }
        static void ba(){
        int c = 1;
        int b = 2;
            System.out.println(c/b);
        }
}
