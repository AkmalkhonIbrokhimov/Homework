package Lesson_27.Builder_Pattern.BankCard;

public class ConcreatCardBuilder implements CardBuilder{
   /* private Card card;


    @Override
    public void setCardType(CardBuilder.CardType cardType) {
        this.setCardType(cardType);
    }

    @Override
    public void setCardNumber(String number) {
        this.card.setCardNumber(number);
    }

    @Override
    public void setExpireDate(String expireDate) {
        this.card.setCardExpireDate(expireDate);
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.card.setCardOwnerName(ownerName);
    }

    public Card build() {
        return  new Card(this.card.getCardType(),this.card.getCardNumber(),this.card.getCardExpireDate(), this.card.getCardOwnerName());

    }*/
    private CardBuilder.CardType cardType;
    private String cardNumber;
    private String cardExpireDate;
    private String cardOwnerName;
    @Override
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public void setCardNumber(String number) {
         this.cardNumber = number;
    }

    @Override
    public void setExpireDate(String expireDate) {
        this.cardExpireDate = expireDate;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.cardOwnerName = ownerName;
    }
    public Card build(){
        return new Card(cardType,cardNumber,cardExpireDate,cardOwnerName);
    }
}
