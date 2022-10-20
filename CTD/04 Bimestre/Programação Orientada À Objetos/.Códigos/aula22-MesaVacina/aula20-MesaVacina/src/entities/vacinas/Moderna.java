package entities.vacinas;

import entities.IVacina;

public class Moderna implements IVacina {


    @Override
    public String aplicarVacina() {
        return "Vacina Moderna aplicada com sucesso. \n >> Paciente ainda necessita de outra dose!\n";
    }

}
