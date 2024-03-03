
package Proxy;


public class main {
    public static void main(String[] args) {
        // Criando um proxy para a imagem
        Imagem imagemProxy = new ProxyImagem("imagem123.jpeg");

        // A imagem ainda não foi carregada
        System.out.println("Antes de chamar exibirImagem:");
        imagemProxy.exibirImagem();
        System.out.println("Depois de chamar exibirImagem:");

        // A imagem é carregada no proxy e exibida
        imagemProxy.exibirImagem();
    }
}