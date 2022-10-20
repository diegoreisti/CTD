package entities.vacinas;

import entities.IVacina;

public class Cansino implements IVacina {


    @Override
    public String aplicarVacina() {
        return "Vacina Cansino aplicada com sucesso. \n >> Dose única, paciente imunizado!\n";
    }

}
