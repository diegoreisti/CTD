import org.h2.jdbc.JdbcSQLSyntaxErrorException;

import java.sql.*;

public class MainUsuario {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO ( ID INT PRIMARY KEY, NOME VARCHAR(100), EMAIL VARCHAR(100), SALDO NUMERIC(15,2))";

    private static final String sqlInsert = "INSERT INTO USUARIO VALUES (?, ?, ?, ?)";
    private static final String sqlUpdate = "UPDATE USUARIO SET SALDO = ? WHERE EMAIL = ?";

    public static void main(String[] args) throws Exception{
        Usuario usuario = new Usuario("Diego Reis","diego@mail.com",10d);

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);

            psInsert.setInt(1, 1);
            psInsert.setString(2, usuario.getNome());
            psInsert.setString(3, usuario.getEmail());
            psInsert.setDouble(4, usuario.getSaldo());

            psInsert.execute();

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);

            psUpdate.setDouble(1, usuario.aumentarSaldo(10d));
            psUpdate.setString(2, usuario.getEmail());
            psUpdate.execute();


            connection.commit();

            connection.setAutoCommit(true);

            String sql = "SELECT * FROM USUARIO";
            Statement stat = connection.createStatement();
            ResultSet rd = stat.executeQuery(sql);
            while (rd.next()){
                System.out.println(rd.getInt(1) + ", " + rd.getString(2) + ", " + rd.getString(3) + ", " + rd.getDouble(4));
            }


        } catch (JdbcSQLSyntaxErrorException errorSqlSintax){
              errorSqlSintax.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
            assert connection != null;
            connection.rollback();
        } finally {
            assert connection != null;
            connection.close();

        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}
