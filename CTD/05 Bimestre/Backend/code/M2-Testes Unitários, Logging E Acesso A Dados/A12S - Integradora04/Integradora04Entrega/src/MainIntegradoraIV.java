import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.*;

public class MainIntegradoraIV {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS EMPLOYEE;" +
            " CREATE TABLE EMPLOYEE (ID INT  PRIMARY KEY NOT NULL" +
            " , FULL_NAME VARCHAR(255)" +
            " , EMAIL VARCHAR(30)" +
            " , DT_NASCIMENTO DATE" +
            " , CPF VARCHAR(11) );";

    private static final String sqlInsert1 =  "INSERT INTO EMPLOYEE VALUES (1, 'DIEGO REIS', 'DREIS@MAIL.COM', '1986-09-10', '01236547899');";
    private static final String sqlInsert2 =  "INSERT INTO EMPLOYEE VALUES (2, 'DUDA REIS', 'DUDA@MAIL.COM', '2016-05-04', '32132132155');";
    private static final String sqlInsert3 =  "INSERT INTO EMPLOYEE VALUES (3, 'EMANOELA DOURADO REIS', 'MANU@MAIL.COM', '1983-01-23', '01236547888');";
    private static final String sqlInsert4 =  "INSERT INTO EMPLOYEE VALUES (3, 'ERRO PROPOSITAL', 'ERROR@MAIL.COM', '1999-01-01', '00000000000');";

    public static final String sqlUpdate = "UPDATE EMPLOYEE SET EMAIL = NULL, CPF = NULL WHERE ID = 3";

    private static final String sqlDelete =  "DELETE FROM EMPLOYEE WHERE ID=1";
    private static final String sqlDelete2 =  "DELETE FROM EMPLOYEE WHERE FULL_NAME LIKE 'EMANOELA%'";

    private static final Logger logger = Logger.getLogger(MainIntegradoraIV.class);

    public static void main(String[] args) throws Exception{
        BasicConfigurator.configure();

        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            logger.info("Criando a tabela\n" + sqlCreateTable + "\n");
            statement.execute(sqlCreateTable);
            logger.info("Tabela criada\n");

            selectAll(connection); // Tabela vazia

            logger.info("Inserindo Usuário 1 \n " + sqlInsert1);
            statement.execute(sqlInsert1);
            logger.info("Inserindo Usuário 2 \n " + sqlInsert2);
            statement.execute(sqlInsert2);
            logger.info("Inserindo Usuário 3 \n " + sqlInsert3);
            statement.execute(sqlInsert3);
            //logger.info("Inserindo Usuário 4 \n " + sqlInsert4);
            //statement.execute(sqlInsert4);

            logger.info("Consultando valores da tabela");
            selectAll(connection);

            logger.info("Update usuário 3:\n" + sqlUpdate);
            statement.execute(sqlUpdate);

            logger.info("Consultando valores após update");
            selectAll(connection);

            logger.info("Delete Usuário 1:\n" + sqlDelete);
            statement.execute(sqlDelete);
            logger.info("Consultando valores após deleção");
            selectAll(connection);

            logger.info("Delete Usuário 3 pelo nome:\n" + sqlDelete2);
            statement.execute(sqlDelete2);
            logger.info("Consultando valores após deleção");
            selectAll(connection);

        } catch (JdbcSQLIntegrityConstraintViolationException erro) {
            logger.error("Primary key repetida");
        } catch (Exception erro) {
            logger.error("Instrução SQL com problema");
//            erro.printStackTrace();
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    public static void selectAll(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM EMPLOYEE";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        logger.info("Execução de script: \n" + sqlQuery + "\n");

        while(resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " +
                    resultSet.getString(2) + " - " +
                    resultSet.getString(3) + " - " +
                    resultSet.getDate(4) + " - " +
                    resultSet.getString(5)) ;
        }
        System.out.println("---------------------------------------------------------------------------------\n");
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
