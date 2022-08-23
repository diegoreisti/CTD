package paciente.service;

import paciente.dao.IDao;
import paciente.dao.impl.PacienteDaoImpl;
import paciente.model.Endereco;
import paciente.model.Paciente;

public class ClinicaService {


    private IDao<Endereco> enderecoIDao;
    private IDao<Paciente> pacienteIDao;

    public ClinicaService(IDao<Endereco> enderecoIDao, PacienteDaoImpl pacienteIDao) {
        this.enderecoIDao = enderecoIDao;
        this.pacienteIDao = pacienteIDao;
    }

    public Endereco salvar (Endereco endereco){
        return enderecoIDao.salvar(endereco);
    }

    public Paciente salvar (Paciente paciente){
        return pacienteIDao.salvar(paciente);
    }

}