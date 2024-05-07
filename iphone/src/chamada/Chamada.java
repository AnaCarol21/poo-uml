package chamada;

public class Chamada implements Telefone{
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Alô? Alguem na escuta?");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Encaminhando para caixa postal...");
    }
}
