package models;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class AdultoTest {
    @Test
    public void isAdulto(){
        Adulto adulto = new Adulto();
        adulto.setNome("Christian");
        adulto.setNumeroCartaoCard("1111 0000 2222 3333");
        adulto.setCnh("12345678999");
        adulto.setContaBancaria("3000");
        adulto.setSaldoEmConta(344);
        LocalDateTime dateTime = LocalDateTime.now(ZoneId.systemDefault());

        System.out.println(dateTime + "\nNome: " + adulto.getNome() + "\nNumero CNH: " + adulto.getCnh() + "\nNumero conta: " + adulto.getContaBancaria() + "\nSaldo em conta: R$" + adulto.getSaldoEmConta());
    }
}
