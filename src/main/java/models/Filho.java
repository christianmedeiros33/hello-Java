package models;

public class Filho extends Homem implements Prole{
    private String nomeDoPai;
    private String nomeDaMae;

    @Override
    public String getNomeDoPai() {
        return nomeDoPai;
    }

    @Override
    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    @Override
    public String getNomeDaMae() {
        return nomeDaMae;
    }

    @Override
    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
}
