package HoraDaPratica.parteTres.Carro.model;

import java.time.LocalDate;

import HoraDaPratica.parteTres.Carro.Carro;

public class modeloCarro extends Carro{
    private String modelo;
    private int anoDoCarro;
    private double precoMedioPorAno;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public void setPrecoMedioPorAno(double precoMedioPorAno) {
        this.precoMedioPorAno = precoMedioPorAno;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void InformacaoCarro() {
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Ano de Fabricação: " + anoDoCarro);
        System.out.println("Preço avaliado: " + preco);
    }

    public double precoMedio() {
        this.precoAno1 = precoInicial * 1.5; // Aumento de 50% no primeiro ano
        this.precoAno2 = precoInicial * 1.8; // Aumento de 80% no segundo ano
        this.precoAno3 = precoInicial * 1.1; // Aumento de 10% no terceiro ano
        return (precoAno1 + precoAno2 + precoAno3) / 3;
    }
}
