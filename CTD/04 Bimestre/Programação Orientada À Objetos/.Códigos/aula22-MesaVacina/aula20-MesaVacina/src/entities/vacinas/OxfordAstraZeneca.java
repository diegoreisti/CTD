package entities.vacinas;

import entities.IVacina;

public class OxfordAstraZeneca implements IVacina {

    // "Oxford-AstraZeneca";
    // "Inglaterra";
    // qtdDoses = 1;


    @Override
    public String aplicarVacina() {
        return "Vacina Cansino aplicada com sucesso. \n >> Dose única, paciente imunizado!\n";
    }

}
