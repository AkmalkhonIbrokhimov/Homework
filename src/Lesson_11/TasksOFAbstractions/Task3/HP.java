package Lesson_11.TasksOFAbstractions.Task3;

public class HP extends Computer{
    public HP(String processesModel, String diskSize) {
        super(processesModel, diskSize);
    }

    @Override
     void showInfo() {
        System.out.println("progresses model " + getProcessesModel());
        System.out.println("Size disc" + getDiskSize());
    }
}
