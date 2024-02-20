package Lesson_28.SingleResposibility.Example_For_Single_responsibility_SHop;

public class Product {
    private String nameProduct;
    private double priceProduct;
    private String typeProduct;


    public Product(String nameProduct, double priceProduct, String typeProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.typeProduct = typeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }
}
