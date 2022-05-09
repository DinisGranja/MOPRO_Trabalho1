/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.mopro_trabalho_grupo;

import java.util.ArrayList;
import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class Jogador {
    private int numCamisola;
    private String posJogador;
    private Atleta dadosPessoais;
    private ArrayList <Premio> premios = new ArrayList<Premio>();

    private static final int NUMCAMISOLA_POR_OMISSAO = 0;
    private static final String POSJOGADOR_POR_OMISSAO = "";
    private static final Atleta DADOS_POR_OMISSAO = new Atleta();

    public Jogador() {
        numCamisola = NUMCAMISOLA_POR_OMISSAO;
        posJogador = POSJOGADOR_POR_OMISSAO;
        dadosPessoais = DADOS_POR_OMISSAO;
    }

    public Jogador(int numCamisola, String posJogador, Atleta dadosPessoais) {
        this.numCamisola = numCamisola;
        this.posJogador = posJogador;
        this.dadosPessoais = dadosPessoais;
    }

    public Jogador(Jogador j1) {
        this.numCamisola = j1.numCamisola;
        this.posJogador = j1.posJogador;
        this.dadosPessoais = j1.dadosPessoais;
    }

    public int getNumCamisola() {
        return numCamisola;
    }

    public void setNumCamisola(int numCamisola) {
        this.numCamisola = numCamisola;
    }

    public String getPosJogador() {
        return posJogador;
    }

    public void setPosJogador(String posJogador) {
        this.posJogador = posJogador;
    }

    public Atleta getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(Atleta dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
    
    public ArrayList<Premio> getArrPremio() {
        return premios;
    }

    public String toString() {
        return ("Número da camisola: " + numCamisola + "\nPosição: " + posJogador + "\nDados pessoais: " + dadosPessoais);
    }
    
    public void addPremio(String nomePremio, int dataAtribuicao) {
        Premio p = new Premio(nomePremio, dataAtribuicao);
        premios.add(p);
    }
}
