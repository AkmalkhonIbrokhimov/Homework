package LessonEleven.Task4;

public class A_Class {
    private int variable;

    private A_Class() {

    }
  static   A_Class getInstace(){
        return new A_Class();
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
}
