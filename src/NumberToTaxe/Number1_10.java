package NumberToTaxe;

public enum Number1_10 {
    BIR(1,"bir"), IKKI(2,"ikki"), UCH(3,"uch"), TORT(4,"to'rt"), BESH(5,"besh"), OLTI(6,"olti"), YETTI(7,"yetti"), SAKKIZ(8,"sakkiz"), TOQQIZ(9,"to'qqiz");

    private int number;
    private String name;
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    Number1_10(int number, String name) {
        this.number = number;
        this.name = name;
    }

}
