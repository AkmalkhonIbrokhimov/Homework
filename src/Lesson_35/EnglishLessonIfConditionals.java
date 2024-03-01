package Lesson_35;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EnglishLessonIfConditionals {
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\Acer\\Desktop", "IF_Conditionals.docx");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("If I am eating 'pelof', I am enjoying\n");
            writer.write("he is feeling worse himself if he is watching horror movies\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
