package test.materia.service;

import dao.ConfiguracaoJDBC;
import dao.impl.MateriaDAOH2;
import model.Materia;
import org.junit.jupiter.api.Test;
import service.MateriaService;

import static org.junit.jupiter.api.Assertions.*;

class MateriaServiceTest {
    private MateriaService materiaService = new MateriaService(new MateriaDAOH2(new ConfiguracaoJDBC()));

    @Test
    public void salvarMateriaTest(){
        Materia materia = new Materia("backend");

        Materia materiaRegistrada = materiaService.salvar(materia);

        assertTrue(materiaRegistrada.getId() != null);
    }

}