package LessonEleven.TAskAboutText;

public abstract class TextStyle extends Color {

    public String nameStyle;

    public TextStyle(String color, String nameStyle) {
        super(color);
        this.nameStyle = nameStyle;
    }

    public String getNameStyle() {
        return nameStyle;
    }
}
