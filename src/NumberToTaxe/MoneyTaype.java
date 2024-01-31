package NumberToTaxe;

public enum MoneyTaype {
MILLIARD("milliard"), MILLION("million"), MING("ming"), SOM("s'om"), TIYN("tiyn");
    private String name;
    public String getName() {
        return name;
    }
    MoneyTaype(String name) {
        this.name = name;
    }
}
