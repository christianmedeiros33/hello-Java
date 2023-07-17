package models;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class AdultoTest {
    @Test
    public void isAdulto() {
        Adulto adulto = new Adulto();
        adulto.setNome("Christian");
        adulto.setIdade(17);
        adulto.setNumeroCartaoCard("1111 0000 2222 3333");
        adulto.setCnh("12345678999");
        adulto.setContaBancaria("3000");
        adulto.setSaldoEmConta(344);

        Profissional profissional = null;
        if (adulto.getIdade() >= 16) {
            profissional = new Profissional();
            profissional.setProfissao("developers");
            System.out.println();
        } else {
            System.out.println("not is big.");
        }

        System.out.println(profissional.getProfissao() + "\nNome: " + adulto.getNome() + "\nIdade: " + adulto.getIdade() + "\nNumero CNH: " + adulto.getCnh() + "\nNumero conta: " + adulto.getContaBancaria() + "\nSaldo em conta: R$" + adulto.getSaldoEmConta());
    }
}
