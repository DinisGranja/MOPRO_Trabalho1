/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package my_company.mopro_trabalho_grupo;

import java.util.ArrayList;
import my_company.utilitarios.Data;
import java.util.Scanner;

/**
 *
 * @author dinis
 */
public class MOPRO_Trabalho_Grupo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Clube c1 = new Clube("Clube X", "123456789", "Porto", new Data(2014, 5, 2), "931122334",
                "clubex@gmail.com");
        // Adicionar 10 atletas ao clube
        
        c1.adicionarAtleta("Pedro Nunes", 1111111, "Porto", new Data(2000, 3, 1), 912343432, "pedronumes@gmail.com");
        c1.adicionarAtleta("Mário Alves", 2222222, "Maia", new Data(2000, 12, 5), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Miguel Oliveira", 3333333, "Gaia", new Data(1997, 2, 15), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Rui Silva", 4444444, "Porto", new Data(1997, 12, 5), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Tiago Silva", 5555555, "Gaia", new Data(2000, 10, 22), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("José Pedro", 6666666, "Valongo", new Data(2000, 1, 16), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Gabriel Bastos", 7777777, "Matosinhos", new Data(1997, 6, 24), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Gustavo Mendes", 8888888, "Maia", new Data(2000, 8, 1), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Alexandre Santos", 9999999, "Porto", new Data(2002, 4, 25), 916667778, "marioalves@gmail.com");
        c1.adicionarAtleta("Gonçalo Barbosa", 1212121, "Matosinhos", new Data(2002, 9, 15), 916667778, "marioalves@gmail.com");

        // System.out.println("I - Listar toda a informação do clube"+c1.toString());
        // Adicionar 2 modalidades ao clube
        c1.adicionarModalidade("futebol", 1990);
        c1.adicionarModalidade("futsal", 1995);
        //System.out.println("II - Listar toda a informação do clube"+c1.toString());
        
        // Adicionar 2 equipas e, para isso, fazer:
        // Mostrar todas as modalidades do clube, solicitar uma e depois adicionar/criar uma equipa (sem jogadores por agora)
        ArrayList<Modalidade> vec = c1.getModalidades();
        listarModalidades(vec);
        System.out.println("\nDigite a posição da modalidade na lista: ");
        int num = in.nextInt();
        c1.adicionarEquipa("sub21", 2020, num);
        // Outra equipa
        // Mostrar todas as modalidades do clube, solicitar uma e depois adicionar/criar uma equipa (sem jogadores por agora)
        vec = c1.getModalidades();
        listarModalidades(vec);
        System.out.println("\nDigite a posição da modalidade na lista: ");
        num = in.nextInt();
        c1.adicionarEquipa("sub23", 2021, num);
        // System.out.println("III - Listar toda a informação do clube"+c1.toString());

// Adicionar 2 jogadores a cada uma das equipas criadas anteriormente. Para isso, começar por selecionar a equipa e só depois os atletas.
        ArrayList<Equipa> vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nDigite a posição da equipa na lista: ");
        num = in.nextInt();
        ArrayList<Atleta> vec2 = c1.getAtletas();
        listarAtletas(vec2);
        System.out.println("\nDigite a posição do atleta na lista: ");
        int num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 12, "defesa esquerdo");
        // outro atleta
        listarAtletas(vec2);
        System.out.println("\nDigite a posição do atleta na lista: ");
        num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 7, "atacante");
        // System.out.println("IV - Listar toda a informação do clube"+c1.toString());
        // Adicionar 2 jogadores a outra equipa. Começar por listar as equipas existentes no clube
        listarEquipas(vec1);
        System.out.println("\nDigite a posição da equipa na lista: ");
        num = in.nextInt();
        vec2 = c1.getAtletas();
        // Listar os atletas e pedir para escolher um deles
        listarAtletas(vec2);
        System.out.println("\nDigite a posição do atleta na lista: ");
        num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 77, "guarda-redes");
        // outro atleta
        listarAtletas(vec2);
        System.out.println("\nDigite a posição do atleta na lista: ");
        num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 25, "defesa direito");
        // System.out.println("IV - Listar toda a informação do clube"+c1.toString());
        // Adicionar um prémio individual. A equipa, jogador devem ser escolhidos.
        listarEquipas(vec1);
        System.out.println("\nDigite a posição da equipa na lista: ");
        num = in.nextInt();
        ArrayList<Jogador> vec3 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec3);
        System.out.println("\nDigite o número da camisola do jogador: ");
        num1 = in.nextInt();
        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2021);
        
        listarEquipas(vec1);
        System.out.println("\nDigite a posição da equipa na lista: ");
        num = in.nextInt();
        ArrayList<Jogador> vec4 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec4);
        System.out.println("\nDigite o número da camisola do jogador: ");
        num1 = in.nextInt();
        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2021);
        System.out.println("V - Listar toda a informação do clube" + c1.toString());
        
        //Calcular e mostrar a quantidade total de prémios individuais dos jogadores que praticam uma dada modalidade
        listarModalidades(vec);
        System.out.println("\nDigite a posição da modalidade na lista: ");
        num = in.nextInt();
        System.out.println(c1.calcularTotalPremiosIndividuais(num));
        
        //Calcular e mostrar a quantidade de vezes que um dado atleta foi inscrito em equipas, independentemente da modalidade:
        listarAtletas(vec2);
        System.out.println("\nDigite a posição do atleta na lista: ");
        num = in.nextInt();
        System.out.println(c1.calcularTotalInscricoesAtleta(num));
        
        c1.eliminarJogadorEquipa(0, 12);
        
        System.out.println("VI - Listar toda a informação do clube" + c1.toString());
        
    }

    public static void listarModalidades(ArrayList<Modalidade> vec) {
        System.out.println("\n #### Modalidades ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
            System.out.println("");
        }
    }

    public static void listarEquipas(ArrayList<Equipa> vec) {
        System.out.println("\n #### Equipas ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
            System.out.println("");
        }
    }

    public static void listarAtletas(ArrayList<Atleta> vec) {
        System.out.println("\n #### Atletas ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
            System.out.println("");
        }
    }

    public static void listarJogadoresEquipa(ArrayList<Jogador> vec) {
        System.out.println("\n #### Jogadores ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
            System.out.println("");
        }
    }

}
