package Lesson_27.Builder_Pattern.BankCard;

public interface CardBuilder {
    enum CardType {
        HUMO, UZCARD, VIZA, MASTER
    }
    void  setCardType(CardType cardType);
    void  setCardNumber(String number);
    void  setExpireDate(String expireDate);
    void  setOwnerName(String ownerName);

}
