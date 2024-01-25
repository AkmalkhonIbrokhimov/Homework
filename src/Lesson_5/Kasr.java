package Lesson_5;

public class Kasr {
    int surat;
    int maxraj;

    void showInfo(){
        System.out.println(this.surat/maxraj);
    }

    void addTwoKasr(String a, String b) {
        String[] asurat = a.split("\\/");
        String[] bsurat = b.split("\\/");
        int newSurat = 0;
        int newMaxraj = 0;
        if (asurat[1].equals(bsurat[1])) {
            newSurat = Integer.parseInt(asurat[0]) * Integer.parseInt(bsurat[1]) + Integer.parseInt(asurat[1]) * Integer.parseInt(bsurat[0]);
            newMaxraj = Integer.parseInt(asurat[1]);
        } else {
             newSurat = Integer.parseInt(asurat[0]) * Integer.parseInt(bsurat[1]) + Integer.parseInt(asurat[1]) * Integer.parseInt(bsurat[0]);
             newMaxraj = Integer.parseInt(asurat[1]) * Integer.parseInt(bsurat[1]);
        }
        System.out.println(newSurat+"/"+newMaxraj);
    }
    void  multiplayTwoKasr(String  a,String  b){
        int aSurat = Integer.parseInt(a.substring(0,a.indexOf("/")));
        int aMaxraj = Integer.parseInt(a.substring(a.indexOf("/")+1));
        int bSurat = Integer.parseInt(b.substring(0,b.indexOf("/")));
        int bMaxraj = Integer.parseInt(b.substring(b.indexOf("/")+1));
        System.out.println(aSurat*bSurat + "/" + aMaxraj*bMaxraj);
    }
    void deviseonTwoKasr(String  a,String  b){
        int aSurat = Integer.parseInt(a.substring(0,a.indexOf("/")));
        int aMaxraj = Integer.parseInt(a.substring(a.indexOf("/")+1));
        int bSurat = Integer.parseInt(b.substring(0,b.indexOf("/")));
        int bMaxraj = Integer.parseInt(b.substring(b.indexOf("/")+1));
        System.out.println(aSurat*bMaxraj + "/" + aMaxraj*bSurat);
    }
}
