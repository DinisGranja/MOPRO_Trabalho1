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
public class Equipa {

    private String escalao;
    private Modalidade modalidade;
    private int dataConstituicao;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public static final String ESCALAO_POR_OMISSAO = "";
    public static final Modalidade MODALIDADE_POR_OMISSAO = new Modalidade();
    public static final int DATA_CONST_POR_OMISSAO = 2000;

    public Equipa(String escalao, Modalidade modalidade, int dataConstituicao) {
        this.escalao = escalao;
        this.modalidade = modalidade;
        this.dataConstituicao = dataConstituicao;
    }

    public Equipa() {
        escalao = ESCALAO_POR_OMISSAO;
        modalidade = MODALIDADE_POR_OMISSAO;
        dataConstituicao = DATA_CONST_POR_OMISSAO;
    }

    public Equipa(Equipa e1) {
        this.escalao = e1.escalao;
        this.modalidade = e1.modalidade;
        this.dataConstituicao = e1.dataConstituicao;
    }

    public String getEscalao() {
        return escalao;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public int getDataConstituicao() {
        return dataConstituicao;
    }

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public void setDataConstituicao(int dataConstituicao) {
        this.dataConstituicao = dataConstituicao;
    }

    public void setJogador(Atleta atleta, int num_camisola, String pos) {
        Jogador j = new Jogador(num_camisola, pos, atleta);
        jogadores.add(j);
    }

    public Jogador getJogador(int id) {
        return jogadores.get(id);
    }
    
    public ArrayList<Jogador> getArrJogador() {
        return jogadores;
    }

    public void delJogador(int id) {
        jogadores.remove(id);
    }

    public int findJogadorCamisola(int num_camisola) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNumCamisola() == num_camisola) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        String inf_equipa = "Escalão: " + escalao + "\nModalidade: " + modalidade + "\nData de constituição: " + dataConstituicao + "\n";
        String inf_equipa_jogadores;
        
        if (!jogadores.isEmpty()) {
            inf_equipa_jogadores = "";
            for (int i = 0; i < jogadores.size(); i++) {
                inf_equipa_jogadores += "\nJogador nº: " + i + "\n";
                inf_equipa_jogadores += jogadores.get(i).toString() + "\n";
            }
        }else{
            inf_equipa_jogadores = "A equipa não tem jogadores!";
        }
        
        return inf_equipa + inf_equipa_jogadores;
    }
}
