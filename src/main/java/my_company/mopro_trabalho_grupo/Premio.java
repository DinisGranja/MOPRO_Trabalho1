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
public class Premio {
    private String nomePremio;
    private int dataAtribuicao;

    private static final String NOME_POR_OMISSAO = "";
    private static final int DATA_POR_OMISSAO = 2000;

    public Premio() {
        nomePremio = NOME_POR_OMISSAO;
        dataAtribuicao = DATA_POR_OMISSAO;
    }

    public Premio(String nomePremio, int dataAtribuicao) {
        this.nomePremio = nomePremio;
        this.dataAtribuicao = dataAtribuicao;
    }

    public Premio(Premio p1) {
        this.nomePremio = p1.nomePremio;
        this.dataAtribuicao = p1.dataAtribuicao;
    }

    public String getNomePremio() {
        return nomePremio;
    }

    public void setNomePremio(String nomePremio) {
        this.nomePremio = nomePremio;
    }

    public int getDataAtribuicao() {
        return dataAtribuicao;
    }

    public void setDataAtribuicao(int dataAtribuicao) {
        this.dataAtribuicao = dataAtribuicao;
    }

    public String toString() {
        return ("Nome do prémio: " + nomePremio + "\nData de atribuição: " + dataAtribuicao);
    }
}
