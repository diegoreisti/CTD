public enum TipoRoupa {
    CALCA("Calça"),
    BERMUDA("Bermuda"),
    BIKINI("Bikini"),
    SUNGA("Sunga"),
    CAMISA("Camisa");

    protected String name;

    TipoRoupa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
