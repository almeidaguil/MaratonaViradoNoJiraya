package orientacaoAObjetos.FmodificadorEstatico.teste;

import orientacaoAObjetos.FmodificadorEstatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 310);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

       // carro1.setVelicidadeLimite(180);//muda para todos os carros, pois é do tipo static
        Carro.velicidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
