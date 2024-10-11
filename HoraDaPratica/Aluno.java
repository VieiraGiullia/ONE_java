package ONE_java.HoraDaPratica;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacao(){
        System.out.println("\nInformações do aluno");
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Rafael";
        aluno1.idade = 15;

        aluno1.exibeInformacao();

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Alyson";
        aluno2.idade = 16;

        aluno2.exibeInformacao();
    }
}
