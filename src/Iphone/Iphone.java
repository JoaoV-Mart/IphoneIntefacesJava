package Iphone;

import Iphone.SistemaPrincipal.SistemaPrincipal;

public class Iphone extends SistemaPrincipal {
    public static void main(String[] args) {
        SistemaPrincipal iphone = new SistemaPrincipal();
        iphone.tocar();
        iphone.pausar();
        iphone.discar();
        iphone.atender();
        iphone.abrirCorreioDeVoz();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
