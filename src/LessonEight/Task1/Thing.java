package LessonEight.Task1;

public class Thing {
    private String thingName;
    private int thingSize;
   public Thing( String thingName, int thingSize){
        this.thingName = thingName;
        this.thingSize = thingSize;
    }

    public String getThingName() {
        return thingName;
    }

    public int getThingSize() {
        return thingSize;
    }
}
