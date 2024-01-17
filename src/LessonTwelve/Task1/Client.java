package LessonTwelve.Task1;

public class Client {
    private int oneCallPrice;
    private int oneSmsPrice;
    private  int clientAccount;
    public Client(int oneCallPrice, int oneSmsPrice) {
        this.oneCallPrice = oneCallPrice;
        this.oneSmsPrice = oneSmsPrice;
    }

    public void addSum(int sum){
            clientAccount+=sum;
    }
    public boolean isActive(){
        if(clientAccount >= oneCallPrice || clientAccount >= oneSmsPrice){
            return true;
        }
        return false;
    }
    public boolean call(int timeOfTalking){
        if(timeOfTalking*oneCallPrice <= clientAccount){
            return true;
        }
        return false;
    }
    public boolean sms(int timeOfTalking){
        if(timeOfTalking*oneSmsPrice <= clientAccount){
            return true;
        }
        return false;
    }
}
