package LessonSix;

public class PhoneStorage {
int Storage;
int BusyPart;
    PhoneStorage(int storage,int busyPart){
    this.Storage = storage;
    this.BusyPart = busyPart;
    }
    int getEmptyStorage(){
        return this.Storage-this.BusyPart;
    }
    void addMusic(int musicSize){

        if (this.BusyPart < this.Storage){
            this.BusyPart +=musicSize;
        }else{

            System.out.println("You cannot add music Becose You don't have enough storage");
        }
    }
    boolean addMusics(int musicSize, int count){
        for (int i = 1; i <= count; i++) {
            if (this.BusyPart < this.Storage){
                this.BusyPart +=musicSize;
            }else{
                System.out.println("You cannot add music Becose You don't have enough storage");
                break;
            }

        }
        return this.BusyPart>this.Storage;
    }

}
