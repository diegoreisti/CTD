package entities.vacinas;

import entities.IVacina;

public class Pfizer implements IVacina {


    @Override
    public String aplicarVacina() {
        return "Vacina Pfizer aplicada com sucesso. \n >> Paciente ainda necessita de outra dose!\n";
    }

}
