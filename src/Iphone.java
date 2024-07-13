public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {
    public static void main(String[] args) {
		Iphone iphone = new Iphone();
        System.out.println("===========================================");

        iphone.ligar("51 913213-4335");
        iphone.atender();     
        iphone.iniciarCorreioVoz();

        System.out.println("===========================================");

        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("===========================================");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Evanescence - Bring Me to Life");

    }

  
    @Override
	public void atender(){
        System.out.println("Atendendo Chamada");
    }
    @Override
	public void iniciarCorreioVoz(){
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("O endereço é: " + url);
    }
    @Override
	public void adicionarNovaAba(){
        System.out.println("Adicionando uma nova aba");
    }
    @Override
	public void atualizarPagina(){
        System.out.println("Atualizando a Pagina");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando a musica");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando a musica");
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando a musica desejada: " + musica);
    }
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

}
