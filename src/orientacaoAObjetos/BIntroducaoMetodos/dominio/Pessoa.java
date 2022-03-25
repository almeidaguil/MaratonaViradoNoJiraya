package orientacaoAObjetos.BIntroducaoMetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }
    //sempre que está criando um metodo para colocar valor dentr de um atributo usa-se a palavra SET
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
//atributos do tipo private só podem ser acessados pelo objeto