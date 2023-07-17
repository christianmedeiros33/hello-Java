package models;

import org.junit.Test;

import java.util.ArrayList;

public class HomemTest {
    @Test
    public void criarHomem(){

        Homem homem = new Homem();
        homem.setNome("Adao");
        homem.setIdade(12);
        homem.setNomeDaEsposa("Eva");
        homem.setTemFilhos(true);
        homem.setCasado(true);

        Mulher esposaDoHomem = new Mulher();
        esposaDoHomem.setNome(homem.getNomeDaEsposa());
        homem.setEsposa(esposaDoHomem);

        Filho filhoMaisVelho = new Filho();
        filhoMaisVelho.setNome("Caim");

        Filho filhoMaisNovo = new Filho();
        filhoMaisNovo.setNome("Abel");

        ArrayList<Pessoa> filhos = new ArrayList<>();
        filhos.add(filhoMaisVelho);
        filhos.add(filhoMaisNovo);
        homem.setFilhos(filhos);

        String[] nomesDosFilhos = new String[filhos.size()];

        for (int i = 0; i < filhos.size(); i++) {
            nomesDosFilhos[i] = filhos.get(i).getNome();
        }

        homem.setNomeDosFilhos(nomesDosFilhos);
        System.out.println();

    }
}
