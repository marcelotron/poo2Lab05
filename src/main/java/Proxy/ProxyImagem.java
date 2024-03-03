
package Proxy;


public class ProxyImagem implements Imagem {
    private Imagem imagemReal;
    private String nome;

    public ProxyImagem(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirImagem() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(nome);
            System.out.println("Imagem carregada no proxy: " + nome);
        }
        imagemReal.exibirImagem();
    }
}
