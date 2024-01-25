package Lesson_11.TAskAboutText;

public class Main {
    public static void main(String[] args) {

    Text text = new Text("Area","Black");
    text.add("Android");
    text.ShowInfo();
    text.add("developer");
    text.ShowInfo();
    System.out.println(text.count());
    text.removeLine("er");
    text.ShowInfo();
    text.clear();
    text.ShowInfo();


    }
}
