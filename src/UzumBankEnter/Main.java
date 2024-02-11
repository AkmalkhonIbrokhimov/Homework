package UzumBankEnter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DbBank dbBank = DbBank.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Telefon raqam kiriting!");
        String phoneNumber = scanner.nextLine();
        dbBank.checkUser(phoneNumber);
    }
}
