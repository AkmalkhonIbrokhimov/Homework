package LessonEleven.TasksOFAbstractions.Task3;

public abstract class Computer {
private String processesModel;
private String diskSize;

    public Computer(String processesModel, String diskSize) {
        this.processesModel = processesModel;
        this.diskSize = diskSize;
    }

    abstract void showInfo();

    public String getProcessesModel() {
        return processesModel;
    }

    public String getDiskSize() {
        return diskSize;
    }
}
