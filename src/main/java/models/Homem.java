package models;

import java.util.ArrayList;

public class Homem extends Pessoa {
    private String corDaBarba;
    private String nomeDaEsposa;
    private boolean casado;
    private String[] nomeDosFilhos;
    private boolean temFilhos;
    private ArrayList<Pessoa> filhos;

    private Mulher esposa;

    public String getCorDaBarba() {
        return corDaBarba;
    }

    public void setCorDaBarba(String corDaBarba) {
        this.corDaBarba = corDaBarba;
    }

    public String getNomeDaEsposa() {
        return nomeDaEsposa;
    }

    public void setNomeDaEsposa(String nomeDaEsposa) {
        this.nomeDaEsposa = nomeDaEsposa;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String[] getNomeDosFilhos() {
        return nomeDosFilhos;
    }

    public void setNomeDosFilhos(String[] nomeDosFilhos) {
        this.nomeDosFilhos = nomeDosFilhos;
    }

    public boolean isTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }

    public ArrayList<Pessoa> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Pessoa> filhos) {
        this.filhos = filhos;
    }

    public Mulher getEsposa() {
        return esposa;
    }

    public void setEsposa(Mulher esposa) {
        this.esposa = esposa;
    }
}
