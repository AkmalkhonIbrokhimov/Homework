package UzumBankEnter.DataTransferObject;
/*
*nomer
* cod activasiya
* parol ornatish
* parol ornatish ilovaga kirish
* carta bolsa
* */

import java.util.Objects;

public  class UserBase {
    private String name;
    private String SureName;
    private String phoneNumber;
    private String pasport;


    public UserBase(String name, String sureName, String phoneNumber, String pasport) {
        this.name = name;
        SureName = sureName;
        this.phoneNumber = phoneNumber;
        this.pasport = pasport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return SureName;
    }

    public void setSureName(String sureName) {
        SureName = sureName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    @Override
    public String toString() {
        return "UserBase{" +
                "name='" + name + '\'' +
                ", SureName='" + SureName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pasport='" + pasport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserBase userBase)) return false;
        return Objects.equals(getName(), userBase.getName()) && Objects.equals(getSureName(), userBase.getSureName()) && Objects.equals(getPhoneNumber(), userBase.getPhoneNumber()) && Objects.equals(getPasport(), userBase.getPasport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSureName(), getPhoneNumber(), getPasport());
    }
}
