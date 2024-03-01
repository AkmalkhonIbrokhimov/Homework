package Lesson_35;

import java.io.*;
import java.nio.CharBuffer;

public class TopicFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Acer\\Lesson_35","Test.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(file.exists());
//        System.out.println(file.mkdir());
        if(file.isFile()){
            System.out.println("is File");
        }if(file.isDirectory()){
            System.out.println("is Directory");
        }
        FileWriter fileWriter = new FileWriter(file);
        try {
            fileWriter.write("My first file str\n");
            fileWriter.write("My second file str\n");
            fileWriter.write("My threat file str\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
