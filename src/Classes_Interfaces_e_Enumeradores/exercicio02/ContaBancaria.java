package Classes_Interfaces_e_Enumeradores.exercicio02;

public class ContaBancaria implements Sacavel, Depositavel{
    private Integer numeroConta;
    private String nome;
    private Double saldo;

    public ContaBancaria(Integer numeroConta, String nome, Double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double saque) {
        setSaldo(getSaldo() - saque );

        System.out.println("\nSacado: " + saque
        + "\nSaldo atual: " + getSaldo() );
    }

    @Override
    public void depositar(double deposito) {
        setSaldo(getSaldo() + deposito );

        System.out.println("\nDepositado: " + deposito
                + "\nSaldo atual: " + getSaldo() );
    }
}
