import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        Connection connection  = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement statement = connection.createStatement();

        String sqlCreateTable = "DROP TABLE IF EXISTS Teste; CREATE TABLE Teste(Id INT PRIMARY KEY, Nome VARCHAR(255))";
        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO TESTE VALUES (1, 'DUDA DOURADO')";
        String sqlInsert2 = "INSERT INTO TESTE VALUES (2, 'DIEGO REIS')";
        String sqlInsert3 = "INSERT INTO TESTE VALUES (3, 'MANU DOURADO')";

        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);
        statement.execute(sqlInsert3);

        String sqlSelect = "SELECT * FROM TESTE";

        ResultSet resultSet = statement.executeQuery(sqlSelect);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
        }

    }
}
