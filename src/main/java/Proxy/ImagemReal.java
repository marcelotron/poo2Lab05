
package Proxy;


public class ImagemReal implements Imagem {
    private String nome;

    public ImagemReal(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirImagem() {
        System.out.println("Carregando e exibindo a imagem: " + nome);
    }
}

