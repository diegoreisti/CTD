import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS CONTA; CREATE TABLE CONTA "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOME varchar(100) NOT NULL, "
            + " NUMERO_CONTA INT NOT NULL,"
            + " SALDO INT NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO CONTA (ID, NOME, NUMERO_CONTA, SALDO) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE =  "UPDATE CONTA SET SALDO=? WHERE ID=?";



    public static void main(String[] args) throws Exception {

        Conta conta = new Conta(1234567890, "Diego", 100000d);

        Connection connection = null;

        try {

            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            insertConta(connection, conta);

            updateSaldoConta(connection, conta, 50000d);

            connection.setAutoCommit(false);

            selectContas(connection);

            updateSaldoConta(connection, conta, 20000d);

            int a = 4/0;
            connection.commit();

            connection.setAutoCommit(true);


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(connection!=null)
                connection.close();
        }

        Connection connection1 = getConnection();
        selectContas(connection1);
    }

    public static void insertConta(Connection connection, Conta conta) throws SQLException {
        PreparedStatement psInsertConta = connection.prepareStatement(SQL_INSERT);
        psInsertConta.setInt(1, 1);
        psInsertConta.setString(2, conta.getNome());
        psInsertConta.setInt(3, conta.getNumeroConta());
        psInsertConta.setDouble(4, conta.getSaldo());

        psInsertConta.execute();
    }

    public static void updateSaldoConta(Connection connection, Conta conta, double valor) throws SQLException {
        PreparedStatement psUpdateSaldoConta = connection.prepareStatement(SQL_UPDATE);
        psUpdateSaldoConta.setDouble(1, conta.atualizaSaldo(valor));
        psUpdateSaldoConta.setInt(2, 1);
        psUpdateSaldoConta.execute();
    }

    public static void selectContas(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String SQL_SELECT = "SELECT * FROM CONTA";
        ResultSet rs = statement.executeQuery(SQL_SELECT);
        while (rs.next()){
            System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getInt(3) + ", " + rs.getInt(4));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}
