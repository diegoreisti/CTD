package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Materia;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAOH2 implements IDao<Materia> {
    private ConfiguracaoJDBC configuracaoJDBC;

    public MateriaDAOH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Materia salvar(Materia materia) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO MATERIAS (NOME) VALUES ('%S')", materia.getNome());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                materia.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return materia;
    }

    @Override
    public List<Materia> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM MATERIAS");
        List<Materia> materias = new ArrayList<>();
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                materias.add(new Materia(resultSet.getInt("id"), resultSet.getString("nome")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return materias;
    }
}
