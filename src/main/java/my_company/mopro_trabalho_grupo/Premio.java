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
    private Data dataAtribuicao;

    private static final String NOME_POR_OMISSAO = "";
    private static final Data DATA_POR_OMISSAO = new Data();

    public Premio() {
        nomePremio = NOME_POR_OMISSAO;
        dataAtribuicao = DATA_POR_OMISSAO;
    }

    public Premio(String nomePremio, Data dataAtribuicao) {
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

    public Data getDataAtribuicao() {
        return dataAtribuicao;
    }

    public void setDataAtribuicao(Data dataAtribuicao) {
        this.dataAtribuicao = dataAtribuicao;
    }

    public String toString() {
        return ("Nome do prémio: " + nomePremio + "\nData de atribuição: " + dataAtribuicao);
    }
}
