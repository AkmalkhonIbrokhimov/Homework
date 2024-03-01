package Lesson_19.DB;

public class ProductPrice {
    private String productName;
    private int price;

    public ProductPrice(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
