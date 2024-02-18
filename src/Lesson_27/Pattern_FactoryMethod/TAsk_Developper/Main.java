package Lesson_27.Pattern_FactoryMethod.TAsk_Developper;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
   static DeveloperFactory creatDveloperBySpecialty(String specialty){

        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactoryCreator();
        } else if (specialty.equalsIgnoreCase("kotlin")) {
            return  new KotlinDeveloperFactoryCreate();
        }else {
            throw  new RuntimeException(specialty+" is unknown specilty");
        }

    }
    public static void main(String[] args) {
        Consumer<String> listner = System.out::println;
        listner.accept("Dasturlash tilini kiriting: ");
        Scanner scanner = new Scanner(System.in);
        String speciality = scanner.next();


    DeveloperFactory  developerFactory = creatDveloperBySpecialty(speciality);
    Developer developer = developerFactory.createDevelopper();
    developer.writecode();
    }
}
