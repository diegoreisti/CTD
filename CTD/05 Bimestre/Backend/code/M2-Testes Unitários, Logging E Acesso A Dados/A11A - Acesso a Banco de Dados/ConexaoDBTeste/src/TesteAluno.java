import java.sql.*;

public class TesteAluno {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection connection  = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement statement = connection.createStatement();

        String createTableEmployee = "drop table if exists EMPLOYEE; CREATE TABLE EMPLOYEE (ID INT PRIMARY KEY,NOME VARCHAR(255), IDADE INT, EMPRESA VARCHAR(255), DH_CONTRATO DATE)";
        statement.execute(createTableEmployee);

        String insertData1 = "INSERT INTO EMPLOYEE VALUES (1, 'CARLOS XAVIER', 18, 'AMAZON', '2022-01-31')";
        String insertData2 = "INSERT INTO EMPLOYEE VALUES (2, 'EDGAR VENANCIO', 19,  'AMAZON', '2022-01-31')";
        String insertData3 = "INSERT INTO EMPLOYEE VALUES (3, 'DIEGO REIS', 30,'AMAZON', '2022-01-31')";

        statement.execute(insertData1);
        statement.execute(insertData2);
        statement.execute(insertData3);

        String selectEmployes = "SELECT * FROM EMPLOYEE";

        ResultSet resultSet = statement.executeQuery(selectEmployes);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+", "+resultSet.getString(2)+", "+resultSet.getInt(3)+", "+resultSet.getString(4)+", "+resultSet.getDate(5));
        }

    }
}
