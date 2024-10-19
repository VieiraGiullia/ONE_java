// O encapsulmento é um tipo de organização que protege os dados e metodos do código 
// e a forma usada para proteger são com palavras chaves - modificadores de acesso - que definem o nível de VISIBILIDADE das classes, atributos e metodos, ajudando a garantir o encapsulamento e segurança do código

// exemplos

// public -  é o mais permissivo de todos, podendo ser acessado por qualquer classe em qualquer pacote
/*public class Conta {

    public double saldo;
  
    public void sacar(double valor) {
      // lógica de saque...
    }
}

public class Principal {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }

}

// Default - não especifica nenhum modificador de acesso, então ele só pode ser acessado apenas pelas classes que estão no mesmo pacote

/* 
package br.com.alura.conta;

public class Conta {

> default double saldo;

> default void sacar(double valor) {
    // lógica de saque...
  }
}

package br.com.alura.testes;

public class Principal {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }

}
*/

// Private - é o mais restritivo de todos, pois ele só pode ser acessado dentro da própria classe

/*
 
public class Conta {

  private double saldo;

  private void sacar(double valor) {
    // lógica de saque...
  }
}

public class Principal {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }

}

assim daria erro de compilação pois o atributo saldo e o metodo sacar são private - declarados como
 */