/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my_company.mopro_trabalho_grupo;

import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class MOPRO_Trabalho_Grupo {

    public static void main(String[] args) {
        Data dataCriacaoM1 = new Data(2022, 3, 24);

        Modalidade m1 = new Modalidade("Basquetebol", dataCriacaoM1);
        Atleta a1 = new Atleta("Pedro", 123456789, "Rua de penelas", new Data(2005, 4, 27), 965874588, "pedro123@email.pt");

        System.out.println(m1.toString());
        System.out.println(a1.toString());
        
        m1.adicionarModalidade("Voleibol", 1990);
        a1.adicionarAtleta("Andre", 01234879, "Rua de mirandela", new Data(2000, 10, 3), 963625232, "andr0@email.pt");

        System.out.println(m1.toString());
        System.out.println(a1.toString());
    }
}
