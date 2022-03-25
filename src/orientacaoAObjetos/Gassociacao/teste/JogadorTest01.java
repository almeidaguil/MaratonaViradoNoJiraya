package orientacaoAObjetos.Gassociacao.teste;

import orientacaoAObjetos.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador0 = new Jogador("Pelé");
        Jogador jogador1 = new Jogador("Romario");
        Jogador jogador2 = new Jogador("Zico");
        Jogador[] jogadores = {jogador0, jogador1, jogador2};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
