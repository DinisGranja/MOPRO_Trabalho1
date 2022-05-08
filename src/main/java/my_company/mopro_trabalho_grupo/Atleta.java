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
public class Atleta {
    private String nome, endereco, corrEletronico;
    private int numCC, contTelefonico;
    private Data dataNasc;
    
    private static final String NOME_POR_OMISSAO = "", ENDERECO_POR_OMISSAO = "", CORRELETRONICO_POR_OMISSAO = "";
    private static final int NUMCC_POR_OMISSAO = 0, CONTTELEFONICO_POR_OMISSAO = 0;
    private static final Data DATA_POR_OMISSAO = new Data();

    public Atleta(){
        nome = NOME_POR_OMISSAO;
        numCC = NUMCC_POR_OMISSAO;
        endereco = ENDERECO_POR_OMISSAO;
        dataNasc = DATA_POR_OMISSAO;
        contTelefonico = CONTTELEFONICO_POR_OMISSAO;
        corrEletronico = CORRELETRONICO_POR_OMISSAO;
    }
    
    public Atleta(String nome, int numCC, String endereco, Data dataNasc, int contTelefonico, String corrEletronico) {
        this.nome = nome;
        this.numCC = numCC;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
        this.contTelefonico = contTelefonico;
        this.corrEletronico = corrEletronico;
    }
    
    public Atleta(Atleta a1){
        this.nome = a1.nome;
        this.numCC = a1.numCC;
        this.endereco = a1.endereco;
        this.dataNasc = a1.dataNasc;
        this.contTelefonico = a1.contTelefonico;
        this.corrEletronico = a1.corrEletronico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getContTelefonico() {
        return contTelefonico;
    }

    public void setContTelefonico(int contTelefonico) {
        this.contTelefonico = contTelefonico;
    }

    public String getCorrEletronico() {
        return corrEletronico;
    }

    public void setCorrEletronico(String corrEletronico) {
        this.corrEletronico = corrEletronico;
    }
    
    public String toString() {
        return ("Nome: " + nome + "\nNúmero CC: " + numCC + "\nEndereço: " + endereco + "\nData de Nascimento: " + dataNasc + "\nContacto telefónico: " + contTelefonico + "\nE-mail: " + corrEletronico);
    }
}
