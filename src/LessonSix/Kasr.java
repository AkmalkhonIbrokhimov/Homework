package LessonSix;

public class Kasr {
    int surat;
    int maxraj;
    Kasr(){

    }
    Kasr(int surat, int maxraj){
        this.maxraj = maxraj;
        this.surat = surat;
    }
    boolean isShortFraction(){
        boolean is = false;
        for (int i = 2; i <= surat; i++) {
            if( surat % i == 0 && maxraj % i == 0){
                System.out.println("Yes shoerten " + i);
                is=true;
            }

        }
        return is;
    }
    Kasr pow(Kasr kasr, int degree){
        int isSurat = 1;
        int isMaxraj = 1;
        for (int i = 0; i <=degree ; i++) {
            isSurat *= kasr.surat;
            isMaxraj *=kasr.maxraj;
        }

        return new Kasr(isSurat, isMaxraj);
    }
}
