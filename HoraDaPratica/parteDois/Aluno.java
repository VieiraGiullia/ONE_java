package HoraDaPratica.parteDois;

import java.util.Scanner;

public class Aluno {
    // atributos privados nome e notas
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota1;
    }
    public void setNota(double nota) {
        this.nota1 = nota;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota4() {
        return nota4;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public void exibeAluno(String alunoInfo) {
        alunoInfo = "Nome do aluno: " + nome;
        System.out.println(alunoInfo);
    }

    public void pegaNota() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da 1° nota: ");
        this.nota1 = sc.nextDouble();

        System.out.println("Digite o valor da 2° nota: ");
        this.nota2 = sc.nextDouble();

        System.out.println("Digite o valor da 3° nota: ");
        this.nota3 = sc.nextDouble();

        System.out.println("Digite o valor da 4° nota: ");
        this.nota4 = sc.nextDouble();

        sc.close();
    }

    //  método calcularMedia que retorna a média das notas do aluno
    public void calcularMedia(double media) {
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Media: " + media);
    }

    // teste ok
}
