package UzumBankEnter;

import Lesson_25.MyArrayList;
import UzumBankEnter.DataTransferObject.User;
import UzumBankEnter.DataTransferObject.UserBase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;

public class DbBank {
    private static  DbBank  instace = null;
    private  final Scanner scanner = new Scanner(System.in);
    private final Consumer<String> listener =System.out::println;
    private ArrayList<User> usersData = new ArrayList<>();
    private  final LoginSignFunction<Sing,String> signListner = (sign,phoneNumber)->{
        switch (sign){
            case IN ->{
                String password = scanner.next();
                Login(phoneNumber,password);
            }
            case UP -> {
                listener.accept("Ilova xafsizligi uchun parol kiriting!");
                String password = scanner.next();
                controlPassword(password,phoneNumber);

            }
            case EXTRA -> {
            }
        }
    };

    private void controlPassword(String password,String phoneNumber) {
        listener.accept("Parolni tasdiqlang");
        String passwordControl =scanner.next();
            if(passwordControl.equals(password)){
                registration(password, phoneNumber);
            }else {
                System.out.println("Parol tasiqlanmadi, qaetadan urinb koring");
                signListner.notifiy(Sing.UP,phoneNumber);
            }
    }

    private void registration(String password, String phoneNumber) {
        usersData.add(new User(phoneNumber,password));
        listener.accept("Siz ro'yxatdan o'tdingiz!");
        listener.accept("Kirish uchun password kiriting!");
        signListner.notifiy(Sing.IN,phoneNumber);
    }

    private void Login(String phoneNumber, String password) {
        for (User usersDatum : usersData) {
            if(usersDatum.getPhoneNumber().equals(phoneNumber) && usersDatum.getParol().equals(password)){
                listener.accept("Uzum Bank ga Xush kelibsiz. Siz  ko'rganimizdan xursandmiz!");
                controlDate(phoneNumber);
            }else {
                listener.accept("Parol xato kiritildi! Qaytadan urinb koring");
                signListner.notifiy(Sing.IN,phoneNumber);
            }

        }
    }

    private void controlDate(String phoneNumber) {
        for (User usersDatum : usersData) {
            if(usersDatum.getPhoneNumber() == phoneNumber){
                if(usersDatum.getUserBase()==null){
                    listener.accept("Qoshimcha malumotlarni toldirishni istaysimi");
                    listener.accept("1)Ha 2)Y'oq");
                    int info =scanner.nextInt();
                    if(info==1){
                        addInfo(phoneNumber);
                    }else {
                        listener.accept("Qoshimcha malumotlar toldirishni istsangiz sozlamaga o'ting");
                    }

                }
            }

        }

    }
    public void addInfo(String phoneNumder){
        for (User usersDatum : usersData) {
            if (usersDatum.getPhoneNumber().equals(phoneNumder))
                listener.accept("Ismingizni kiriting:");
                String name = scanner.next();
                listener.accept("Familayangizni kiriting:");
                String sureName = scanner.next();;
                listener.accept("Pasport ID raqamingizni  kiriting:");
                String pasport = scanner.next();;
                usersDatum.setUserBase(new UserBase(name,sureName,phoneNumder,pasport));
                listener.accept("Malumotlarni muvofiqaytli kirittingiz!");
        }
    }


    private DbBank(){
    }
    public static  DbBank getInstance(){
        if(instace==null){
            instace = new DbBank();
        }
        return instace;
    }

    public void checkUser(String phoneNumber){
        int confirmationСode = ThreadLocalRandom.current().nextInt(1000,10000);
        listener.accept("Sizni raqamingizga SMS kod yoborildi uni kiriting: Sms kod->"+confirmationСode);
        int sms = scanner.nextInt();
        if(sms == confirmationСode){
            if(isUserExsit(phoneNumber)){
                listener.accept("Siz royhatdan otgan siz");
                listener.accept("_______________________");
                listener.accept("Ilovoga kirish uchun Pasword kiriting");
                signListner.notifiy(Sing.IN,phoneNumber);
            } else {
                listener.accept("Siz royhatdan o'tmagansiz");
                signListner.notifiy(Sing.UP,phoneNumber);
            }
        } else {
            listener.accept("Siz notgri sms kod kiritingiz qaytadan urinib ko'ring");
            checkUser(phoneNumber);
        }

    }

    public boolean isUserExsit(String phonenumber){
        for (User userDatum : usersData) {
            return (userDatum.getPhoneNumber() == phonenumber);
        }
    return false;
    }

    public int getUserIndex(User user){
    return  usersData.indexOf(user);
    }
    public void ShowData(){
        System.out.println(usersData);
    }


}
