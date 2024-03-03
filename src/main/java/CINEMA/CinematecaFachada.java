
package CINEMA;


public class CinematecaFachada {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaqPipoca maquinaDePipoca;
    private Projetor projetor;
    private Player player;
    private Telao telao;

    public CinematecaFachada(Amplificador amplificador, Luzes luzes, MaqPipoca maquinaDePipoca, Projetor projetor, Player player, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.maquinaDePipoca = maquinaDePipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        maquinaDePipoca.ligar();
        maquinaDePipoca.arrebentarPipoca();
        luzes.desligar();
        telao.abaixar();
        projetor.ligar();
        amplificador.liga();
        amplificador.ajusteDeVolume(10);
        player.ligar();
        player.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("Desligando o sistema...");
        maquinaDePipoca.ligar(); // proxima sessão, então já deixa ligada
        luzes.ligar(); 
        telao.subir(); 
        projetor.desligar(); 
        amplificador.desligar();
        player.desligar();
    }
}

