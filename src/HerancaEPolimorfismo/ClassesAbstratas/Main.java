package HerancaEPolimorfismo.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        CarroEletrico ce = new CarroEletrico();
        ce.ligar();
        ce.velocidade = 100;
        ce.imprimirVelocidade();

        CarroACombustao cc = new CarroACombustao();
        cc.tipoDeCombustivel = "gasolina";
        cc.ligar();
        cc.velocidade = 120;
        cc.imprimirVelocidade();

    }
}
