package Lesson_6;

import java.util.Scanner;

public class DayInfo {
    String day;
    DayInfo(String day){
        this.day = day;
    }
    private  void show(String massage){
        System.out.println(massage);
    }
    void getSeason(){
        Scanner scanner = new Scanner(System.in);
        String getDate = scanner.nextLine();
        System.out.println(getDate.substring(0,2));
        switch(getDate.substring(3,5)){
            case "12","01","02"->show("Winter");
            case "03","04","05"->show("Spring");
            case "06","07","08"->show("Summer");
            case "09","10","11"->show("Autumn");
            default -> show("You add not correct date");
        }
    }
    boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
   String nextDay() {
       Scanner scanner = new Scanner(System.in);
       String getDate = scanner.nextLine();
       String newDay = "";
       String newMonth = "";
       String newYear = "";
       int maxDay = 0;
       switch (getDate.substring(3, 5)) {
           case "04", "06", "09", "11" -> maxDay = 30;
           case "01", "03", "05", "07", "08", "10", "12" -> maxDay = 31;
           case "02" -> {
               if (isLeapYear(Integer.parseInt(getDate.substring(6)) + 1)) {
                   maxDay = 29;
               } else {
                   maxDay = 28;
               }
           }

           default -> show("You add not correct date");
       }
       if (Integer.parseInt(getDate.substring(0, 2)) == maxDay) {
           newDay = "01";
           if (Integer.parseInt(getDate.substring(3, 5)) != 12) {
               newMonth = String.valueOf(Integer.parseInt(getDate.substring(3, 5)) + 1);
               newYear = getDate.substring(6);
           } else if (Integer.parseInt(getDate.substring(3, 5)) == 12) {
               newMonth = "01";
               newYear = String.valueOf(Integer.parseInt(getDate.substring(6)) + 1);
           }
       } else {
           newDay = String.valueOf(Integer.parseInt(getDate.substring(0, 2)) + 1);
           newMonth = getDate.substring(3, 5);
           newYear = getDate.substring(6);

       }
       String newDate = newDay+"/"+newMonth+"/"+newYear;
       show(newDate);
       return newDate;
   }

}
