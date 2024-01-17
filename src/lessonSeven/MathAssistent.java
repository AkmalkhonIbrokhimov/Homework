package lessonSeven;

public class MathAssistent {
    int min(int a, int b){
        int min=0;

        if(a>b){
            min = b;
        }else {
            min = a;
        }
        return min;
    }
    int min(int a, int b, int c){
        int min = 0;
        if(a < b && a < c){
            min = a;
        } else if (c < a && c < b) {
            min = c;
        }else if (b < c && b < a) {
           min = b;
        }
       return min;
    }
    int min(int[] mass){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]<min){
                min = mass[i];
            }
        }
        return min;
    }
    int swap(int a,int b){
        a = a - b;
        b = a + b;
        a = b-a;

        return a*10+b;
    }

}
