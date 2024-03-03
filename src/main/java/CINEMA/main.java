
package CINEMA;


public class main {
    public static void main(String[] args) {
       
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaqPipoca maquinaDePipoca = new MaqPipoca();
        Projetor projetor = new Projetor();
        Player player = new Player();
        Telao telao = new Telao();

        
        CinematecaFachada cinemateca = new CinematecaFachada(amplificador, luzes, maquinaDePipoca, projetor, player, telao);

        // Assistindo um filme
        cinemateca.assistirFilme("MATRIX");

        
        cinemateca.fimDoFilme();
    }
}

