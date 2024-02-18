package Lesson_27.Builder_Pattern.BankCard;

public class Card {
private  CardBuilder.CardType cardType;
private  String cardNumber;
private  String cardExpireDate;
private  String cardOwnerName;

    public Card(CardBuilder.CardType cardType, String cardNumber, String cardExpireDate, String cardOwnerName) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpireDate = cardExpireDate;
        this.cardOwnerName = cardOwnerName;
    }

    public CardBuilder.CardType getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpireDate() {
        return cardExpireDate;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public void setCardType(CardBuilder.CardType cardType) {
        this.cardType = cardType;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpireDate(String cardExpireDate) {
        this.cardExpireDate = cardExpireDate;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardType=" + cardType +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardExpireDate='" + cardExpireDate + '\'' +
                ", cardOwnerName='" + cardOwnerName + '\'' +
                '}';
    }
}
