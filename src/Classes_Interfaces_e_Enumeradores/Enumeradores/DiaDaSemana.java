package Classes_Interfaces_e_Enumeradores.Enumeradores;

public enum DiaDaSemana {
    SEGUNDA("Segunda-Feira"),
    TERCA("Terça-Feira"),
    QUARTA("Quarta-Feira"),
    QUINTA("Quinta-Feira"),
    SEXTA("Sexta-Feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    public String getDiaPorExtenso() {
        return diaPorExtenso;
    }

    public void setDiaPorExtenso(String diaPorExtenso) {
        this.diaPorExtenso = diaPorExtenso;
    }

    private String diaPorExtenso;

    DiaDaSemana(String diaPorExtenso){
        this.diaPorExtenso = diaPorExtenso;
    }
}
