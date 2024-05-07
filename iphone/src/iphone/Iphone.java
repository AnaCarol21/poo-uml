package iphone;

import chamada.Telefone;
import internet.Navegador;
import ipod.ReprodutorMusica;

public class Iphone implements Telefone, Navegador, ReprodutorMusica{

    @Override
    public void tocar() {
        System.out.println("Tocando musica via iphone.");        
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada via iphone.");        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica via iphone.");        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página via iphone.");        
    }

    @Override
    public void adicinarNovaAba() {
        System.out.println("Adicionando página via iphone.");        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página via iphone.");        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via iphone...");        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via iphone.");        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Encaminhando para caixa postal via iphone");        
    }
    
}
