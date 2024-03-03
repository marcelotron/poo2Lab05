
package CARRO;


public class FachadaCarro {
    private Motor motor;
    private CintoSeguranca cintoSeguranca;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public FachadaCarro() {
        motor = new Motor();
        cintoSeguranca = new CintoSeguranca();
        porta = new Porta();
        farol = new Farol();
        radio = new Radio();
    }

    public void dirigirCarro() {
        motor.ligar();
        porta.trancar();
        cintoSeguranca.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacaoPreferida();
    }

    public void finalizarCorrida() {
        motor.desligar();
        porta.destrancar();
        cintoSeguranca.destravar();
        farol.apagar();
        radio.desligar();
    }
}
