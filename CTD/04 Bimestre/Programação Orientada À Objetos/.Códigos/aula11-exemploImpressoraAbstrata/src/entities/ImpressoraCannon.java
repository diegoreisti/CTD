package entities;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{


    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, double percTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, percTinta);
    }

    @Override
    public void imprimir() {
        if (temPapel() && !precisaTinta()){
            setFolhasDisponiveis(getFolhasDisponiveis() - 1);
            setPercTinta(getPercTinta()- 0.01);
            System.out.println("The sheet is being printed on the Cannon printer!");
        } else if (!temPapel() && precisaTinta()) {
            System.out.println("There is no paper and sheet in the Cannon printer!");
        } else if (!temPapel()) {
            System.out.println("There is no paper the Cannon printer!");
        } else if (precisaTinta()){
            System.out.println("There is no sheet in the Cannon printer!");
        } else System.out.println("Unknown Error on Cannon printer!");
    }

}
