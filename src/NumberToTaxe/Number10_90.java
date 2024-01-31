package NumberToTaxe;

public enum Number10_90 {
    ON(1,"o'n"), YIGIRMA(2,"yigirma"), OTTIZ(3,"o'ttiz"), QIRIQ(4,"qiriq"), ELLIK(5,"ellik"), OLTMISH(6,"oltmish"), YETMISH(7,"yetmish"), SAKOSN(8,"sakson"), TOQSON(9,"toqson"),YUZ(10,"yuz");
   private int number;
   private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    Number10_90(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
