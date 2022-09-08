package test;

import dao.ConfiguracaoJDBC;
import dao.impl.HotelDaoImpl;
import model.Hotel;
import org.junit.jupiter.api.Test;
import service.HotelService;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    private HotelService hotelService =
            new HotelService(
                    new HotelDaoImpl(
                            new ConfiguracaoJDBC()
                    )
            );

    @Test
    public void salvarHotel(){
        Hotel h1 = new Hotel("Hotel Cheraton", "Rua abc", 10, "Salvador", "BA", true);
        Hotel h2 = new Hotel("Hotel Da Cidade", "Rua def", 20, "Salvador", "BA", false);
        Hotel h3 = new Hotel("Hotel Ibis", "Rua jhi", 30, "Salvador", "BA", true);
        Hotel h4 = new Hotel("Hostel Biriri", "Rua jkl", 40, "Salvador", "BA", false);
        Hotel h5 = new Hotel("Hotel New York", "Rua mno", 50, "Salvador", "BA", true);
        hotelService.salvar(h1);
        hotelService.salvar(h2);
        hotelService.salvar(h3);
        hotelService.salvar(h4);
        hotelService.salvar(h5);
        assertNotNull(h1.getId());
        assertNotNull(h2.getId());
        assertNotNull(h3.getId());
        assertNotNull(h4.getId());
        assertNotNull(h5.getId());

    }

}