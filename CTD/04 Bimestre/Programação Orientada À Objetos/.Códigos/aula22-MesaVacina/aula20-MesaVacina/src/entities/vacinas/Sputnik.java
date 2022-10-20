package entities.vacinas;

import entities.IVacina;

public class Sputnik implements IVacina {


    @Override
    public String aplicarVacina() {
        return "Vacina Sputnik aplicada com sucesso. \n >> Paciente ainda necessita de outra dose!\n";
    }

}
