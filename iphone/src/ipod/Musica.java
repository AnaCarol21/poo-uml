package ipod;

public class Musica implements ReprodutorMusica {
    public void tocar(){
        System.out.println("Tocando musica.");

    }
    public void pausar(){
        System.out.println("Musica pausada.");

    }
    public void selecionarMusica(){
        System.out.println("Selecionando musica.");
    }
}
