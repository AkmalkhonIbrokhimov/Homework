package LessonSixteen.Task1;

public abstract class Fruits {
    private final String name;
    private final String color;
    private  final int weight;

    public Fruits(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    final void showInfo(){
        System.out.println(getName() + " " +getColor()+" "+getWeight() );
    }

    public String getName() {        return name;    }

    public String getColor() {        return color;}

    public int getWeight() {        return weight;}

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
