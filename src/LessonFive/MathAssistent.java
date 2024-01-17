package LessonFive;

public class MathAssistent {
    int number;
    void show(int degree) {
        int result = 0;
        for (int i = 1; i < degree; i++) {
            number *= number;
            result = number;
        }
        System.out.println(result);
    }
    void pow(){
            int newNumber = 0;
           while (number>0){
               newNumber += number%10;
               number = number/10;
           }
            System.out.println(newNumber);
        }

    }

