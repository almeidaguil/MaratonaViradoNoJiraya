package orientacaoAObjetos.Hheranca.teste;

import orientacaoAObjetos.Hheranca.dominio.Funcionario;

public class HernacaTest02 {
    public static void main(String[] args) {
        /* 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar a classe pai
           1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carregar a classe filha
           2 - Alocado espaço de memoria para objeto da classe pai
           3 - Cada atributo de classe criado é inicializado com valores default ou o que for passado da classe pai
           4 - Bloco de inicialização da superclasse é executado na ordem que aparece
           5 - Construtor é executado da superclasse
           6 - Alocado espaço de memoria para objeto da subclasse
           7 - Cada atributo da subclasse criado é inicializado com valores default ou o que for passado da classe filha
           8 - Bloco de inicialização da subclasse é executado na ordem que aparece
           9 - Construtor é executado da subclasse

         */
        Funcionario funcionario = new Funcionario("Guilherme A.");
    }
}
