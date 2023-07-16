package models;

public class Profissional extends  Adulto{
 private  String profissao;
 private boolean ensinar;

 private boolean estaContratado;
 private boolean trabalhaComoPj;

 private boolean temFerias;

    public boolean isEnsinar() {
        return ensinar;
    }

    public void setEnsinar(boolean ensinar) {
        this.ensinar = ensinar;
    }

    public boolean isEstaContratado() {
        return estaContratado;
    }

    public void setEstaContratado(boolean estaContratado) {
        this.estaContratado = estaContratado;
    }

    public boolean isTrabalhaComoPj() {
        return trabalhaComoPj;
    }

    public void setTrabalhaComoPj(boolean trabalhaComoPj) {
        this.trabalhaComoPj = trabalhaComoPj;
    }

    public boolean isTemFerias() {
        return temFerias;
    }

    public void setTemFerias(boolean temFerias) {
        this.temFerias = temFerias;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

