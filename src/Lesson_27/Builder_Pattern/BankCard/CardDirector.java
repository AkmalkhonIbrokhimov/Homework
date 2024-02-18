package Lesson_27.Builder_Pattern.BankCard;

import java.util.Random;

public class CardDirector {
    public void creatHumo(CardBuilder cardBuilder, String ownerName){
        cardBuilder.setCardType(CardBuilder.CardType.HUMO);
        cardBuilder.setCardNumber(String.valueOf(new Random().nextLong(789312798)));
        cardBuilder.setExpireDate("07/2028");
        cardBuilder.setOwnerName(ownerName);
    }
    public void creatUzcard(CardBuilder cardBuilder, String ownerNmae){
        cardBuilder.setCardType(CardBuilder.CardType.UZCARD);
        cardBuilder.setCardNumber(String.valueOf(new Random().nextLong(789312798)));
        cardBuilder.setExpireDate("07/2028");
        cardBuilder.setOwnerName(ownerNmae);
    }
    public void creatVisa(CardBuilder cardBuilder, String ownerNmae){
        cardBuilder.setCardType(CardBuilder.CardType.VIZA);
        cardBuilder.setCardNumber(String.valueOf(new Random().nextLong(789312798)));
        cardBuilder.setExpireDate("07/2028");
        cardBuilder.setOwnerName(ownerNmae);
    }
    public void creatMaster(CardBuilder cardBuilder, String ownerNmae){
        cardBuilder.setCardType(CardBuilder.CardType.MASTER);
        cardBuilder.setCardNumber(String.valueOf(new Random().nextLong(789312798)));
        cardBuilder.setExpireDate("07/2028");
        cardBuilder.setOwnerName(ownerNmae);
    }


}
