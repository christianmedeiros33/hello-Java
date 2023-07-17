package models;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PessoaTest {
    @Test
    public void criarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joao");
        pessoa.setIdade(19);
//        System.out.println(pessoa.getNome());
        Assert.assertEquals("Joao", pessoa.getNome());
    }
}
