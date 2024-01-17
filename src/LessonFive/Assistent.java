package LessonFive;



public class Assistent {

int addTwoNumber (int a, int b){
    System.out.println(a+b);
        return 0;
}
int pow(int a, int b){
    int c=1;
    for (int i =0 ; i < b; i++) {
        c*=a;
    }
    System.out.println(c);
  return 0;
}
int abs( int a){
    if( a<0){
        a=a*(-1);
    }
    System.out.println(a);
    return 0;
}

int getWholeSection(double a){
int b =(int)a;
    System.out.println(b);
    return 0;
}

}
