package models;

public class Adulto extends Homem {

    private  String numeroCartaoCard;
    private String cnh;

    private String contaBancaria;
    private Integer saldoEmConta;

    public String getNumeroCartaoCard() {
        return numeroCartaoCard;
    }

    public void setNumeroCartaoCard(String numeroCartaoCard) {
        this.numeroCartaoCard = numeroCartaoCard;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public Integer getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(Integer saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }
}
