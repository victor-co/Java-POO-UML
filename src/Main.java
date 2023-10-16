import com.iPhoneProject.main.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        System.out.println(" ----- Realizando Chamada -----");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("----------- Música -----------");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("----- Navegador de Internet -----");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
