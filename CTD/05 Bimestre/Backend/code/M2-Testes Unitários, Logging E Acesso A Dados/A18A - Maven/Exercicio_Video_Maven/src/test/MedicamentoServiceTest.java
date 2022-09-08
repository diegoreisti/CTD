package test;

import medicamentos.dao.ConfiguracaoJDBC;
import medicamentos.dao.impl.MedicamentoDaoImpl;
import medicamentos.model.Medicamento;
import medicamentos.service.MedicamentoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {
    private MedicamentoService medicamentoService =
            new MedicamentoService(
                    new MedicamentoDaoImpl(
                            new ConfiguracaoJDBC()
                    )
            );

    @Test
    public void salvarMedicamento() {
        Medicamento medicamento = new Medicamento("Ibuprofeno","Ache",395,23d);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId() != null);
    }

}