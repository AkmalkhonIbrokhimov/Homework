package Lesson_27.Builder_Pattern.Homes;

public enum TypeOfHome{
        APARTMENT(50_000 ), HOUSE(700_000), COTTAGE(500_000), TOWNHOUSE(500_000), VILLA(1_000_000);
        private int price;
        TypeOfHome(int price) {
            this.price = price;
        }

    public int getPrice() {
        return price;
    }
}

