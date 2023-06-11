package HerancaEPolimorfismo.Polimorfismo.sobrecarga;

public class BoloComCoberturaDeChocolate extends Bolo {
    @Override //opcional
    void assarBolo() {
        temperatura += 15;
    }
}
