package test;

import org.h2.server.Service;
import org.junit.jupiter.api.Test;
import paciente.dao.ConfiguracaoJDBC;
import paciente.dao.impl.EnderecoDaoImpl;
import paciente.dao.impl.PacienteDaoImpl;
import paciente.model.Endereco;
import paciente.model.Paciente;
import paciente.service.ClinicaService;

import static org.junit.jupiter.api.Assertions.*;

class ClinicaServiceTest {
    private ClinicaService ClinicaService =
            new ClinicaService(
                    new EnderecoDaoImpl(
                            new ConfiguracaoJDBC()),
                    new PacienteDaoImpl(
                            new ConfiguracaoJDBC()
                    )
            );

    @Test
    public void salvarPaciente(){
        Paciente paciente1 = new Paciente(1, "Ana", "Almeida", 1011254555, "01-01-2004");
        Endereco endereco1 = new Endereco(1, "Rua abc", 123, "Cidade abc", "Bairro abc");

        Paciente paciente2 = new Paciente(2, "Roberto", "Mota", 302254566, "10/05/1986");
        Endereco endereco2 = new Endereco( 2, "Rua cde", 456, "Cidade cde", "Bairro cde");

        ClinicaService.salvar(paciente1);
        ClinicaService.salvar(endereco1);

        ClinicaService.salvar(paciente2);
        ClinicaService.salvar(endereco2);

        assertTrue(paciente1.getId() != null);
        assertTrue(endereco1.getIdEndereco() != null);
        assertTrue(paciente2.getId() != null);
        assertTrue(endereco2.getIdEndereco() != null);
    }

}