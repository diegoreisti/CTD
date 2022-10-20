package entities;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora {

    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, double percTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, percTinta);
    }

    @Override
    public void imprimir() {
        if (temPapel() && !precisaTinta()){
            setFolhasDisponiveis(getFolhasDisponiveis() - 1);
            setPercTinta(getPercTinta()- 0.01);
            System.out.println("The sheet is being printed on the Epson printer!");
        } else if (!temPapel() && precisaTinta()) {
            System.out.println("There is no paper and sheet in the Epson printer!");
        } else if (!temPapel()) {
            System.out.println("There is no paper the Epson printer!");
        } else if (precisaTinta()){
            System.out.println("There is no sheet in the Epson printer!");
        } else System.out.println("Unknown Error on Epson printer!");
    }
}
