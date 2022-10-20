import entities.PacienteAdulto;
import entities.PacientePediatrico;
import entities.PostoSaude;
import entities.vacinas.*;

public class Programa {
    public static void main(String[] args) {

        OxfordAstraZeneca astraZeneca = new OxfordAstraZeneca();
        Cansino cansino = new Cansino();
        Moderna moderna = new Moderna();
        Pfizer pfizer = new Pfizer();
        Sputnik sputnik = new Sputnik();

        PostoSaude postinho = new PostoSaude();

        PacientePediatrico pi = new PacientePediatrico();
        pi.setTipoVacina(cansino);
        System.out.println(pi.vacinarPaciente());

        PacienteAdulto pa = new PacienteAdulto();
        pa.setTipoVacina(pfizer);
        System.out.println(pa.vacinarPaciente());
    }
}
