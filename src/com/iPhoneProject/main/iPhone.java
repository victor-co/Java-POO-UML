package com.iPhoneProject.main;
import com.iPhoneProject.Funcionalidades.AparelhoTelefonico;
import com.iPhoneProject.Funcionalidades.NavegadorInternet;
import com.iPhoneProject.Funcionalidades.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador");
    }

    @Override
    public void ligar() {
        System.out.println("Realizando Chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada Telefônica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Música");
    }
}
