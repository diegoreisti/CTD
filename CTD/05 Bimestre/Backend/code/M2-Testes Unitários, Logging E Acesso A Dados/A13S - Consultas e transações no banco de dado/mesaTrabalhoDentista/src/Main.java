import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS DENTISTA; CREATE TABLE DENTISTA "
            + "("
            + " NOME VARCHAR(100) NOT NULL,"
            + " SOBRENOME VARCHAR(100) NOT NULL,"
            + " MATRICULA INT NOT NULL"
            + ")" ;

    private static final String SQL_INSERT = "INSERT INTO DENTISTA VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE DENTISTA SET MATRICULA = ? WHERE NOME = ?";
    private static final String SQL_SELECT = "SELECT * FROM DENTISTA";



    public static void main(String[] args) throws SQLException {

        Dentista dentista = new Dentista("Ricardo", "Brito", 321321);

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            connection.setAutoCommit(false);

            inserirDentista(connection, dentista);

            selectDentista(connection);

            updateDentista(connection, dentista, 123456789);

            selectDentista(connection);

            connection.commit();
            connection.setAutoCommit(true);


        } catch (Exception erro){
            erro.printStackTrace();
        } finally {
            assert connection != null;
            connection.close();
        }
    }

    private static void inserirDentista(Connection connection, Dentista dentista) throws SQLException {
        PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
        psInsert.setString(1, dentista.getNome());
        psInsert.setString(2, dentista.getSobrenome());
        psInsert.setInt(3,dentista.getMatricula());
        psInsert.execute();
    }

    private static void updateDentista(Connection connection, Dentista dentista, int novaMatricula) throws SQLException {
        PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
        psUpdate.setInt(1, novaMatricula);
        psUpdate.setString(2, dentista.getNome());
        psUpdate.execute();
    }

    private static void selectDentista(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(SQL_SELECT);
        while (rs.next()){
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}
