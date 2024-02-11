package UzumBankEnter.DataTransferObject;

import java.util.Objects;

public  class User  {
    private UserBase userBase;
    private String phoneNumber;
    private int userCardNumber;
    private String cardDate;
    private String parol;


    public User(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(UserBase userBase) {
        this.userBase = userBase;
    }

    public User(int userCardNumber, String cardDate) {
        this.userCardNumber = userCardNumber;
        this.cardDate = cardDate;
    }

    public User(String phoneNumber, String parol) {
        this.phoneNumber = phoneNumber;
        this.parol = parol;
    }


    public UserBase getUserBase() {
        return userBase;
    }
    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }
    public void setUserBase(UserBase userBase) {
        this.userBase = userBase;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserCardNumber() {
        return userCardNumber;
    }

    public void setUserCardNumber(int userCardNumber) {
        this.userCardNumber = userCardNumber;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userBase=" + userBase +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userCardNumber=" + userCardNumber +
                ", cardDate='" + cardDate + '\'' +
                ", parol='" + parol + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getUserCardNumber() == user.getUserCardNumber() && Objects.equals(getUserBase(), user.getUserBase()) && Objects.equals(getPhoneNumber(), user.getPhoneNumber()) && Objects.equals(getCardDate(), user.getCardDate()) && Objects.equals(getParol(), user.getParol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserBase(), getPhoneNumber(), getUserCardNumber(), getCardDate(), getParol());
    }
}
