package LessonEleven.TAskAboutText;

public class Text extends Pen {

    private StringBuilder text = new StringBuilder();

    public Text(String nameStyle, String color) {
        super(nameStyle, color);
    }

    public void add(String newText){
        this.text.append(newText);
        this.text.append(" ");
    }
    public void ShowInfo(){
        System.out.println(text);
    }
    public int count(){
        return text.toString().split("").length;
    }
    public void clear(){
         text.delete(0,text.length()-1);
    }
    public boolean removeLine(String newString){
        String newText = text.toString().replace(newString, "");
        clear();
        text.append(newText);
        return true;
    }
}
