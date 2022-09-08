package DentistClinic.clinic.dao.impl;

import DentistClinic.clinic.dao.ConfiguracaoJDBC;
import DentistClinic.clinic.dao.IDao;
import DentistClinic.clinic.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EnderecoDaoImpl implements IDao<Endereco> {
    private ConfiguracaoJDBC configuracaoJDBC;

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO endereco (rua, numero, cidade, bairro) VALUES ('%S','%d','%s','%s')", endereco.getRua(), endereco.getNumero(), endereco.getCidade(), endereco.getBairro());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                endereco.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return endereco;
    }

    @Override
    public List<Endereco> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM endereco");

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
