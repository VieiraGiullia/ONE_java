package HoraDaPratica.parteDois;

// numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
public class contaBancaria {
    private int numeroConta;
    public String titular;
    private double saldo;

    // Apenas getters para proteger numeroConta e saldo

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    
     
}
