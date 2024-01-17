package LessonEight.Task1;

public class Box {
    private Thing thing;
    private int boxValume;
    private  int sizethingValume;
    public Box(Thing thing, int boxValume){
        this.thing = thing;
        this.boxValume = boxValume;
        this.sizethingValume += this.thing.getThingSize();
    }
   public boolean push(Thing thing){
        if(sizethingValume < this.boxValume){
            this.boxValume=this.boxValume - sizethingValume;
            this.sizethingValume += this.thing.getThingSize();
            showInfo(thing);
            return true;
        }else {
            return false;
        }
   }
    boolean isFull(){
        return this.boxValume == sizethingValume;
    }

    public void showInfo(Thing thing){
        System.out.println(thing.getThingName());
        System.out.println(thing.getThingSize());
    }
}
