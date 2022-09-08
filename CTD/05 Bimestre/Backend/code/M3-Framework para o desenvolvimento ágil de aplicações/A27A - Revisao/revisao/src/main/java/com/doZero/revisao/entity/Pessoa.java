package com.doZero.revisao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private List<Veiculo> veiculoList;
    @JsonIgnore
    private List<CarteiraDeMotorista> carteiraDeMotoristaList;


}
