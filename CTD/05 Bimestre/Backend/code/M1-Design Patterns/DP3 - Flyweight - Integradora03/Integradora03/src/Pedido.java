public class Pedido {

    protected Roupa roupa;

    public Pedido(Roupa roupa) {
        this.roupa = roupa;
    }

    public static Pedido of(Tamanho tamanho, TipoRoupa tipoRoupa, boolean eNova, boolean eImportada, String cliente){
        Roupa roupa = FabricaDeRoupas.fazerRoupa(tamanho, tipoRoupa, eNova, eImportada);
        System.out.printf("Produzindo roupas do cliente '%s' \n", cliente);
        System.out.println("--------------------------------");
        return new Pedido(roupa);
    }

    public Roupa getRoupa() {
        return roupa;
    }
}
