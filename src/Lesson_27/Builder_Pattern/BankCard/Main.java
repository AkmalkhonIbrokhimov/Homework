package Lesson_27.Builder_Pattern.BankCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardDirector cardDirector = new CardDirector();
        ConcreatCardBuilder cardBuilder = new ConcreatCardBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biz da 4 turdagi kartalar mavjud. Oz tanlovingizni kiriting" );
        System.out.println("1)HUMO 2)UZCARD 3)VIZA 4)MASTER:" );
        int choice = scanner.nextInt();
        switch (choice){
            case 1->{
                System.out.println("Ismingizni kiriting:");
                String nameUser = scanner.next();
                cardDirector.creatHumo(cardBuilder,nameUser);

            }case 2->{
                System.out.println("Ismingizni kiriting:");
                String nameUser = scanner.next();
                cardDirector.creatUzcard(cardBuilder,nameUser);

            }case 3->{
                System.out.println("Ismingizni kiriting:");
                String nameUser = scanner.next();
                cardDirector.creatVisa(cardBuilder,nameUser);

            }case 4->{
                System.out.println("Ismingizni kiriting:");
                String nameUser = scanner.next();
                cardDirector.creatMaster(cardBuilder,nameUser);

            }default->{
                System.out.println("Bunday karta turi mavjud emas");


            }
        }

        System.out.println(cardBuilder.build());

    }
}
