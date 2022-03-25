package orientacaoAObjetos.AintroducaoAClasses.teste;

import orientacaoAObjetos.AintroducaoAClasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Focus";
        carro1.modelo = "Luxe";
        carro1.ano = 2022;

        carro2.nome = "Civic";
        carro2.modelo = "GTS";
        carro2.ano = 2018;

        System.out.println("Primeiro carro:");
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Segundo carro:");
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
