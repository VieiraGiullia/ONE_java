package HoraDaPratica.parteQuatro;

import java.util.ArrayList;

import HoraDaPratica.parteQuatro.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Giullia");
        pessoa.setIdade(19);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Giovanna");
        pessoa1.setIdade(12);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Davi");
        pessoa2.setIdade(15);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        System.out.println("Há " + pessoas.size() + " pessoas cadastadras!");
        System.out.println(pessoas.get(0).getNome() + " foi o primeiro cadsatrado!");
        for (int i = 0; i < pessoas.size(); i++) {
	        System.out.println(pessoas.get(i).toString());
        }
    }
}
