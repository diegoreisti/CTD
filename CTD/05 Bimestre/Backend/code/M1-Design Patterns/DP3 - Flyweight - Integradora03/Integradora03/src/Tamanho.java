public enum Tamanho {
    XS("XS"),
    S("S"),
    M("M");

    protected String name;

    Tamanho(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
