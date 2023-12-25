package LessonEleven.TasksOFAbstractions.Task3;

public class Acer extends Computer{
    public Acer(String processesModel, String diskSize) {
        super(processesModel, diskSize);
    }

    @Override
    public void showInfo() {
        System.out.println("progresses model " + getProcessesModel());
        System.out.println("Size disc" + getDiskSize());

    }
}
