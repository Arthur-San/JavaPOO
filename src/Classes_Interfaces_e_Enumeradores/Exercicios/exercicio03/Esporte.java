package Classes_Interfaces_e_Enumeradores.Exercicios.exercicio03;

public enum Esporte {
    FUTEBOL("Futebol"),
    BASQUETE("Basquete"),
    NATACAO("Natação"),
    JIUJITSU("JiuJitsu"),
    VOLEI("Vôlei"),
    CROSSFIT("CrossFit");

    private String tipoEsporte;

    Esporte(String tipoEsporte){
        this.tipoEsporte = tipoEsporte;
    }

    public String getTipoEsporte() {
        return tipoEsporte;
    }

}
