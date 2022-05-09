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
public class Clube {

    private String denominacao;
    private String NIF;
    private String endereco;
    private Data dataConstituicao;
    private String numeroTel;
    private String email;
    private ArrayList<Atleta> atletas = new ArrayList<Atleta>();
    private ArrayList<Modalidade> modalidades = new ArrayList<Modalidade>();
    private ArrayList<Equipa> equipas = new ArrayList<Equipa>();

    private static final String DENOMINACAO_POR_OMISSAO = "";
    private static final String NIF_POR_OMISSAO = "";
    private static final String ENDERECO_POR_OMISSAO = "";
    private static final Data DATA_POR_OMISSAO = new Data();
    private static final String NUMERO_TEL_POR_OMISSAO = "";
    private static final String EMAIL_POR_OMISSAO = "";

    public Clube(String denominacao, String NIF, String endereco, Data dataConstituicao, String numeroTel, String email) {
        this.denominacao = denominacao;
        this.NIF = NIF;
        this.endereco = endereco;
        this.dataConstituicao = dataConstituicao;
        this.numeroTel = numeroTel;
        this.email = email;
    }

    public Clube() {
        denominacao = DENOMINACAO_POR_OMISSAO;
        NIF = NIF_POR_OMISSAO;
        endereco = ENDERECO_POR_OMISSAO;
        dataConstituicao = DATA_POR_OMISSAO;
        numeroTel = NUMERO_TEL_POR_OMISSAO;
        email = EMAIL_POR_OMISSAO;
    }

    public Clube(Clube c1) {
        this.denominacao = c1.denominacao;
        this.NIF = c1.NIF;
        this.endereco = c1.endereco;
        this.dataConstituicao = c1.dataConstituicao;
        this.numeroTel = c1.numeroTel;
        this.email = c1.email;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataConstituicao(Data dataConstituicao) {
        this.dataConstituicao = dataConstituicao;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public Data getDataConstituicao() {
        return dataConstituicao;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getEmail() {
        return email;
    }
    
    public ArrayList<Modalidade> getModalidades() {
        return modalidades;
    }
    
    public ArrayList<Equipa> getEquipas() {
        return equipas;
    }
    
    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public String toString() {
        return ("Denominação: " + denominacao + "\nNIF: " + NIF + "\nEndreço: " + endereco + "\nData de constituição: " + dataConstituicao + "\nNúmero telefónico: " + numeroTel + "\nEmail: " + email);
    }

    public void adicionarAtleta(String nome, int cc, String endereco, Data dataNascimento, int telefone, String email) {
        Atleta a = new Atleta(nome, cc, endereco, dataNascimento, telefone, email);
        atletas.add(a);
    }

    public void adicionarModalidade(String nome, int anoAtivacao) {
        Modalidade m = new Modalidade(nome, anoAtivacao);
        modalidades.add(m);
    }

    public void adicionarEquipa(String escalao, int anoCivil, int num) {
        Equipa e = new Equipa(escalao, modalidades.get(num), anoCivil);
        equipas.add(e);
    }

    public void adicionarJogadorEquipa(int numEquipa, int numAtleta, int num_camisola, String posicaoJogador) {
        equipas.get(numEquipa).setJogador(atletas.get(numAtleta), num_camisola, posicaoJogador);
    }

    public void adicionarPremioIndividual(int numEquipa, int numCamisola, String premio, int anoCivil) {
        equipas.get(numEquipa).getJogador(equipas.get(numEquipa).findJogadorCamisola(numCamisola)).addPremio(premio, anoCivil);
    }

    public void eliminarJogadorEquipa(int numEquipa, int num_camisola) {
        equipas.get(numEquipa).delJogador(equipas.get(numEquipa).findJogadorCamisola(num_camisola));
    }

    public int calcularTotalPremiosIndividuais(int numModalidade) {
        int cont = 0;
        for (int i = 0; i < equipas.size(); i++) {
            if (equipas.get(i).getModalidade().equals(modalidades.get(numModalidade))) {
                for (int j = 0; j < equipas.get(i).getArrJogador().size(); j++) {
                    cont = equipas.get(i).getArrJogador().get(j).getArrPremio().size();
                }
            }
        }
        return cont;
    }

    public int calcularTotalInscricoesAtleta(int numAtleta) {
        int cont = 0;
        for (int i = 0; i < equipas.size(); i++) {
            for (int j = 0; j < equipas.get(i).getArrJogador().size(); j++) {
                if (equipas.get(i).getArrJogador().get(j).equals(atletas.get(numAtleta))) {
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public ArrayList<Jogador> obterJogadoresEquipa(int num) {
        return equipas.get(num).getArrJogador();
    }
}
