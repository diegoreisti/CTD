package DentistClinic.clinic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:clinica;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conectarBD(){
        Connection connection = null;

        try {
            Class.forName(jdbcDriver).newInstance();
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

}
