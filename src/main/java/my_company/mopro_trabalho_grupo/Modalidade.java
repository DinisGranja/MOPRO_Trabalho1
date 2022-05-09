/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.mopro_trabalho_grupo;

import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class Modalidade {
    private String nome;
    private int dataCriacao;

    private static final String NOME_POR_OMISSAO = "";
    private static final int DATA_POR_OMISSAO = 2000;

    public Modalidade() {
        nome = NOME_POR_OMISSAO;
        dataCriacao = DATA_POR_OMISSAO;
    }

    public Modalidade(String nome, int dataCriacao) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
    }

    public Modalidade(Modalidade m1) {
        this.nome = m1.nome;
        this.dataCriacao = m1.dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(int dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String toString() {
        return ("Nome:  " + nome + "\nDataCriação: " + dataCriacao);
    }
}
