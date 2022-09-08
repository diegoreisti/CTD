package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

public class HotelDaoImpl implements IDao<Hotel> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(HotelDaoImpl.class);

    public HotelDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Hotel salvar(Hotel hotel) {
        log.debug("Salvando hotel: " + hotel.toString());
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO HOTEL (NOME, RUA, NUMERO, CIDADE, ESTADO, CINCO_ESTRELAS) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')"
                ,hotel.getNome()
                ,hotel.getRua()
                ,hotel.getNumero()
                ,hotel.getCidade()
                ,hotel.getEstado()
                ,hotel.iseCincoEstrelas());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                hotel.setId(resultSet.getInt(1));
                log.debug("Criada o filial " + hotel.getNome());
        } catch (SQLException e){
            log.error("Verifique seu código! Erro: " + e);
            e.printStackTrace();
        }
        return hotel;
    }
}
