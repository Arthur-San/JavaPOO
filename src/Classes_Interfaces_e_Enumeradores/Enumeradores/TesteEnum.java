package Classes_Interfaces_e_Enumeradores.Enumeradores;

public class TesteEnum {
    public static void main(String[] args) {
        DiaDaSemana diaDaSemana = DiaDaSemana.QUARTA;
        System.out.println(diaDaSemana.getDiaPorExtenso());

        DiaDaSemana diaDaSemana2 = DiaDaSemana.QUARTA;
        if (diaDaSemana == diaDaSemana2){
            System.out.println("É o mesmo dia da Semana");
        }
        switch (diaDaSemana){
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
                System.out.println("Dia de trabalho");
                break;
            case SEXTA:
                System.out.println("Sextou");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("Fim de semana");
                break;
        }
        DiaDaSemana [] meusDiasDaSemana = DiaDaSemana.values();
        for (DiaDaSemana dia : meusDiasDaSemana){
            System.out.println(dia.toString() + " ordinal: " + dia.ordinal() + " - extenso: " +  diaDaSemana.getDiaPorExtenso() );
        }
    }
}
