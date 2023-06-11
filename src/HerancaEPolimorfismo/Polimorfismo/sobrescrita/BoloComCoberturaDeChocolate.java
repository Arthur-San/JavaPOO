package HerancaEPolimorfismo.Polimorfismo.sobrescrita;

public class BoloComCoberturaDeChocolate extends Bolo {
    @Override //opcional
    void assarBolo() {
        temperatura += 15;
    }
}
