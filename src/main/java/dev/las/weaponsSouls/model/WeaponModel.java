package dev.las.weaponsSouls.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity //transformando a classe em uma entidade fisica no banco
@Table(name = "weapons") //dando nome a tabela
public class WeaponModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //criando um AutoIncrement do tipo numerico
    private Long id;
    private String name;
    private String descricao;
    private int durabilidade;

    public WeaponModel() {
    }

    public WeaponModel(int durabilidade, String descricao, String name) {
        this.durabilidade = durabilidade;
        this.descricao = descricao;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
