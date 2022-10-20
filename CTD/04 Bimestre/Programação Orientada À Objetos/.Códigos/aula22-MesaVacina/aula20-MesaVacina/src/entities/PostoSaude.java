package entities;

public class PostoSaude {
    private int qtdVacina;
    private IVacina vacina;

    public PostoSaude() {
    }

    public void setTipoVacina(IVacina vacina){
        this.vacina = vacina;
    }

    public String vacinarPaciente(){
        return this.vacina.aplicarVacina();
    }


}
