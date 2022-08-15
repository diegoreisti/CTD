import java.sql.*;
import java.time.LocalDate;


public class MainPaciente {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS PACIENTE; CREATE TABLE PACIENTE " +
        "(" +
        " id INT PRIMARY KEY," +
        " nome VARCHAR(50), " +
        " sobrenome VARCHAR(50), " +
        " endereco VARCHAR(100), " +
        " rg VARCHAR(10), " +
        " data_cadastro DATE, " +
        " usuario  VARCHAR(20), " +
        " senha  VARCHAR(20) " +
        ")"    ;

    private static final String sqlInsert = "INSERT INTO PACIENTE VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String sqlUpdateSenha = "UPDATE PACIENTE SET SENHA = ? WHERE ID = ?";


    public static void main(String[] args) throws SQLException {

        Paciente paciente = new Paciente("Diego", "Reis", "Rua da Gratidão", "0123456789", Date.valueOf(LocalDate.now()), "diegoreisti", "AbC@123");

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);
            psInsert.setInt(1, paciente.getId());
            psInsert.setString(2, paciente.getNome());
            psInsert.setString(3, paciente.getSobrenome());
            psInsert.setString(4, paciente.getEndereco());
            psInsert.setString(5, paciente.getRG());
            psInsert.setDate(6, (Date) paciente.getDataCadastro());
            psInsert.setString(7, paciente.getUsuario());
            psInsert.setString(8, paciente.getSenha());

            psInsert.execute();

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdateSenha);
            psUpdate.setString(1, "123456789");
            psUpdate.setInt(2, paciente.getId());

            String senhaAntiga = paciente.getSenha();

            psUpdate.execute();

            String sqlComparaSenha = "SELECT CASE" +
                    " WHEN senha = '" + senhaAntiga + "' THEN 'SENHAS SÃO IGUAIS'" +
                    " ELSE 'SENHAS NÃO SÃO IGUAIS'" +
                    " END" +
                    " FROM PACIENTE WHERE ID = " + paciente.getId();

            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(sqlComparaSenha);
            while (rs.next()){
                System.out.println(rs.getString(1));
            }

            connection.setAutoCommit(true);


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            assert connection!=null;
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
